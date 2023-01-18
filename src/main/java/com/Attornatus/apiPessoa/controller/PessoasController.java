/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Attornatus.apiPessoa.controller;


import com.Attornatus.apiPessoa.Repositories.IEnderecoRepository;
import com.Attornatus.apiPessoa.Repositories.IPessoaRepository;
import com.Attornatus.apiPessoa.domain.Endereco;
import com.Attornatus.apiPessoa.domain.Pessoa;
import com.Attornatus.apiPessoa.dto.EnderecoDTO;
import com.Attornatus.apiPessoa.dto.PessoaDTO;
import com.Attornatus.apiPessoa.service.PessoaServices;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author jbob1
 */

@Controller
@RequestMapping(value = "/Pessoas", produces = MediaType.APPLICATION_JSON_VALUE)
public class PessoasController {
     
    @Autowired
    private IPessoaRepository pessoaRepository;
    @Autowired
    private IEnderecoRepository enderecoRepository;
    
    @Autowired
   private PessoaServices pessoaService;
   
   @PostMapping
   @ResponseBody
   public PessoaDTO create(@RequestBody PessoaDTO pessoa){
        pessoaService.criar(pessoa);
        Pessoa p = new Pessoa(pessoa);
        pessoaRepository.save(p);

        Endereco e = new Endereco(pessoa);
        enderecoRepository.save(e);


       return pessoa;
   }
   
  
   @PutMapping("/{pessoaId}")
   @ResponseBody
   public PessoaDTO update(@PathVariable("pessoaId") int pessoaId,
                           @RequestBody PessoaDTO pessoa){
            //   PessoaDTO p = pessoa
       return pessoaService.atualizar(pessoa, pessoaId);
   }
   
   @GetMapping("/{pessoaId}")
   @ResponseBody
   public PessoaDTO getById(@PathVariable("pessoaId") int pessoaId){
   Optional<Pessoa> p = pessoaRepository.findById(pessoaId);

   if(enderecoRepository.findAllById(Collections.singleton(pessoaId)).contains(pessoaId)){
       List<Endereco> e = enderecoRepository.findAllById(Collections.singleton(pessoaId));
       PessoaDTO pd = new PessoaDTO(p.get().getId(),p.get().getNome(),p.get().getDataDeNascimento(),e.get(0));
       return pd;
   }
   PessoaDTO pe = new PessoaDTO(p.get().getId(),p.get().getNome(),p.get().getDataDeNascimento());
   return pe;


   }
   
   @GetMapping
   @ResponseBody
   public List<Pessoa> getAll(){
      List<Pessoa> p = pessoaRepository.findAll();
       return p;
   }
   
   @DeleteMapping("/{pessoaId}")
   @ResponseBody
   public String delete(@PathVariable("pessoaId") int id){
       pessoaRepository.deleteById(id);
       enderecoRepository.deleteById(id);
       return pessoaService.delete(id);
   }
   
   
}
    

