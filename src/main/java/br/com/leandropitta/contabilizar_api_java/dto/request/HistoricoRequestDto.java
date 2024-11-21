package br.com.leandropitta.contabilizar_api_java.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoricoRequestDto {
    private Long id;
    private String historico;
    private String funcionario;
}
