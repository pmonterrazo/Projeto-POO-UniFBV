
package Modelo;

import java.util.ArrayList;

public class Pedido {

    public static Pedido getInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Object getCardapio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int mesa;
    private ArrayList<Prato> pratos;
    
    public Pedido(int mesa, ArrayList<Prato> pratos){
        this.mesa = mesa;
        this.pratos = pratos;
    }
    
    public Pedido(){
        pratos = new ArrayList();
    }
    
    public void incluirPrato(Prato prato){
        this.pratos.add(prato);
    }
    
    public void removerPrato(Prato prato){
        this.pratos.remove(prato);
    }
    
    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }

    public Object getCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

