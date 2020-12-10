package Modelo;


 
public abstract class Gerente extends Funcionario {

    public static Gerente getInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	private int id_gerente;
	private String senha;

    public Gerente(int id_gerente, String senha) {
        this.id_gerente = id_gerente;
        this.senha = senha;
    }

    public int getId_gerente() {
        return id_gerente;
    }

    public void setId_gerente(int id_gerente) {
        this.id_gerente = id_gerente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Gerente{" + "id_gerente=" + id_gerente + ", senha=" + senha + '}';
    }

    public Object getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}