package com.mysql.jpa.enity;

import jakarta.persistence.*;

@Entity

@Table(name = "tb_pulhas")
public class jpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private int idade;
    private String sexo;

}
