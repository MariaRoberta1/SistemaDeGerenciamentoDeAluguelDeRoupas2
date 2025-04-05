package App;
import Entidades.Clientes;
import Entidades.Roupas;
import Repositorios.ClienteRepositorio;
import Repositorios.ContratoDeAluguelRepositorio;
import Repositorios.FuncionarioRepositorio;
import Repositorios.RoupasRepositorio;
import Servicos.ClienteServicos;
import Servicos.ContratoDeAluguelServicos;
import Servicos.FuncionarioServicos;
import Servicos.RoupasServico;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
            // Repositórios
            ClienteRepositorio clientesRepositorio = new ClienteRepositorio();
            RoupasRepositorio roupaRepositorio = new RoupasRepositorio();
            FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
            ContratoDeAluguelRepositorio contratoAluguelRepositorio = new ContratoDeAluguelRepositorio();
    
            // Serviços
            ClienteServicos clientesServicos = new ClienteServicos(clientesRepositorio);
            RoupasServico roupaServico = new RoupasServico(roupaRepositorio);
            FuncionarioServicos funcionarioServico = new FuncionarioServicos(funcionarioRepositorio);
            ContratoDeAluguelServicos contratoServico = new ContratoDeAluguelServicos(contratoAluguelRepositorio);
    
            System.out.println("=== Sistema de Aluguel de Roupas ===");
    
            while (true) {
                System.out.println("\n1. Cadastrar Cliente");
                System.out.println("2. Listar Clientes");
                System.out.println("3. Atualizar Cliente");
                System.out.println("4. Remover Cliente");
                System.out.println("5. Alugar Roupa");
                System.out.println("6. Listar Contratos");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // limpar buffer
    
                switch (opcao) {
                    case 1:
                        Clientes cliente = new Clientes();
                        System.out.print("Nome do cliente: ");
                        cliente.setNome(scanner.nextLine());
                        System.out.print("ID do cliente: ");
                        cliente.setId(scanner.nextInt());
                        scanner.nextLine(); // limpar buffer
                        clientesServicos.cadastrarCliente(cliente);
                        break;
    
                    case 2:
                        clientesServicos.listarClientes();
                        break;
    
                    case 3:
                        System.out.print("ID do cliente para atualizar: ");
                        int idAtualizar = scanner.nextInt();
                        scanner.nextLine();
                        Clientes clienteAtualizar = clientesRepositorio.buscarPorId(idAtualizar);
                        if (clienteAtualizar != null) {
                            System.out.print("Novo nome: ");
                            clienteAtualizar.setNome(scanner.nextLine());
                            clientesServicos.atualizarCliente(clienteAtualizar);
                        } else {
                            System.out.println("Cliente não encontrado.");
                        }
                        break;
    
                    case 4:
                        System.out.print("ID do cliente para remover: ");
                        int idRemover = scanner.nextInt();
                        Clientes clienteRemover = clientesRepositorio.buscarPorId(idRemover);
                        if (clienteRemover != null) {
                            clientesServicos.removerCliente(clienteRemover);
                        } else {
                            System.out.println("Cliente não encontrado.");
                        }
                        break;
    
                    case 5:
                        System.out.print("ID do cliente: ");
                        int idCliente = scanner.nextInt();
                        Clientes clienteAluguel = clientesRepositorio.buscarPorId(idCliente);
    
                        System.out.print("ID da roupa: ");
                        int idRoupa = scanner.nextInt();
                        Roupas roupaSelecionada = roupaRepositorio.buscarPorId(idRoupa);
    
                        scanner.nextLine();
                        System.out.print("Data de início (YYYY-MM-DD): ");
                        String dataInicio = scanner.nextLine();
    
                        System.out.print("Data de fim (YYYY-MM-DD): ");
                        String dataFim = scanner.nextLine();
    
                        contratoServico.realizarContrato(clienteAluguel, roupaSelecionada, dataInicio, dataFim);
                        break;
    
                    case 6:
                        contratoServico.listarContratos();
                        break;
    
                    case 0:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
    
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }
        }

    private void realizarContrato(Clientes clienteAluguel, Roupas roupaSelecionada, String dataInicio, String dataFim) {
        // TODO
    }
    }
