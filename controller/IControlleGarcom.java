
package controller;


import Excecoes.*;
import Modelo.Garcom;
import Modelo.Pedido;




interface IControladorGarcom {

    
    Garcom adicionarPedido(Pedido pedido);
    
    void anotarPedido (Pedido pedido) throws PedidoException;
    
    void inserirServico(String tipo, String codigo) throws GarcomException;

}


