package br.com.senai.fullstack.education.m03.semana02.service;

import br.com.senai.fullstack.education.m03.semana02.entity.Sugestao;

import java.util.List;

public interface SugestaoService {

  Sugestao criar(Sugestao sugestao);

  List<Sugestao> buscarTodos(String titulo);

  Sugestao buscarPorId(Long id);

}
