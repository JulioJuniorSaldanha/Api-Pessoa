/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Attornatus.apiPessoa.dto;

import com.Attornatus.apiPessoa.domain.Endereco;
import com.Attornatus.apiPessoa.domain.Pessoa;

/**
 *
 * @author JúlioSaldanha
 */
public class PessoaDTO {
    private int idPessoa;
    private String nome;    
    private String dataDeNascimento;
    private Endereco endereco;

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
   


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public PessoaDTO(String nome, String dataDeNascimento, Endereco Endereco) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = Endereco;

    }
    public PessoaDTO(int id,String nome, String dataDeNascimento, Endereco Endereco) {
        this.idPessoa =id;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = Endereco;

    }
    public PessoaDTO(PessoaDTO pessoa) {
        this.nome = pessoa.getNome();
        this.dataDeNascimento = pessoa.getDataDeNascimento();
        this.endereco = pessoa.getEndereco();
    }

    public PessoaDTO(int idPessoa, String nome, String dataDeNascimento) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public PessoaDTO() {
    }
}
