package br.com.leandropitta.contabilizar_api_java.repository;

import br.com.leandropitta.contabilizar_api_java.model.Historico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricoRepository extends JpaRepository<Historico, Long> {
    List<Historico> findAllById(Long id);

    @Procedure(name = "insert_historico")
    void insertHistorico(Long id, String historico, String funcionario);
}
