package com.example.mlembankbe.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_TABLE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTable {
    @Id
    private Long id;
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private Float saldo;
}

