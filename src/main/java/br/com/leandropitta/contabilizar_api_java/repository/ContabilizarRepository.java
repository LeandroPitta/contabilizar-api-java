package br.com.leandropitta.contabilizar_api_java.repository;

import br.com.leandropitta.contabilizar_api_java.model.Contabilizar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ContabilizarRepository extends JpaRepository<Contabilizar, Long> {
    @Procedure(name = "update_contabilizar_status")
    void updateContabilizarStatus(Long id, String status, LocalDateTime ultimoStatus);
}
