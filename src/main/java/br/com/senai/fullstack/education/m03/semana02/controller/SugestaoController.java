package br.com.senai.fullstack.education.m03.semana02.controller;

import br.com.senai.fullstack.education.m03.semana02.dto.ComentarioRequestDto;
import br.com.senai.fullstack.education.m03.semana02.dto.ComentarioResponseDto;
import br.com.senai.fullstack.education.m03.semana02.dto.SugestaoRequestDto;
import br.com.senai.fullstack.education.m03.semana02.dto.SugestaoResponseDto;
import br.com.senai.fullstack.education.m03.semana02.facades.SugestaoFacade;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("sugestoes")
public class SugestaoController {

  private final SugestaoFacade facade;

  @GetMapping
  public List<SugestaoResponseDto> get(
    @Parameter(description = "Perquisar por título (que contenha o valor: `%{valor}%`)")
    @RequestParam(required = false) String titulo
  ) {
    log.info("GET /sugestoes -> Begin");
    List<SugestaoResponseDto> res = facade.buscarTodos(titulo);

    log.info("GET /sugestoes -> End");
    return res;
  }

  @GetMapping("{id}")
  public SugestaoResponseDto getId(
    @Parameter(description = "ID da sugestão")
    @PathVariable Long id
  ) {
    log.info("GET /sugestoes/{} -> Begin", id);
    SugestaoResponseDto res = facade.buscarPorId(id);

    log.info("GET /sugestoes/{} -> End", id);
    return res;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public SugestaoResponseDto post(@Valid @RequestBody SugestaoRequestDto dto) {
    log.info("POST /sugestoes -> Begin");
    SugestaoResponseDto res = facade.criar(dto);

    log.info("POST /sugestoes -> End");
    return res;

  }

  @PostMapping("{id}/comentarios")
  public ComentarioResponseDto postComentario(
    @Parameter(description = "ID da sugestão")
    @PathVariable Long id,
    @Valid @RequestBody ComentarioRequestDto dto
  ) {
    log.info("POST /sugestoes/{}/comentarios -> Begin", id);
    ComentarioResponseDto res = facade.criarComentario(id, dto);

    log.info("POST /sugestoes/{}/comentarios -> End", id);
    return res;
  }
}