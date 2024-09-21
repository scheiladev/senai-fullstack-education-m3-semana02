package br.com.senai.fullstack.education.m03.semana02.service;

import br.com.senai.fullstack.education.m03.semana02.entity.Comentario;
import br.com.senai.fullstack.education.m03.semana02.repository.ComentarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ComentarioServiceImpl implements ComentarioService {

  private final ComentarioRepository repositorio;

  @Override
  public Comentario criar(Comentario comentario) {
    log.info("Salvando novo comentario: {}", comentario);
    return repositorio.save(comentario);
  }

  @Override
  public List<Comentario> buscarPorSugestaoId(Long sugestaoId) {
    log.info("Buscando comentarios de sugestão com Id: {}", sugestaoId);
    return repositorio.findBySugestaoIdOrderByDataEnvioDesc(sugestaoId);
  }

}
