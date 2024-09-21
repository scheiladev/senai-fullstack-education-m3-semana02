package br.com.senai.fullstack.education.m03.semana02.dto;

import br.com.senai.fullstack.education.m03.semana02.entity.Comentario;
import br.com.senai.fullstack.education.m03.semana02.entity.Sugestao;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Schema(description = "Sugestões: Objeto de resposta")
public class SugestaoResponseDto {

    @Schema(description = "ID da sugestão", example = "1")
    private Long id;

    @Schema(description = "Data em que a sugestão foi enviada")
    private LocalDateTime dataEnvio;

    @Schema(description = "Data em que a sugestão foi atualizada")
    private LocalDateTime dataAtualizacao;

    @Schema(description = "Título da sugestão", example = "Lorem ipsum dolor.")
    private String titulo;

    @Schema(description = "Descrição da sugestão", example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
    private String descricao;

    @Schema(description = "Comentários da sugestão")
    private List<ComentarioResponseDto> comentarios;

    public SugestaoResponseDto(Sugestao sugestao) {
        BeanUtils.copyProperties(sugestao, this);
    }

    public SugestaoResponseDto(Sugestao sugestao, List<Comentario> comentarios) {
        this(sugestao);
        this.comentarios = comentarios.stream().map(ComentarioResponseDto::new).toList();
    }
}
