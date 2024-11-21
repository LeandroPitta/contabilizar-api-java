package br.com.leandropitta.contabilizar_api_java.service;

import br.com.leandropitta.contabilizar_api_java.dto.request.ContabilizarRequestDto;
import br.com.leandropitta.contabilizar_api_java.dto.response.ContabilizarResponseDto;
import br.com.leandropitta.contabilizar_api_java.model.Contabilizar;
import br.com.leandropitta.contabilizar_api_java.repository.ContabilizarRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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

    public Optional<ContabilizarResponseDto> findById(Long id) {
        return repository.findById(id)
                .map(contabilizar -> modelMapper.map(contabilizar, ContabilizarResponseDto.class));
    }

    public void updateStatus(Long id, String status, LocalDateTime ultimoStatus) {
        try {
            repository.updateContabilizarStatus(id, status, ultimoStatus);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar o status no banco de dados", e);
        }
    }
}
