/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Attornatus.apiPessoa.dto;

/**
 *
 * @author jbob1
 */
public class EnderecoDTO {
    private int idPessoa;
    private String cidade;
    private String logradouro;
    private int cep;
    private int numero;


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public EnderecoDTO(int idPessoa,String cidade, String logradouro, int cep, int numero) {
        this.idPessoa= idPessoa;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
}