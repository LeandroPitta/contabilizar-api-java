package br.com.leandropitta.contabilizar_api_java.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "historico")
@Data
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String historico;

    @Column(name = "datahistorico")
    private LocalDateTime dataHistorico;

    private String funcionario;
}
