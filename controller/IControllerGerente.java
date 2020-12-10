
package controller;

import Modelo.*;

import Excecoes.GerenteException;


public interface IControllerGerente {


    void inserirGarcom(Garcom g) throws GerenteException;

    void removerGarcomCodigo(String codigo) throws GerenteException;

    Garcom pesquisarGarcomCodigo(String codigo, String cpf) throws GerenteException;
    
    
    void inserirCliente(Cliente c) throws GerenteException;
    
    void removerCliente (String codigo,String cpf) throws GerenteException;
    
    Cliente pesquisarClienteCodigo(String codigo) throws GerenteException;
    
    
    void aumentarSalario(String codigo,double quantidade) throws GerenteException;

   
}
