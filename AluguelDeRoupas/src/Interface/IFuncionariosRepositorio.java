package Interface;

import Entidades.Funcionario;
import java.util.List;

public interface IFuncionariosRepositorio {

    void  salvar(Funcionario funcionario);
    Funcionario buscarPorId(int id);
    List<Funcionario> listarTodos();
    boolean remover(Funcionario funcionario);
    void atualizar(Funcionario funcionario);
}