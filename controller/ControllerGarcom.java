
package controller;

import Modelo.*;
import Repositorio.*;
import excecoes.GarcomException;


/**
 *
 * @author Patrícia Silva
 */
public class ControllerGarcom implements IControlleGarcom{


    private static IRepositorioServico repServico;
    private static IRepositorioPedido repPedido;


    private static ControllerGarcom instancia;

    private ControllerGarcom() {
        
      
        repServico = RepositorioServico.getInstancia();
        
    }

    public static ControllerGarcom getInstancia() {
        if (instancia == null) {
            instancia = new ControllerGarcom();
        }

        return instancia;
    }

    //@Override
    public Pedido anotarPedidos(String codigo) throws GarcomException {

        if (repPedido.existePedido(codigo)) {
            return repPedido.anotarpedido(codigo);
        } else {
            throw new GarcomException("Pedido não existe, faça novamente!");
        }
    }

   // @Override
    public Servico inserirServicoCodigo(String codigo) throws GarcomException {
        if (repServico.existeServico(codigo)) {
            return repServico.inserirServicoCodigo(codigo);
        } else {
            throw new GarcomException("Não existe serviço no momento, volte mais tarde!");
        }
    }
}

