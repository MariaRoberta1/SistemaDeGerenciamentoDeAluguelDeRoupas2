package App;

import Entidades.ContratoAluguel;
import Repositorios.ContratoDeAluguelRepositorio;

public class App {

	public static void main(String[] args) {
		ContratoAluguel repositorio = new ContratoAluguel();

        // Criando um exemplo de contrato
        ContratoAluguel contrato = new ContratoAluguel();

        // Salvando o contrato no repositório
        repositorio.salvar(contrato);

        // Buscando o contrato pelo ID
        ContratoAluguel contratoEncontrado = repositorio.buscarContratoPorId(1);
        System.out.println(contratoEncontrado);

        // Alterando o contrato
        contrato.setStatus("Finalizado");
        repositorio.alterarContrato(contrato);

        // Listando todos os contratos
        System.out.println(repositorio.listarTodosContratos());


	}
    // TODO


    private void salvar(ContratoAluguel contrato) {
        // TODO
    }
ContratoDeAluguelRepositorio repositorio = new ContratoDeAluguelRepositorio();
ContratoAluguel contrato = new ContratoAluguel();
public ContratoDeAluguelRepositorio getRepositorio() {
    return repositorio;
}
public void setRepositorio(ContratoDeAluguelRepositorio repositorio) {
    this.repositorio = repositorio;
}
public ContratoAluguel getContrato() {
    return contrato;
}
public void setContrato(ContratoAluguel contrato) {
    this.contrato = contrato;
}
// Set properties of contrato...
//repositorio.salvar(contrato);

}
