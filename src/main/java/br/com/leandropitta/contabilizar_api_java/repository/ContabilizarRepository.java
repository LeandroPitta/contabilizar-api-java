package br.com.leandropitta.contabilizar_api_java.repository;

import br.com.leandropitta.contabilizar_api_java.model.Contabilizar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Repository
public interface ContabilizarRepository extends JpaRepository<Contabilizar, Integer> {
    @Procedure("update_contabilizar_status")
    void updateContabilizarStatus(Integer id, String status, OffsetDateTime ultimoStatus);
}
