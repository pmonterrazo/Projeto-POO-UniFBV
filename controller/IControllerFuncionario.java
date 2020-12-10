
package controller;

import Excecoes.FuncionarioException;
import Modelo.Endereco;
import Modelo.Gerente;

public interface IControllerFuncionario {
  

    void inserirGerente(Gerente gerente) throws FuncionarioException;

    void removerGerenteCodigo(String gerente) throws FuncionarioException;

    void substituirGerente(String codigo, Gerente novoGerente) throws FuncionarioException;

    void removerEnderecoGerente(String codigo) throws FuncionarioException;

    Gerente pesquisarGerenteCodigo(String codigo, String cpf) throws FuncionarioException;

    void trocarEndGerente(String codigo, Endereco endereco) throws FuncionarioException;

    void inserirEndGerente( Endereco endereco, String codigo) throws FuncionarioException;

    void AtualizarSalarioGerente(String codigo, Double novoSalario) throws FuncionarioException;

    void aumentarSalarioGerente(String codigo) throws FuncionarioException;
}


