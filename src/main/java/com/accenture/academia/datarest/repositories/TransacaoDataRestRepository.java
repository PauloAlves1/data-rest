package com.accenture.academia.datarest.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.accenture.academia.datarest.entities.Transacao;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "transacoes", itemResourceRel = "transacao", path = "transacao")
public interface TransacaoDataRestRepository extends PagingAndSortingRepository<Transacao, Long>{
}
