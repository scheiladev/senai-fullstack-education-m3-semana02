package br.com.senai.fullstack.education.m03.semana02.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

@Schema(description = "Comentários: Objeto para criação")
public record ComentarioRequestDto(

    @NotBlank
    @Schema(description = "Texto do comentário", example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
    String texto

){}
