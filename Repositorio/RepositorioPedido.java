
package Repositorio;

import Excecoes.PedidoException;
import Modelo.Pedido;
import Modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioPedido implements IRepositorioPedido{

    
    private static RepositorioPedido instancia;
        
    public static RepositorioPedido getInstancia() {
        if (instancia == null) {
            instancia = new RepositorioPedido();
        }
        return instancia;
    }
    
    RepositorioPedido repositorioPedido = new RepositorioPedido();
    
    public void abrirPedido(Pedido pedido) {
       
        try {
            repositorioPedido.adicionarPedido(pedido);
        } catch (PedidoException ex) {
            Logger.getLogger(RepositorioPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void removerPedido (Pedido pedido) {
        repositorioPedido.removerPedido(pedido);
    }
    
    public List<Produto> getListaRefeicao() {
        return repositorioPedido.getListaRefeicao();
    }
    
   
    public List<Produto> getListaBebidas() {
        return repositorioPedido.getListaBebidas();
    }
  
    public List<Pedido> getListaPedidos() {
        return repositorioPedido.getListaPedidos();
    }
    
 
    public List<Pedido> buscarPedidos(String nomeCliente) {
        List<Pedido> pedidosEncontrados = new ArrayList<>();
        for(Pedido p : getListaPedidos()) {
            if (p.getCliente().equals(nomeCliente)) {
                pedidosEncontrados.add(p);
            }
        }        
        return pedidosEncontrados;
    }

    private void adicionarPedido(Pedido pedido) throws PedidoException {
        throw new PedidoException("Pedido adionado com sucesso!"); 
    }

    @Override
    public void anotarPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void existePedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existePedido(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pedido anotarpedido(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}