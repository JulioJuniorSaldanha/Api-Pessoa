package com.Attornatus.apiPessoa.domain;


import com.Attornatus.apiPessoa.dto.PessoaDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Endereco {

    @Id
    private int idPessoa;
    private String cidade;
    private String logradouro;
    private int cep;
    private int numero;


    public Endereco(String cidade, String logradouro, int cep, int numero) {
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
    }

    public Endereco(PessoaDTO dto) {
        this.idPessoa=dto.getEndereco().getIdPessoa();
        this.cidade = dto.getEndereco().getCidade();
        this.logradouro = dto.getEndereco().getLogradouro();
        this.cep = dto.getEndereco().getCep();
        this.numero = dto.getEndereco().getNumero();
    }

    public Endereco() {
        this.idPessoa=0;
        this.cidade = "";
        this.logradouro = "";
        this.cep = 0;
        this.numero = 0;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
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


}
