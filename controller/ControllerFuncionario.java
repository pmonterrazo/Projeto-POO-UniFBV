
package controller;

import Excecoes.FuncionarioException;
import Modelo.Endereco;
import Modelo.Gerente;
import Repositorio.IRepositorioGerente;
import Repositorio.RepositorioGerente;

public  class ControllerFuncionario implements IControllerFuncionario {

    private static IRepositorioGerente repGerente;

    private static ControllerFuncionario instancia;

    private ControllerFuncionario() {
        repGerente = RepositorioGerente.getInstancia();
    }

    public static ControllerFuncionario getInstancia() {
        if (instancia == null) {
            instancia = new ControllerFuncionario();
        }
        return instancia;
    }

    @Override
    public void inserirGerente(Gerente gerente) throws FuncionarioException {
        if (repGerente.existeGerente((String) gerente.getCodigo())) {
            throw new FuncionarioException("Gerente com o mesmo código já existe!");
        } else {
            repGerente.inserirGerente(gerente);
        }
    }

    public void removerGerenteCodigo(String codigo) throws FuncionarioException {
        if (repGerente.existeGerente(codigo)) {
            repGerente.removerGerenteCodigo(codigo);
        } else {
            throw new FuncionarioException("Gerente não existe no sistema!");
        }
    }

    public void substituirGerente(String codigo, Gerente novoGerente) throws FuncionarioException {
        if (repGerente.existeGerente(codigo)) {
            repGerente.substituirGerente(codigo, novoGerente);
        } else {
            throw new FuncionarioException("Diretor nãoo existe!");
        }
    }

   

    public Gerente pesquisarGerenteCodigo(String codigo, String cpf) throws FuncionarioException {

        if (repGerente.existeGerente(codigo)) {
            return repGerente.PesquisarGerenteCodigo(codigo, cpf);
        } else {
            throw new FuncionarioException("Diretor não existe. ");
        }

    }



    public void AtualizarSalarioGerente(String codigo, Double novoSalario) throws FuncionarioException {
        if (repGerente.existeGerente(codigo)) {
            repGerente.AtualizarSalarioGerente(codigo, novoSalario);

        } else {
            throw new FuncionarioException("Diretor Inexistente. ");
        }
    }

    @Override
    public void aumentarSalarioGerente(String codigo) throws FuncionarioException {
        if (repGerente.existeGerente(codigo)) {
            repGerente.aumentarSalarioGerente(codigo);
        } else {
            throw new FuncionarioException("Diretor não existe, tente novamente! ");
        }
    }

    @Override
    public void removerEnderecoGerente(String codigo) throws FuncionarioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void trocarEndGerente(String codigo, Endereco endereco) throws FuncionarioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inserirEndGerente(Endereco endereco, String codigo) throws FuncionarioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


