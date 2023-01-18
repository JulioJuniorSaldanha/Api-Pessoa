package com.Attornatus.apiPessoa.Repositories;

import com.Attornatus.apiPessoa.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPessoaRepository extends JpaRepository<Pessoa,Integer> {
}
