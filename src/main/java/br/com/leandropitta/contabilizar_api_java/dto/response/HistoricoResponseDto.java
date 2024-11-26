package br.com.leandropitta.contabilizar_api_java.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoricoResponseDto {
    private Integer id;
    private String historico;
    private OffsetDateTime dataHistorico;
    private String funcionario;
}
