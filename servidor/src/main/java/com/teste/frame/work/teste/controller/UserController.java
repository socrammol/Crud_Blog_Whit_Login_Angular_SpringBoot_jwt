package com.teste.frame.work.teste.controller;

import com.teste.frame.work.teste.dto.UsuarioDto;
import com.teste.frame.work.teste.service.UserSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:4200  " }, allowCredentials = "true")
public class UserController {
    @Autowired
    UserSerice userService;

    @PostMapping("/criausuario")
    public Object  criaUsuario(@RequestBody UsuarioDto user){
        return userService.createUser(user);
    }
}
