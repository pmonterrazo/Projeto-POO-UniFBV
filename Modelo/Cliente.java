
package Modelo;

import Excecoes.PedidoException;
import javafx.scene.control.Menu;



/**
 *
 * @author Patrícia Silva
 */
public class Cliente extends Pessoa{

   
    public static boolean existeCliente(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void inserirCliente(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Cliente pesquisarClienteCodigo(String codigo, String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void removerClienteCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Cliente getInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


    
    int id_cliente;
    String nomeCliente;
    double conta;
    String pedidoC;
    String ler;

    public Cliente(int id_cliente, String nomeCliente, double conta, String pedidoC, String ler) {
        this.id_cliente = id_cliente;
        this.nomeCliente = nomeCliente;
        this.conta = conta;
        this.pedidoC = pedidoC;
        this.ler = ler;
    }

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int in_cliente) {
        this.id_cliente = in_cliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getConta() {
        return conta;
    }

    public void setConta(double conta) {
        this.conta = conta;
    }

    public String getPedidoC() {
        return pedidoC;
    }

    public void setPedidoC(String pedidoC) {
        this.pedidoC = pedidoC;
    }

    public String getLer(){
        return ler;
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + 
                ", nomeCliente=" + nomeCliente + ", conta=" + conta +
                ", pedidoC=" + pedidoC + ", ler=" + ler + '}';
    }

    public String getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double addPedidoCliente(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void pedidoC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double addPedidoC(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double removerPedidoC(Menu menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

  }