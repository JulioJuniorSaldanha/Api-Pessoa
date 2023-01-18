package com.Attornatus.apiPessoa.domain;

import com.Attornatus.apiPessoa.dto.PessoaDTO;
import jakarta.persistence.*;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String dataDeNascimento;


    public Pessoa(PessoaDTO dto) {

        this.nome = dto.getNome();
        this.dataDeNascimento = dto.getDataDeNascimento();

    }
    public Pessoa(int id, String nome, String datadeNascimento,Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.dataDeNascimento = datadeNascimento;

    }

    public Pessoa() {
        this.id = 0;
        this.nome = null;
        this.dataDeNascimento = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}
