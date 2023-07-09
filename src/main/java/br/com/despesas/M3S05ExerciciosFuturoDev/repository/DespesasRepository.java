package br.com.despesas.M3S05ExerciciosFuturoDev.repository;

import br.com.despesas.M3S05ExerciciosFuturoDev.model.Despesas;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DespesasRepository extends JpaRepository<Despesas, Long> {

    List<Despesas> findByStatus(String status);

}
