package Interface;
import Entidades.Clientes;
import java.util.List;


public interface IClientesRepositorio {
    void salvar(Clientes cliente);
    Clientes buscarPorId(int id);
    List<Clientes> listarTodos();
    boolean remover(Clientes cliente);
    void atualizar(Clientes cliente);
}