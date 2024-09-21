package br.com.senai.fullstack.education.m03.semana02.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Sugestões: Objeto para criação")
public record SugestaoRequestDto(

    @NotBlank
    @Schema(description = "Título da sugestão", example = "Lorem ipsum dolor.")
    String titulo,

    @Schema(description = "Descrição da sugestão", example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
    String descricao

){}
