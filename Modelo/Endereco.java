package Modelo;

public class Endereco {
    private String rua;
    private String bairro;
    private String numero;
    private String complemento;
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void status_Endereco() {
        System.out.println("Rua-" + rua + "\nBairro-" + bairro + "\nNúmero-" + numero + "\nComplemento-" + complemento + "\nCEP-" + cep);
    }
}
