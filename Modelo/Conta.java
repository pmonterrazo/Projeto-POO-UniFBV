
package Modelo;

/**
 *
 * @author Patrícia Silva
 */

public abstract class Conta {

     public static Conta getInstancia;
    
    
    private Double[] valor = new Double[3];
    private Double pedido;

    public Conta(Double pedido) {
        this.pedido = pedido;
    }

    public Double[] getValor() {
        return valor;
    }

    public void setValor(Double[] valor) {
        this.valor = valor;
    }

    public Double getPedido() {
        return pedido;
    }

    public void setPedido(Double pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Conta{" + "valor=" + valor + ", pedido=" + pedido + '}';
    }
    
}