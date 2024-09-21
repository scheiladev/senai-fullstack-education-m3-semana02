package br.com.senai.fullstack.education.m03.semana02.service;

import br.com.senai.fullstack.education.m03.semana02.entity.Comentario;

import java.util.List;

public interface ComentarioService {

  Comentario criar(Comentario comentario);

  List<Comentario> buscarPorSugestaoId(Long sugestaoId);

}
