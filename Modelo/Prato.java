
package Modelo;

    
public class Prato {
    
    private String descricao;
    private double preco;
    
    public Prato(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public Prato(){
        Prato refeicao = new Prato();
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getPedido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
