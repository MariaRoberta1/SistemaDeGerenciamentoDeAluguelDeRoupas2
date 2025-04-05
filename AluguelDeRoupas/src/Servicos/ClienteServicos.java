package Servicos;
import Entidades.Clientes;
import Interface.IClientesRepositorio;
import Repositorios.ClienteRepositorio;
import  java.util.List;
import java.util.Scanner;

public class ClienteServicos {
    
    public ClienteServicos(ClienteRepositorio clientesRepositorio) {
        //TODO Auto-generated constructor stub
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
     
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
    
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @SuppressWarnings("unused")
    private IClientesRepositorio clienteRepositorio;

    public void ClienteServico(IClientesRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    public void cadastrarCliente(Clientes cliente2) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID do cliente: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        Clientes cliente = new Clientes();
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setAtivo(true);

        clienteRepositorio.salvar(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void atualizarCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID do cliente a ser atualizado: ");
        int id = Integer.parseInt(sc.nextLine());

        Clientes cliente = clienteRepositorio.buscarPorId(id);

        if (cliente != null) {
            System.out.print("Novo nome do cliente: ");
            String nome = sc.nextLine();
            cliente.setNome(nome);

            clienteRepositorio.atualizar(cliente);
            System.out.println("Cliente atualizado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void excluirCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID do cliente a ser removido: ");
        int id = Integer.parseInt(sc.nextLine());

        Clientes cliente = clienteRepositorio.buscarPorId(id);

        if (cliente != null) {
            clienteRepositorio.remover(cliente);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void listarClientes() {
        List<Clientes> clientes = clienteRepositorio.listarTodos();

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Lista de Clientes:");
            for (Clientes c : clientes) {
                System.out.println("ID: " + c.getId() + ", Nome: " + c.getNome() + ", Ativo: " + c.isAtivo());
            }
        }
    }

    public ClienteServicos getClienteRepositorio() {
        return (ClienteServicos) clienteRepositorio;
    }

    public void setClienteRepositorio(ClienteServicos clienteRepositorio) {
        this.clienteRepositorio = (IClientesRepositorio) clienteRepositorio;
    }

    public void atualizarCliente(Clientes clienteAtualizar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarCliente'");
    }

    public void removerCliente(Clientes clienteRemover) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerCliente'");
    }
}

