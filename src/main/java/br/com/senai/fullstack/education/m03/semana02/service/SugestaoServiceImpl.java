package br.com.senai.fullstack.education.m03.semana02.service;

import br.com.senai.fullstack.education.m03.semana02.configs.exceptions.NaoEncontradoException;
import br.com.senai.fullstack.education.m03.semana02.entity.Sugestao;
import br.com.senai.fullstack.education.m03.semana02.repository.SugestaoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SugestaoServiceImpl implements SugestaoService {

  private final SugestaoRepository repositorio;

  @Override
  public Sugestao criar(Sugestao sugestao) {
    log.info("Salvando novo sugestão: {}", sugestao);
    return repositorio.save(sugestao);
  }

  @Override
  public List<Sugestao> buscarTodos(String titulo) {
    log.info("Buscando sugestão pelo titulo: {}", titulo);
    if (StringUtils.isBlank(titulo)) {
      titulo = "";
    }
    return repositorio.findByTituloContainingIgnoreCaseOrderByDataAtualizacaoDesc(titulo);
  }

  @Override
  public Sugestao buscarPorId(Long id) {
    log.info("Buscando sugestão pelo Id: {}", id);
    return repositorio.findById(id).orElseThrow(
      () -> new NaoEncontradoException("Sugestão não encontrada com ID: " + id)
    );
  }

}
