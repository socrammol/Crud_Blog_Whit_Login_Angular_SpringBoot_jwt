package com.teste.frame.work.teste.service;

import com.teste.frame.work.teste.dto.UsuarioDto;
import com.teste.frame.work.teste.errors.ObjectErrorException;
import com.teste.frame.work.teste.errors.ObjectNotFoundException;
import com.teste.frame.work.teste.model.UserModel;
import com.teste.frame.work.teste.repository.UserRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;

@Service
public class UserSerice {
    @Autowired
    UserRepository userRepository;

    public Object createUser(UsuarioDto user) {
        Iterable<UserModel> usuarios = userRepository.findAll();
        for (UserModel interator:usuarios) {
            if(interator.getEmail().equals(user.getEmail())){
                throw new ObjectNotFoundException("Email ja cadastrado");
            }
        }
        UserModel usuario = criaUsuario(user);
        return userRepository.save(usuario);
    }

    private UserModel criaUsuario(UsuarioDto user) {
        UserModel usuario = new UserModel();
        usuario.setEmail(user.getEmail());
        usuario.setSenha(user.getSenha());
        usuario.setNome(user.getNome());
        return usuario;
    }
}
