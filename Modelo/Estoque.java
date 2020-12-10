package Modelo;

public abstract class Estoque {
    private int codigo;
    private String tipo;
    private String nome;
    private int validade;
    private String estado;

    public Estoque(int codigo, String tipo, String nome,
            int validade, String estado) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nome = nome;
        this.validade = validade;
        this.estado = estado;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado() {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estoque{" + "codigo=" + codigo + ", tipo=" + tipo + ", nome=" + nome + ", validade=" + validade + ", estado=" + estado + '}';
    }


    
}
