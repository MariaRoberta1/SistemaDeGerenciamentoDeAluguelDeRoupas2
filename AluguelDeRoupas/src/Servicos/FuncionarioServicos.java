package Servicos;

import Entidades.Funcionario;
import Interface.IFuncionariosRepositorio;
import Repositorios.FuncionarioRepositorio;
import java.util.List;

public class FuncionarioServicos {
     private IFuncionariosRepositorio repositorio;

    public FuncionarioServicos(FuncionarioRepositorio funcionarioRepositorio) {
        //TODO Auto-generated constructor stub
    }

    public void FuncionariosServicos(IFuncionariosRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void registrarFuncionario(Funcionario funcionario) {
        repositorio.salvar(funcionario);
    }

    public Funcionario buscarFuncionario(int id) {
        return repositorio.buscarPorId(id);
    }

    public List<Funcionario> listarFuncionarios() {
        return repositorio.listarTodos();
    }

    public boolean removerFuncionario(Funcionario funcionario) {
        return repositorio.remover(funcionario);
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        repositorio.atualizar(funcionario);
    }

}
