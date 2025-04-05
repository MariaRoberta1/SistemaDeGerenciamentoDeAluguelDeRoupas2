package Interface;
import Entidades.Roupas;
import java.util.List;

public interface IRoupaServicos {
    
    public interface IRoupasServico {
        void cadastrarRoupa(Roupas roupa);
        Roupas buscarRoupa(String nome);
        List<Roupas> listarRoupas();
        boolean removerRoupa(Roupas roupa);
        void alugarRoupa(String nome);
        void devolverRoupa(String nome);
    }
    


}
