package br.com.leandropitta.contabilizar_api_java.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoricoPostResponseDto {

    private String message;
    private Integer maxRegistro;
    private Integer success;
}
