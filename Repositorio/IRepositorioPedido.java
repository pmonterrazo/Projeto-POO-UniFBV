
package Repositorio;

import Modelo.Pedido;


public interface IRepositorioPedido {
    

     void anotarPedido(Pedido pedido);
      
     void existePedido(Pedido pedido);
       
     void abrirPedido(Pedido pedido);
      
     void buscarPedido(Pedido pedido);
     
     void removerPedido(Pedido pedido);

    public boolean existePedido(String codigo);

    public Pedido anotarpedido(String codigo);
    
}
