package br.com.fiap.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.challenge.model.ClimaMes;

public interface RegiaoRelevoRepository extends JpaRepository<ClimaMes, Integer>{

}