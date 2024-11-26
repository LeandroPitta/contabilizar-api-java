package br.com.leandropitta.contabilizar_api_java.controller;

import br.com.leandropitta.contabilizar_api_java.dto.request.ContabilizarRequestDto;
import br.com.leandropitta.contabilizar_api_java.dto.response.ContabilizarResponseDto;
import br.com.leandropitta.contabilizar_api_java.dto.response.UpdateStatusResponseDto;
import br.com.leandropitta.contabilizar_api_java.service.ContabilizarService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/contabilizar")
@AllArgsConstructor
public class ContabilizarController {

    private ContabilizarService service;

    @GetMapping
    public List<ContabilizarResponseDto> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ContabilizarResponseDto> getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public UpdateStatusResponseDto updateStatus(@PathVariable Integer id, @RequestBody ContabilizarRequestDto contabilizarDto) {
        return service.updateStatus(id, contabilizarDto.getStatus(), contabilizarDto.getUltimoStatus());
    }
}
