
package controller;

import Excecoes.GerenteException;
import Excecoes.PedidoException;
import Modelo.Garcom;
import Repositorio.*;
import Modelo.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrícia Silva
 */
   
    
public class ControllerGerente implements IControllerGerente {

    private static IRepositorioGarcom repGarcom;

    private static IRepositorioFuncionario repFuncionario;
    
    private static Cliente cliente;

    private static ControllerGerente instancia;

    private ControllerGerente() {
        repGarcom = RepositorioGarcom.getInstancia();
        repFuncionario = RepositorioFuncionario.getInstancia();
    }

    public static ControllerGerente getInstancia() {
        if (instancia == null) {
            instancia = new ControllerGerente();
             
        }       
        return instancia;
    }

    /**
     *
     * @param g
     * @throws GerenteException
     */
    @Override
    public void inserirGarcom(Garcom g) throws GerenteException {
        
        if (repGarcom.existeGarcom(g.getCodigo())) {
            throw new GerenteException("Garçom com o mesmo código cadastrado!");
        }
        if (repGarcom.checarFuncionario(g)) {
            throw new GerenteException("Garçom invalida!");
        } else {
            repGarcom.inserirGarcom(g);
        }
    }

   // @Override

    /**
     *
     * @param codigo
     * @throws GerenteException
     */
    public void removerGarcomCodigo (String codigo) throws GerenteException {
        if (repGarcom.existeGarcom(codigo)) {
            repGarcom.removerGarcom(codigo);
        } else {
            throw new GerenteException("Garçom removido com sucesso!");
        }
    }

    @Override
    public Garcom pesquisarGarcomCodigo(String codigo, String cpf) throws GerenteException {
        if (repGarcom.existeGarcom(codigo)) {
            return repGarcom.pesquisarGarcom(codigo, cpf);

        } else {
            throw new GerenteException("Garçom não existe! ");
        }
    }

   // @Override
    public void inserirCliente(Cliente c) throws GerenteException {
        
        if (Cliente.existeCliente(c.getCodigo())) {
            throw new GerenteException("Já temos um cliente com este código!");
        } else {
            Cliente.inserirCliente(c);
        }
    }

    
    //overload
    public Cliente pesquisarClienteCodigo(String codigo,String cpf) throws GerenteException {

        if (Cliente.existeCliente(codigo)) {
            return Cliente.pesquisarClienteCodigo(codigo, cpf);
        } else {
            throw new GerenteException("Este cliente não existe!");
        }

    }

    public void removerClienteCodigo(String codigo) throws GerenteException {
        if (Cliente.existeCliente(codigo)) {
            Cliente.removerClienteCodigo(codigo);
        } else {
            throw new GerenteException("Cliente não existe. ");
        }
    }

   // @Override
    public void aumentarSalario(String codigo,double quantidade) throws GerenteException {
        if (repFuncionario.existeFuncionario(codigo)) {
            repFuncionario.aumentarSalario(codigo);
        } else {
            throw new GerenteException("Funcionario inexistente! ");
        }
    }

    @Override
    public void removerCliente(String codigo, String cpf) throws GerenteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente pesquisarClienteCodigo(String codigo) throws GerenteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


       
}
