package Repositorio;

import Modelo.Servico;

import java.util.ArrayList;
import java.util.List;

public class RepositorioServico implements IRepositorioServico {

    private static RepositorioServico instancia;
    private List<Servico> listaServico;

    private RepositorioServico() {
        listaServico = new ArrayList<>();
    }

    public static RepositorioServico getInstancia() {
        if (instancia == null) {
            instancia = new RepositorioServico();
        }
        return instancia;
    }

    @Override
    public void mandarServico(Servico servico) {
        listaServico.add(servico);

    }

    public boolean existeServico(int prazo) {
        for (Servico servico : listaServico) {
            if (servico != null && servico.getPrazo() == prazo) {
                return true;
            }
        }
        return false;
    }

    public boolean existeServico(String codigo) {
        for (Servico trabalho : listaServico) {
            if (trabalho != null && trabalho.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

   // @Override
    public void removerServico(String codigo) {
        for (int i = 0; i < listaServico.size(); i++) {
            if (listaServico.get(i) != null && listaServico.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                listaServico.remove(i);
            }
        }

    }

    @Override
    public Servico mostrarServico(String codigo) {
        for (Servico servico : listaServico) {
            if (servico != null && servico.getCodigo().equalsIgnoreCase(codigo)) {
                return servico;
            }
        }
        return null;
    }

    @Override
    public void substituirServico(Servico s) {
        for (int i = 0; i < listaServico.size(); i++) {
            if (listaServico.get(i) != null && s.getCodigo().equalsIgnoreCase(listaServico.get(i).getCodigo())) {
                listaServico.remove(i);
                listaServico.add(s);
            }
        }
    }

    @Override
    public Servico inserirServicoCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerServico(String codigo, int prazo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


