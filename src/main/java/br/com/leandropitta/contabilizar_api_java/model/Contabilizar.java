package br.com.leandropitta.contabilizar_api_java.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "contabilizar")
@Data
public class Contabilizar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dataefetiva")
    private LocalDateTime dataEfetiva;

    @Column(name = "ultimostatus")
    private LocalDateTime ultimoStatus;

    private Double credito;

    private Double debito;

    private String status;
}
