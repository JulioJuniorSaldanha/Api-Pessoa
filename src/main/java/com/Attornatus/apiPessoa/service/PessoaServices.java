/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Attornatus.apiPessoa.service;

import com.Attornatus.apiPessoa.dto.PessoaDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author jbob1
 */
@Service
public class PessoaServices {
     private static final Map<Integer, PessoaDTO> pessoas = new HashMap<>();
    
    public PessoaDTO criar(PessoaDTO pessoa){
        pessoas.put(0,pessoa);
        return pessoa;
    }
    
    public PessoaDTO atualizar(PessoaDTO pessoa, int id){
        pessoas.put(id, pessoa);
        return pessoa;
        
    }
    
    public PessoaDTO getById(int id){
        return pessoas.get(id);
    }
    
    public List<PessoaDTO> getAll(){
        return new ArrayList<>(pessoas.values());        
    }
    
    public String delete(long id){
        pessoas.remove(id);
        return "Pessoa deletada";
    }
    
}
