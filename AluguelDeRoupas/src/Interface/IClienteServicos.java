package Interface;

import Entidades.Clientes;
import java.util.List;

public interface IClienteServicos {

    void registrarCliente(Clientes cliente);
    Clientes buscarCliente(int id);
    List<Clientes> listarClientes();
    boolean removerCliente(Clientes cliente);
    void atualizarCliente(Clientes cliente);

}
