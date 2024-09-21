package br.com.senai.fullstack.education.m03.semana02.entity;

import br.com.senai.fullstack.education.m03.semana02.dto.SugestaoRequestDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "sugestoes")
public class Sugestao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private LocalDateTime dataEnvio = LocalDateTime.now();

  @Column(nullable = false)
  private LocalDateTime dataAtualizacao = LocalDateTime.now();

  @Column(nullable = false)
  private String titulo;

  @Column(length = 512)
  private String descricao;

  public Sugestao(SugestaoRequestDto dto) {
    BeanUtils.copyProperties(dto, this);
  }

}
