package Repositorio;

import Modelo.Gerente;
import Modelo.Endereco;

public interface IRepositorioGerente {
    
    void inserirGerente(Gerente gerente);

    boolean existeGerente(String codigo);

    void removerGerenteCodigo(String codigo);

    void substituirGerente(String codigo, Gerente novoGerente);

    void removerEndGerente(String codigo);

    Gerente PesquisarGerenteCodigo(String codigo, String cpf);

    boolean TrocarEndGerente(String codigo, Endereco end);

    boolean inserirEndGerente(Endereco endereco, String codigo);

    void AtualizarSalarioGerente(String codigo, Double novoSalario);

    void aumentarSalarioGerente(String codigo);

    
}
