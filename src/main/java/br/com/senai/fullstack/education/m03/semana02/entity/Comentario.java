package br.com.senai.fullstack.education.m03.semana02.entity;

import br.com.senai.fullstack.education.m03.semana02.dto.ComentarioRequestDto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "comentarios")
public class Comentario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private LocalDateTime dataEnvio = LocalDateTime.now();

  @ManyToOne
  @JoinColumn(name = "sugestao_id", nullable = false)
  private Sugestao sugestao;

  @Column(nullable = false, length = 512)
  private String texto;

  public Comentario(ComentarioRequestDto dto) {
    BeanUtils.copyProperties(dto, this);
  }
}
