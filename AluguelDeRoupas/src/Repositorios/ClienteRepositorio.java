package Repositorios;
import Entidades.Clientes;
import java.util.ArrayList;
import java.util.List;
    

public class ClienteRepositorio {
    
    private ArrayList<Clientes> clientes;
    
    public ClienteRepositorio() {
        this.clientes = new ArrayList<>();
        }
    
    public void salvar(Clientes cliente) {
        if (!clientes.contains(cliente)) {
 
            clientes.add(cliente);
            } else {
                System.out.println("Cliente já cadastrado.");
            }
        }
    
        public Clientes buscarPorId(int id) {
            for (Clientes c : clientes) {
                if (c.getId() == id) {
                    return c;
                }
            }
            return null;
        }
    
        public List<Clientes> listarTodos() {
            return clientes;
        }
    
        public boolean remover(Clientes cliente) {
            return clientes.remove(cliente);
        }
    
        public void alterar(Clientes clienteAtualizado) {
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getId() == clienteAtualizado.getId()) {
                    clientes.set(i, clienteAtualizado);
                    return;
                }
            }
        }

        public Clientes buscarClientePorNome(String nome) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'buscarClientePorNome'");
        }
    }    