package br.com.senai.fullstack.education.m03.semana02.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(description = "Objeto de erro padrão")
public class ErroDto {

    @Schema(description = "Classe do erro apresentado", example = "NaoEncontradoException")
    private String erro;

    @Schema(description = "Código do erro", example = "404")
    private String codigo;

    @Schema(description = "Mensagem de erro", example = "Não encontrado")
    private String mensagem;

}
