package controller;

import Excecoes.*;
import Modelo.*;
import excecoes.GarcomException;
import java.util.List;


public class Fachada implements IFachada {

	private static Fachada instance;

	private final  Gerente cadastroGerente;
	private final  Cliente cadastroCliente;
        private final  Garcom cadastroGarcom;
	private final  Funcionario cadastroFuncionario;
        private final  Pedido cadastrarPedido;
        private final  Produto cadastrarProduto;
        private final  Cardapio cadastrarCardapio;
    
      

      
    public Fachada() {
        
        cadastroGerente = Gerente.getInstancia();
        cadastroCliente = Cliente.getInstancia();
        cadastroGarcom = Garcom.getInstancia();
        cadastrarPedido = Pedido.getInstancia();
        cadastrarProduto = Produto.getInstancia();
        cadastrarCardapio = Cardapio.getInstancia();
        cadastroFuncionario = Funcionario.getInstancia();
               
    }
    
        public static Fachada getInstance(){
            if (instance == null){
                instance = new Fachada();
                
            }
            return instance;
        }        


	@Override
	public void cadastrarCliente(Cliente cliente) throws ClienteJaExisteException {
		cadastroCliente.getId_cliente();
	}

	@Override
	public String buscarCliente(int id_cliente) {
            return cadastroCliente.getNomeCliente();
		
	}

	@Override
	public List<Cliente> listarClientes() {
		return (List<Cliente>) cadastroCliente;
	}

	@Override
	public void removerCliente(String cpf) throws CpfNaoExisteException {
	}

	@Override
	public void atualizarCliente(Cliente novo, String cpf) throws CpfNaoExisteException {
		
	}

	@Override
	public void cadastrarFuncionario(Funcionario funcionario) throws FuncionarioJaExisteException, LoginJaExisteException {
		cadastroFuncionario.getCpf();
	}

	@Override
	public Funcionario buscarFuncionario(String cpf) {
		return buscarFuncionario(cpf);
            
	}

	@Override
	public List<Funcionario> listarFuncionarios() {
		return listarFuncionarios();
	}

	@Override
	public void removerFuncionario(String cpf) throws CpfNaoExisteException {
	}

	@Override
	public void atualizarFuncionario(Funcionario cpf) throws CpfNaoExisteException, LoginJaExisteException {
	}

	@Override
	public boolean logar(String login, String senha) {
		return logar(login, senha);
	}

		// Garçom

	public void cadastrarGarcom(Garcom garcom) throws CpfNaoExisteException, 
                GarcomException{
		this.cadastrarGarcom(garcom);
	}

    /**
     *
     * @param garcom
     * @throws GarcomException
     */
    public void deletarGarcom(Garcom garcom) throws GarcomException {
		this.deletarGarcom(garcom);
	}

	
	public void alterarGarcom(Garcom garcom) throws GarcomException {
		this.alterarGarcom(garcom);
	}

	// Gerente

    /**
     *
     * @param gerente
     * @throws CpfNaoExisteException
     * @throws Excecoes.CadastroGerenteException
     */

	public void cadastrarGerente(Gerente gerente) throws CpfNaoExisteException, CadastroGerenteException {
			
		this.cadastrarGerente(gerente);
	}

	public void deletarGerente(Gerente gerente) throws GerenteException{
             
		this.deletarGerente(gerente);
	}

	public void alterarGerente(Gerente gerente)throws CpfNaoExisteException{
		this.alterarGerente(gerente);
	}

	public Gerente recuperarCpfPorGerente(String CPF) throws CpfRecuperadoException{
		return this.recuperarCpfPorGerente(CPF);
	}

	public List<Gerente> listarTodosGerentes() {
		return this.listarTodosGerentes();
	}

	public Gerente verificarIdentificadorGerente(String identificador) {
		return this.verificarIdentificadorGerente(identificador);
	}

	
	// Produto

        public void cadastrarProduto(Produto produto) throws  ProdutoExistenteException {
		this.cadastrarProduto(produto);
	}
                
                        
	public void deletarProduto(Produto produto) throws ProdutoInexistenteException{
		this.deletarProduto(produto);
	}

	public void alterarProduto(Produto produto, String novoNome, int quantidade, double preco)
			throws ProdutoExistenteException {
		this.alterarProduto(produto, novoNome, quantidade, preco);
	}

	public Produto recuperarProdutoNome(String nome) throws ProdutoInexistenteException, NomeValidoException {
		return this.recuperarProdutoNome(nome);
	}

	public void adicionarQuantidadeProduto(Produto produto, Integer quantidade)
			throws QuantidadeProdutoInvalidoException {
		this.adicionarQuantidadeProduto(produto, quantidade);
	}

	public List<Produto> listarTodosProdutos() {
		return this.listarTodosProdutos();
	}


	// Cardapio

	public void cadastrarCardapio(Cardapio cardapio)
			throws PratoExistenteException, PrecoInvalidoException {
		this.cadastrarCardapio(cardapio);
	}

	public void deletarCardapio(Cardapio cardapio) throws PratoInexistenteException {
		this.deletarCardapio(cardapio);
	}

	public void alterarCardapio(Cardapio cardapio, String novoNome, double preco)
			throws PratoExistenteException {
		this.alterarCardapio(cardapio, novoNome, preco);
	}

	public Cardapio recuperarCardapioPeloNome(String nome) throws PratoInexistenteException {
		return this.recuperarCardapioPeloNome(nome);
	}

	public Cardapio recuperarCardapioPorID(Integer codigo) throws PratoInexistenteException {
		return this.recuperarCardapioPorID(codigo);
	}

	public List<Cardapio> listarTodosCardapios() {
		return this.listarTodosCardapios();
	}

        // Pedido

	public void cadastrarPedido(Pedido pedido) throws PedidoInvalidoException, PedidoCadastradoException {
		this.cadastrarPedido(pedido);
	}

	public void deletarPedido(Pedido pedido) throws PedidoInexistenteException {
		this.deletarPedido(pedido);
	}

	public void alterarPedido(Pedido pedido) throws PedidoException {
		this.alterarPedido(pedido);
	}

	
	public List<Pedido> listarPedidosPorMesa(Integer codigo)throws PedidoException{ 
		return this.listarPedidosPorMesa(codigo);
	}

	public void deletarTodosPedidosPelaMesa(Integer codigo) throws PedidoInexistenteException {
		this.deletarTodosPedidosPelaMesa(codigo);
	}

	// Conta

	public void cadastrarConta(Conta conta) {
		this.cadastrarConta(conta);
	}

	public void deletarConta(Conta conta) {
		this.deletarConta(conta);
	}

	public Conta recuperarContaID(Integer codigo) {
		return this.recuperarContaID(codigo);
	}

	public double mostrarValorConta(Conta conta) {
		return this.mostrarValorConta(conta);
	}
}
     
 


    
                        

                        