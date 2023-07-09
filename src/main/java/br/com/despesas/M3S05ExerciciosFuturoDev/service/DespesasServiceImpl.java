package br.com.despesas.M3S05ExerciciosFuturoDev.service;

import br.com.despesas.M3S05ExerciciosFuturoDev.model.Despesas;
import br.com.despesas.M3S05ExerciciosFuturoDev.repository.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesasServiceImpl implements DespesasService {

    @Autowired
    private DespesasRepository despesaRepository;

    @Override
    public Despesas salvar(Despesas despesa) throws Exception {
        return null;
    }

    @Override
    public List<Despesas> bucarTodos() {
        return null;
    }

    @Override
    public List<Despesas> buscarTodos() {
        return despesaRepository.findAll();
    }

    @Override
    public List<Despesas> consultarDespesas() {
        return despesaRepository.findAll();
    }

    @Override
    public Despesas buscarPorId(Long id) throws Exception {
        return null;
    }

    @Override
    public Despesas lancarDespesa(Despesas despesa) {
        despesa.setStatus("Pendente");
        despesa.setDataPagamento(null);

        return despesaRepository.save(despesa);
    }

    @Override
    public Despesas alterarDespesa(Despesas despesaExistente) throws Exception {
        if (despesaExistente.getStatus().equals("Pago")) {
            throw new Exception("Não é possível alterar.");
        }

        despesaExistente.setCredor(despesaExistente.getCredor());
        despesaExistente.setValor(despesaExistente.getValor());
        despesaExistente.setDescricao(despesaExistente.getDescricao());


        return despesaRepository.save(despesaExistente);
    }

    @Override
    public List<Despesas> consultarDespesasPorStatus(String status) {

        return despesaRepository.findByStatus(status);
    }

    @Override
    public void pagarDespesa(Long id) throws Exception {

    }

    @Override
    public void estornarDespesa(Long id) throws Exception {

    }
}
