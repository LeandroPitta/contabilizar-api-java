package br.com.leandropitta.contabilizar_api_java.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoricoResponseDto {
    private Long id;
    private String historico;
    private LocalDateTime dataHistorico;
    private String funcionario;
    private String message;
    private int maxRegistro;
    private int success;
}
