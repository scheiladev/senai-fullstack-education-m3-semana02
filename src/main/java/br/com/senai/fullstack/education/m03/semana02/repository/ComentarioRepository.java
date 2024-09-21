package br.com.senai.fullstack.education.m03.semana02.repository;

import br.com.senai.fullstack.education.m03.semana02.entity.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>  {

  List<Comentario> findBySugestaoIdOrderByDataEnvioDesc(Long sugestaoId);

}
