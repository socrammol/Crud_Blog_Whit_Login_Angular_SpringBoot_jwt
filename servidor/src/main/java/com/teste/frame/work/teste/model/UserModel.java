package com.teste.frame.work.teste.model;
import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
@Entity
@Data
@NoArgsConstructor
public class UserModel {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String nome;
    private @NonNull String email;
    private @NonNull String senha;
}
