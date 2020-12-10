package Repositorio;

import Modelo.Gerente;
import Modelo.Endereco;
import java.util.ArrayList;
import java.util.List;


public class RepositorioGerente implements IRepositorioGerente {

    private static RepositorioGerente instancia;
    private final List<Gerente> listaGerente;

    private RepositorioGerente() {
        listaGerente = new ArrayList<>();
    }

    public static RepositorioGerente getInstancia() {
        if (instancia == null) {
            instancia = new RepositorioGerente();
        }
        return instancia;
    }

    public void substituirGerente(String codigo, Gerente novoGerente) {
        for (int i = 0; i < listaGerente.size(); i++) {
            if (listaGerente.get(i) != null && listaGerente.get(i).getCodigo().equals(codigo)) {
                listaGerente.remove(i);

                listaGerente.add(novoGerente);
            }
        }
    }

    public void inserirGerente(Gerente gerente) {
        listaGerente.add(gerente);
    }

    public boolean existeGerente(String codigo) {
        for (Gerente gerente : listaGerente) {
            if (gerente != null && gerente.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void removerGerenteCodigo(String codigo) {
        for (int i = 0; i < listaGerente.size(); i++) {
            if (listaGerente.get(i) != null && listaGerente.get(i).getCodigo().equals(codigo)) {
                listaGerente.remove(i);
            }
        }
    }

    @Override
    public void removerEndGerente(String codigo) {
        for (int i = 0; i < listaGerente.size(); i++) {
            if (listaGerente.get(i) != null && listaGerente.get(i).getCodigo().equals(codigo)) {
                listaGerente.get(i).setEndereco(null);
            }
        }
    }

    @Override
    public Gerente PesquisarGerenteCodigo(String codigo, String cpf) {
        for (Gerente gerente : listaGerente) {
            if (gerente != null && gerente.getCodigo().equals(codigo) && gerente.getCodigo().equals(cpf)) {
                return gerente;
            }
        }
        return null;
    }

    @Override
    public boolean TrocarEndGerente(String codigo, Endereco endereco) {
        for (Gerente gerente : listaGerente) {
            if (gerente != null && gerente.getCodigo().equals(codigo) && gerente.getEndereco() != null) {
                gerente.setEndereco(endereco);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean inserirEndGerente(Endereco endereco, String codigo) {
        for (Gerente gerente : listaGerente) {
            if (gerente != null && gerente.getCodigo().equals(codigo) && gerente.getEndereco() == null) {
                gerente.setEndereco(endereco);
                return true;
            }
        }
        return false;
    }

    @Override
    public void AtualizarSalarioGerente(String codigo, Double novoSalario) {
        for (Gerente gerente : listaGerente) {
            if (gerente != null && gerente.getCodigo().equals(codigo)) {
                gerente.setSalario(novoSalario);
            }
        }
    }

    @Override
    public void aumentarSalarioGerente(String codigo) {
        for (Gerente gerente : listaGerente) {
            if (gerente != null && gerente.getCodigo().equals(codigo)) {
                gerente.setSalario(gerente.getSalario() + (gerente.getSalario() * 0.1));
            }
        }
    }

}


