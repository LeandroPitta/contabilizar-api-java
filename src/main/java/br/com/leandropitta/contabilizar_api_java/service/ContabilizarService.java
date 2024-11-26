package br.com.leandropitta.contabilizar_api_java.service;

import br.com.leandropitta.contabilizar_api_java.dto.response.ContabilizarResponseDto;
import br.com.leandropitta.contabilizar_api_java.dto.response.UpdateStatusResponseDto;
import br.com.leandropitta.contabilizar_api_java.repository.ContabilizarRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ContabilizarService {

    private ContabilizarRepository repository;
    private ModelMapper modelMapper;

    public List<ContabilizarResponseDto> findAll() {
        return repository.findAll().stream()
                .map(contabilizar -> modelMapper.map(contabilizar, ContabilizarResponseDto.class))
                .collect(Collectors.toList());
    }

    public Optional<ContabilizarResponseDto> findById(Integer id) {
        return repository.findById(id)
                .map(contabilizar -> modelMapper.map(contabilizar, ContabilizarResponseDto.class));
    }

    public UpdateStatusResponseDto updateStatus(Integer id, String status, OffsetDateTime ultimoStatus) {
        try {
            repository.updateContabilizarStatus(id, status, ultimoStatus);
            return UpdateStatusResponseDto.builder()
                    .message("Sucesso na atualização")
                    .build();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar o status no banco de dados", e);
        }
    }
}
