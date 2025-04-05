package Repositorios;

import Entidades.Clientes;
import Entidades.ContratoAluguel;
import Interface.IClientesRepositorio;
import java.util.ArrayList;
import java.util.List;


public class ContratoDeAluguelRepositorio implements IClientesRepositorio {

    private final ArrayList<ContratoAluguel> contratos;

    public ContratoDeAluguelRepositorio() {
        this.contratos = new ArrayList<>();
    }

    public void salvar(ContratoAluguel contrato) {
        if (!contratos.contains(contrato)) {
            contratos.add(contrato);
        } else {
            System.out.println("Contrato já existe na lista.");
        }
    }

    public ContratoAluguel buscarContratoPorId(int idContrato) {
        for (ContratoAluguel contrato : contratos) {
            if (contrato.getIdContratoAluguel() == idContrato) {
                return contrato;
            }
        }
        return null;
    }

    public ArrayList<ContratoAluguel> listarTodosContratos() {
        return contratos;
    }

    public boolean removerContrato(ContratoAluguel contrato) {
        return contratos.remove(contrato);
    }

    public void alterarContrato(ContratoAluguel contratoAtualizado) {
        ContratoAluguel existente = buscarContratoPorId(contratoAtualizado.getIdContratoAluguel());
        if (existente != null) {
            existente.setCliente(contratoAtualizado.getCliente());
            existente.setRoupas(contratoAtualizado.getRoupa()); 
            existente.setDataInicio(contratoAtualizado.getDataInicio());
            existente.setDataFim(contratoAtualizado.getDataFim());
            existente.setValor(contratoAtualizado.getValor());
        }
    }


    private void getRoupa() {
        // TODO
    }

    private void getDataDevolucao() {
        // TODO
    }



    @Override
    public void salvar(Clientes cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvar'");
    }

    @Override
    public Clientes buscarPorId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public List<Clientes> listarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodos'");
    }

    @Override
    public boolean remover(Clientes cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public void atualizar(Clientes cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }
    
}

