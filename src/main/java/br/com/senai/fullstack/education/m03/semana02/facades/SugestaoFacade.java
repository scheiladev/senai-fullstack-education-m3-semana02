package br.com.senai.fullstack.education.m03.semana02.facades;

import br.com.senai.fullstack.education.m03.semana02.dto.ComentarioRequestDto;
import br.com.senai.fullstack.education.m03.semana02.dto.ComentarioResponseDto;
import br.com.senai.fullstack.education.m03.semana02.dto.SugestaoRequestDto;
import br.com.senai.fullstack.education.m03.semana02.dto.SugestaoResponseDto;

import java.util.List;

public interface SugestaoFacade {
    SugestaoResponseDto criar(SugestaoRequestDto dto);

    List<SugestaoResponseDto> buscarTodos(String titulo);

    SugestaoResponseDto buscarPorId(Long id);

    ComentarioResponseDto criarComentario(Long id, ComentarioRequestDto dto);
}
