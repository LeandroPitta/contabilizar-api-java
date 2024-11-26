package br.com.leandropitta.contabilizar_api_java.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;

@Entity
@Table(name = "contabilizar")
@Data
public class Contabilizar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dataefetiva")
    private OffsetDateTime dataEfetiva;

    @Column(name = "ultimostatus")
    private OffsetDateTime ultimoStatus;

    private Double credito;

    private Double debito;

    private String status;
}
