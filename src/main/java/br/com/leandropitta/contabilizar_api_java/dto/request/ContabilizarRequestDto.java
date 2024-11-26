package br.com.leandropitta.contabilizar_api_java.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContabilizarRequestDto {
    private OffsetDateTime ultimoStatus;
    private String status;
}
