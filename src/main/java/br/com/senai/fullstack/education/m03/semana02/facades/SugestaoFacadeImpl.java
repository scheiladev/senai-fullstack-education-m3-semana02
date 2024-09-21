package br.com.senai.fullstack.education.m03.semana02.facades;

import br.com.senai.fullstack.education.m03.semana02.dto.ComentarioRequestDto;
import br.com.senai.fullstack.education.m03.semana02.dto.ComentarioResponseDto;
import br.com.senai.fullstack.education.m03.semana02.dto.SugestaoRequestDto;
import br.com.senai.fullstack.education.m03.semana02.dto.SugestaoResponseDto;
import br.com.senai.fullstack.education.m03.semana02.entity.Comentario;
import br.com.senai.fullstack.education.m03.semana02.entity.Sugestao;
import br.com.senai.fullstack.education.m03.semana02.service.ComentarioService;
import br.com.senai.fullstack.education.m03.semana02.service.SugestaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SugestaoFacadeImpl implements SugestaoFacade {

    private final SugestaoService servico;
    private final ComentarioService comentarioServico;

    @Override
    public SugestaoResponseDto criar(SugestaoRequestDto dto) {
        Sugestao sugestao = new Sugestao(dto);
        servico.criar(sugestao);
        return new SugestaoResponseDto(sugestao);
    }

    @Override
    public List<SugestaoResponseDto> buscarTodos(String titulo) {
        return servico.buscarTodos(titulo).stream().map(SugestaoResponseDto::new).toList();
    }

    @Override
    public SugestaoResponseDto buscarPorId(Long id) {
        Sugestao sugestao = servico.buscarPorId(id);
        List<Comentario> comentarios = comentarioServico.buscarPorSugestaoId(id);
        return new SugestaoResponseDto(sugestao, comentarios);
    }

    @Override
    public ComentarioResponseDto criarComentario(Long id, ComentarioRequestDto dto) {
        Sugestao sugestao = servico.buscarPorId(id);

        Comentario comentario = new Comentario(dto);
        comentario.setSugestao(sugestao);
        comentarioServico.criar(comentario);

        sugestao.setDataAtualizacao(LocalDateTime.now());
        servico.criar(sugestao);

        return new ComentarioResponseDto(comentario);
    }
}
