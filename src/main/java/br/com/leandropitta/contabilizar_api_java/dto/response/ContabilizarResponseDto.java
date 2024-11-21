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
public class ContabilizarResponseDto {
    private Long id;
    private LocalDateTime dataEfetiva;
    private LocalDateTime ultimoStatus;
    private Double credito;
    private Double debito;
    private String status;
}
