package Repositorios;

import Entidades.Funcionario;
import Interface.IFuncionariosRepositorio;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepositorio implements IFuncionariosRepositorio{

    private List<Funcionario> funcionarios = new ArrayList<>();

    @Override
    public void salvar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    @Override
    public Funcionario buscarPorId(int id) {
        return funcionarios.stream()
                           .filter(f -> f.getId() == id)
                           .findFirst()
                           .orElse(null);
    }

    @Override
    public List<Funcionario> listarTodos() {
        return funcionarios;
    }

    @Override
    public boolean remover(Funcionario funcionario) {
        return funcionarios.remove(funcionario);
    }

    @Override
    public void atualizar(Funcionario funcionario) {
        Funcionario existente = buscarPorId(funcionario.getId());
        if (existente != null) {
            existente.setNome(funcionario.getNome());
            existente.setCargo(funcionario.getCargo());
            // Atualize outros atributos conforme necessário
        }
    }

}
