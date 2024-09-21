package br.com.senai.fullstack.education.m03.semana02.repository;

import br.com.senai.fullstack.education.m03.semana02.entity.Sugestao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SugestaoRepository extends JpaRepository<Sugestao, Long> {

  List<Sugestao> findByOrderByDataAtualizacaoDesc();
  List<Sugestao> findByTituloContainingIgnoreCaseOrderByDataAtualizacaoDesc(String titulo);
}
