
package Repositorio;


import Excecoes.FuncionarioException;
import Modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class RepositorioFuncionario extends IRepositorioFuncionario{

     private static RepositorioFuncionario instancia;

    private static void adicionarFuncionario(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
     private List<Funcionario> listaFuncionario;

     private RepositorioFuncionario() {
        listaFuncionario = new ArrayList<>();
    }

  	
    public static RepositorioFuncionario getInstancia() {
        if (instancia == null) {
            instancia = new RepositorioFuncionario();
        }
        return instancia;
    }
   
  
    private static Funcionario obterFuncionarioPeloLogin(Object login) throws FuncionarioException {
         return (Funcionario) login;
        
    }
    public void autenticarFuncionario(Funcionario funcionario) throws Exception {
        Funcionario funcionarioCadastrado = RepositorioFuncionario.obterFuncionarioPeloLogin(funcionario.getLogin());
        funcionarioCadastrado.getCpf();
    }

    
    public void cadastrarFuncionario(Funcionario funcionario) throws Exception {
        Funcionario ret = RepositorioFuncionario.obterFuncionarioPeloLogin(funcionario.getLogin());
        if (ret != null) {
            throw new Exception("Erro: funcionário já cadastrado");
        }
        RepositorioFuncionario.adicionarFuncionario(funcionario);
    }
    
}



    

