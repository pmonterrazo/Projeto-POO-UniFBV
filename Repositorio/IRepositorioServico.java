package Repositorio;

import Modelo.Servico;

public interface IRepositorioServico {

    void mandarServico(Servico servico);

    boolean existeServico(String codigo);

    void removerServico(String codigo, int prazo);

    Servico mostrarServico(String codigo);

    void substituirServico(Servico se);

    public Servico inserirServicoCodigo(String codigo);
    
}
