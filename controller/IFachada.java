
package controller;

import Excecoes.*;
import Modelo.Cliente;
import Modelo.Funcionario;
import java.util.List;


    public interface IFachada {
	
	//Cliente
	void cadastrarCliente(Cliente cliente) throws ClienteJaExisteException;
	String buscarCliente(int id_Cliente);
	List<Cliente> listarClientes();
	void removerCliente(String cpf) throws CpfNaoExisteException;
	void atualizarCliente(Cliente novo, String cpf) throws CpfNaoExisteException;

	//Funcionario
	void cadastrarFuncionario(Funcionario funcionario) throws FuncionarioJaExisteException, LoginJaExisteException;
	Funcionario buscarFuncionario(String cpf);
	List<Funcionario> listarFuncionarios();
	void removerFuncionario(String cpf) throws CpfNaoExisteException;
	void atualizarFuncionario(Funcionario novo) throws CpfNaoExisteException, LoginJaExisteException;
	boolean logar(String login, String senha);
    
	
}




