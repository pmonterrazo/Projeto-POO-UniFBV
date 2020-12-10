package Modelo;


public abstract class Garcom extends Funcionario {

    public static Garcom getInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	private int id_garcom;
        
	public Garcom() {

    }	

    public int getId_garcom() {
        return id_garcom;
    }

    public void setId_garcom(int id_garcom) {
        this.id_garcom = id_garcom;
    }

    @Override
    public String toString() {
        return "Garcom{" + "id_garcom=" + id_garcom + '}';
    }

    public String getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCargaH(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
 





