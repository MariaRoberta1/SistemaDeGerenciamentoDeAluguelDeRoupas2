package Entidades;
import java.time.LocalDate;
import java.util.List;

public class ContratoAluguel {
    private int idContratoAluguel;
    private Clientes cliente; // Objeto Cliente
    private List<Roupas> roupas; // Lista de objetos Roupas
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valor;
    private String status; // Ex: "Pendente", "Ativo", "Finalizado"
    private Funcionario funcionario; // Funcionário responsável pelo contrato de aluguel
    private ContratoAluguel[] contratos;

    public ContratoAluguel() {
        this.idContratoAluguel = idContratoAluguel;
        this.cliente = cliente;
        this.roupas = roupas;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.status = "Pendente"; // Inicia como Pendente
        this.funcionario = funcionario;
    }


    public ContratoAluguel(int i, LocalDate string, LocalDate string2, double d, String string3) {
        this.idContratoAluguel = i;
        this.dataInicio = string;
        this.dataFim = string2;
        this.valor = d;
        this.status = string3;
            

    } 

    public int getIdContratoAluguel() {
        return idContratoAluguel;
    }

    public void setIdContratoAluguel(int idContratoAluguel) {
        this.idContratoAluguel = idContratoAluguel;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<Roupas> getRoupas() {
        return roupas;
    }

    public void setRoupas(Object roupas) {
        this.roupas = (List<Roupas>) roupas;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public  void alterarContrato(ContratoAluguel contratoAluguelRepositorio){
        for (ContratoAluguel c : contratoAluguelRepositorio.contratos) {
            if (c.getIdContratoAluguel() == getIdContratoAluguel()) {
                c.setCliente(getCliente());
                c.setRoupas(getRoupas());
                c.setDataInicio(getDataInicio());
                c.setDataFim(getDataFim());
                c.setValor(getValor());
                c.setStatus(getStatus());
                c.setFuncionario(getFuncionario());
                return;
            }
        }
    
    }


    public Object getRoupa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoupa'");
    }


    public void salvar(ContratoAluguel contrato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvar'");
    }


    public ContratoAluguel buscarContratoPorId(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarContratoPorId'");
    }


    public char[] listarTodosContratos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarTodosContratos'");
    }
}



