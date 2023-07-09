package br.com.despesas.M3S05ExerciciosFuturoDev.service;

import br.com.despesas.M3S05ExerciciosFuturoDev.model.Despesas;

import java.util.List;

public interface DespesasService {
    Despesas salvar(Despesas despesa) throws Exception;

    List<Despesas> bucarTodos();

    List<Despesas> buscarTodos();

    List<Despesas> consultarDespesas();

    Despesas buscarPorId(Long id) throws Exception;


    Despesas lancarDespesa(Despesas despesa);

    Despesas alterarDespesa(Despesas despesaExistente) throws Exception;


    List<Despesas> consultarDespesasPorStatus(String status);

    void pagarDespesa(Long id) throws Exception;

    void estornarDespesa(Long id) throws Exception;

}
