package br.com.leandropitta.contabilizar_api_java.service;

import br.com.leandropitta.contabilizar_api_java.dto.request.HistoricoRequestDto;
import br.com.leandropitta.contabilizar_api_java.dto.response.HistoricoPostResponseDto;
import br.com.leandropitta.contabilizar_api_java.dto.response.HistoricoResponseDto;
import br.com.leandropitta.contabilizar_api_java.model.Historico;
import br.com.leandropitta.contabilizar_api_java.repository.HistoricoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class HistoricoService {

    private HistoricoRepository repository;
    private ModelMapper modelMapper;

    public List<HistoricoResponseDto> findAllById(Integer id) {
        List<Historico> historicos = repository.findAllById(id);
        log.debug("Registros encontrados: {}", historicos);

        return historicos.stream()
                .map(historico -> {
                    HistoricoResponseDto dto = modelMapper.map(historico, HistoricoResponseDto.class);
                    log.debug("DTO mapeado: {}", dto);
                    return dto;
                })
                .collect(Collectors.toList());
    }

    public HistoricoPostResponseDto save(HistoricoRequestDto historicoDto) {
        try {
            repository.insertHistorico(historicoDto.getId(), historicoDto.getHistorico(), historicoDto.getFuncionario());

            return HistoricoPostResponseDto.builder()
                    .message("Registro de histórico inserido com sucesso")
                    .maxRegistro(0)
                    .success(1)
                    .build();
        } catch (Exception e) {
            if (e.getMessage().contains("Maximo de registros atingido")) {
                return HistoricoPostResponseDto.builder()
                        .maxRegistro(1)
                        .success(0)
                        .build();
            } else {
                throw new RuntimeException("Erro ao inserir registro de histórico no banco de dados", e);
            }
        }
    }
}
