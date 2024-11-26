package br.com.leandropitta.contabilizar_api_java.controller;

import br.com.leandropitta.contabilizar_api_java.dto.request.HistoricoRequestDto;
import br.com.leandropitta.contabilizar_api_java.dto.response.HistoricoPostResponseDto;
import br.com.leandropitta.contabilizar_api_java.dto.response.HistoricoResponseDto;
import br.com.leandropitta.contabilizar_api_java.service.HistoricoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/historico")
@AllArgsConstructor
public class HistoricoController {

    private HistoricoService service;

    @GetMapping("/{id}")
    public List<HistoricoResponseDto> getById(@PathVariable Integer id) {
        return service.findAllById(id);
    }

    @PostMapping
    public HistoricoPostResponseDto create(@RequestBody HistoricoRequestDto historicoDto) {
        return service.save(historicoDto);
    }
}
