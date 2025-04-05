package Interface;

import Entidades.Funcionario;
import java.util.List;

public interface IFuncionariosServico {

    void registrarFuncionario(Funcionario funcionario);
    Funcionario buscarFuncionario(int id);
    List<Funcionario> listarFuncionarios();
    boolean removerFuncionario(Funcionario funcionario);
    void atualizarFuncionario(Funcionario funcionario);
}
