package Repositorio;

import Modelo.Garcom;
import Modelo.Endereco;

public interface IRepositorioGarcom {

    void inserirGarcom(Garcom ga);

    Garcom pesquisarGarcomCodigo(String codigo);

    Garcom pesquisarGarcomCodigo(String codigo, String cpf);

    boolean existeGarcom(String codigo);

    void removerGarcomCodigo(String codigo);

    void aumentarSalario(String codigo);

    void aumentarSalario(String codigo, double quantidade);

    void trocarGarcom(String codigo, Garcom novoGarcom);

    void removerEndGarcon(String codigo);

    boolean trocarEndGarcom (String codigo, Endereco endereco);

    boolean inserirEndGarcom(Endereco endereco, String codigo);

    public boolean checarFuncionario(Garcom g);

    public void removerGarcom(String codigo);

    public Garcom pesquisarGarcom(String codigo, String cpf);
}
