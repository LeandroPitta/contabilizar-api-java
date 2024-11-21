package br.com.leandropitta.contabilizar_api_java.service;

import br.com.leandropitta.contabilizar_api_java.dto.request.HistoricoRequestDto;
import br.com.leandropitta.contabilizar_api_java.dto.response.HistoricoResponseDto;
import br.com.leandropitta.contabilizar_api_java.model.Historico;
import br.com.leandropitta.contabilizar_api_java.repository.HistoricoRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HistoricoService {

    private HistoricoRepository repository;
    private ModelMapper modelMapper;

    public List<HistoricoResponseDto> findAllById(Long id) {
        return repository.findAllById(id).stream()
                .map(historico -> modelMapper.map(historico, HistoricoResponseDto.class))
                .collect(Collectors.toList());
    }

    public HistoricoResponseDto save(HistoricoRequestDto historicoDto) {
        try {
            repository.insertHistorico(historicoDto.getId(), historicoDto.getHistorico(), historicoDto.getFuncionario());

            return HistoricoResponseDto.builder()
                    .message("Registro de histórico inserido com sucesso")
                    .maxRegistro(0)
                    .success(1)
                    .build();
        } catch (Exception e) {
            if (e.getMessage().contains("Maximo de registros atingido")) {
                return HistoricoResponseDto.builder()
                        .maxRegistro(1)
                        .success(0)
                        .build();
            } else {
                throw new RuntimeException("Erro ao inserir registro de histórico no banco de dados", e);
            }
        }
    }
}
