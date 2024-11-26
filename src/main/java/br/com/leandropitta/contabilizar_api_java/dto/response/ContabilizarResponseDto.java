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
public class ContabilizarResponseDto {
    private Integer id;
    private OffsetDateTime dataEfetiva;
    private OffsetDateTime ultimoStatus;
    private Double credito;
    private Double debito;
    private String status;
}
