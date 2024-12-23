package br.com.leandropitta.contabilizar_api_java.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Table(name = "historico")
@Data
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "historicoid")
    private Integer historicoId;

    private Integer id;

    private String historico;

    @Column(name = "datahistorico")
    private OffsetDateTime dataHistorico;

    private String funcionario;
}
