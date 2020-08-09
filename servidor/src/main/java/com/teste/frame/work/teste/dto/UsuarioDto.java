package com.teste.frame.work.teste.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDto {
    private @NotNull String nome;
    private @NotNull String email;
    private @NotNull String senha;
}
