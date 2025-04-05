package Servicos;

import Entidades.Clientes;
import Entidades.ContratoAluguel;
import Entidades.Roupas;
import Interface.IContratoAluguelRepositorio;
import Repositorios.ContratoDeAluguelRepositorio;
import java.util.List;

public class ContratoDeAluguelServicos {

    private IContratoAluguelRepositorio contratoRepositorio;

    public ContratoDeAluguelServicos(ContratoDeAluguelRepositorio contratoAluguelRepositorio) {
        //TODO Auto-generated constructor stub
    }

    public void ContratoAluguelServicos(IContratoAluguelRepositorio contratoRepositorio) {
        contratoRepositorio = contratoRepositorio;
        this.contratoRepositorio = contratoRepositorio;
    }

    /**
     * @param contrato
     */
    public void salvar(ContratoAluguel contrato) {
        if (contrato == null) {
            System.out.println("Contrato inválido. Não pode ser salvo.");
            return;
        }

        if (contrato.getCliente() == null || contrato.getRoupas() == null) {
            System.out.println("Cliente ou roupa inválidos. Não pode ser salvo.");
            return;
        }

        if (contrato.getDataInicio() == null || contrato.getDataFim() == null || contrato.getDataInicio().isAfter(contrato.getDataFim())) {         
               System.out.println("Datas inválidas no contrato.");
            return;
        }

        contratoRepositorio.salvar(contrato);
        System.out.println("Contrato salvo com sucesso!");
    }


    private void getRoupa() {
        // TODO
    }

    public ContratoAluguel buscarContratoPorId(int idContrato) {
        ContratoAluguel contrato = contratoRepositorio.buscarContratoPorId(idContrato);
        if (contrato == null) {
            System.out.println("Contrato com ID " + idContrato + " não encontrado.");
        }
        return contrato;
    }

    public boolean deletarContrato(int idContrato) {
        ContratoAluguel contrato = buscarContratoPorId(idContrato);
        if (contrato != null) {
            contratoRepositorio.removerContrato(contrato);
            System.out.println("Contrato ID " + idContrato + " removido com sucesso.");
            return true;
        }
        System.out.println("Contrato ID " + idContrato + " não encontrado.");
        return false;
    }

    public void listarContratos() {
        List<ContratoAluguel> contratos = contratoRepositorio.listarTodosContratos();
        if (contratos.isEmpty()) {
            System.out.println("Nenhum contrato encontrado.");
            return;
        }
        
        for (ContratoAluguel contrato : contratos) {
            System.out.println("ID: " + contrato.getIdContratoAluguel() +
                    " | Cliente: " + contrato.getCliente().getNome() +
                    " | Roupa: " + ((Clientes) contrato.getRoupas()).getNome() +
                    " | Data Início: " + contrato.getDataInicio() +
                    " | Data Fim: " + contrato.getDataFim());
        }
    }

    public void alterarContrato(ContratoAluguel contratoAlterado) {
        ContratoAluguel contratoExistente = buscarContratoPorId(contratoAlterado.getIdContratoAluguel());
        if (contratoExistente == null) {
            System.out.println("Contrato não encontrado. Alteração não pode ser realizada.");
            return;
        }

        contratoExistente.setCliente(contratoAlterado.getCliente());
        contratoExistente.setValor(contratoAlterado.getValor());
        contratoExistente.setRoupas(contratoAlterado.getRoupas());
        contratoExistente.setDataInicio(contratoAlterado.getDataInicio());
        contratoExistente.setDataFim(contratoAlterado.getDataFim());

        contratoRepositorio.alterarContrato(contratoExistente);
        System.out.println("Contrato alterado com sucesso!");
    }


    private <Roupas> void setRoupa(List<Roupas> list) {
        // TODO
    }

    public void realizarContrato(Clientes clienteAluguel, Roupas roupaSelecionada, String dataInicio,
            String dataFim) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarContrato'");
    }
    
}
