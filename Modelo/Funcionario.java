package Modelo;
 
import java.time.LocalDate;
import java.util.List;

public abstract  class Funcionario {

    public static Funcionario getInstancia;

    public static Funcionario getInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
	private String nome;
	private String cpf;
	private Endereco endereco;
	private LocalDate dataNasc;
	private String telefone;
	private String email;
	private double salario;

	public Funcionario(String nome, String cpf, LocalDate dataNasc, String telefone, String email, double salario,
			Endereco endereco) {

		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.email = email;
		this.salario = salario;
		
	}

	public Funcionario() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract String gerarIdentificador();

    @Override
    public String toString() {
        return "Funcionario{" + ", nome=" + nome + ", cpf=" + cpf
                + ", endereco=" + endereco + ", dataNasc=" + dataNasc 
                + ", telefone=" + telefone + ", email=" + email + ", salario=" + salario + '}';
    }

    public Object getLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
        
        
}
 

