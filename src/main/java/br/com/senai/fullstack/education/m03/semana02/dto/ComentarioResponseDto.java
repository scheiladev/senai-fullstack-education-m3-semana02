package br.com.senai.fullstack.education.m03.semana02.dto;

import br.com.senai.fullstack.education.m03.semana02.entity.Comentario;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Data
@Schema(description = "Comentários: Objeto de resposta")
public class ComentarioResponseDto {

    @Schema(description = "ID do comentário", example = "1")
    private Long id;

    @Schema(description = "Data em que o comentário foi enviado")
    private LocalDateTime dataEnvio;

    @Schema(description = "Texto do comentário", example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
    private String texto;

    public ComentarioResponseDto(Comentario comentario) {
        BeanUtils.copyProperties(comentario, this);
    }
}
