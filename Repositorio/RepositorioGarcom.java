package Repositorio;

import Modelo.Endereco;
import Modelo.Garcom;

import java.util.ArrayList;
import java.util.List;

public  class RepositorioGarcom implements IRepositorioGarcom {

    private static RepositorioGarcom instancia;
    private List<Garcom> listaGarcom;

    private RepositorioGarcom() {
        listaGarcom = new ArrayList<>();
    }

    public static RepositorioGarcom getInstancia() {
        if (instancia == null) {
            instancia = new RepositorioGarcom();
        }
        return instancia;
    }

    @Override
    public void inserirGarcom(Garcom garcom) {
        listaGarcom.add(garcom);
    }

    public void trocarGarcom(String codigo, Garcom novoGarcom) {
        for (int i = 0; i < listaGarcom.size(); i++) {
            if (listaGarcom.get(i) != null && listaGarcom.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                listaGarcom.remove(i);
                listaGarcom.add(novoGarcom);
            }
        }
    }

    @Override
    public Garcom pesquisarGarcomCodigo(String codigo) {
        for (Garcom garcom : listaGarcom) {
            if (garcom != null && garcom.getCodigo().equalsIgnoreCase(codigo)) {
                garcom.setCpf(null);
                garcom.setCargaH(0);
                garcom.setSalario(0);
                return garcom;
            }
        }
        return null;
    }

    @Override
    public Garcom pesquisarGarcomCodigo(String codigo, String cpf) {
        for (Garcom garcom : listaGarcom) {
            if (garcom != null && garcom.getCodigo().equalsIgnoreCase(codigo) && garcom.getCodigo().equalsIgnoreCase(cpf)) {
                return garcom;
            }
        }
        return null;
    }

    public boolean existeProfessor(String codigo) {
        for (Garcom garcom : listaGarcom) {
            if (garcom != null && garcom.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }

    public void removerProfessorCodigo(String codigo) {
        for (int i = 0; i < listaGarcom.size(); i++) {
            if (listaGarcom.get(i) != null && listaGarcom.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                listaGarcom.remove(i);
            }
        }
    }

    @Override
    public void aumentarSalario(String codigo) {
        for (Garcom garcom : listaGarcom) {
            if (garcom != null && garcom.getCodigo().equalsIgnoreCase(codigo)) {
                garcom.setSalario(garcom.getSalario() + (garcom.getSalario() * 0.1));
            }
        }
    }

    public void aumentarSalario(String codigo, double quantidade) {
        for (Garcom garcom : listaGarcom) {
            if (garcom != null && garcom.getCodigo().equalsIgnoreCase(codigo)) {
                garcom.setSalario(garcom.getSalario() + quantidade);
            }
        }
    }

    public void removerEndGancom(String codigo) {
        for (int i = 0; i < listaGarcom.size(); i++) {
            if (listaGarcom.get(i) != null && listaGarcom.get(i).getCodigo().equalsIgnoreCase(codigo) && listaGarcom.get(i).getEndereco() != null) {
                listaGarcom.get(i).setEndereco(null);
            }
        }
    }

    public boolean trocarEndGarcom(String codigo, Endereco endereco) {
        for (Garcom garcom : listaGarcom) {
            if (garcom != null && garcom.getCodigo().equalsIgnoreCase(codigo) && garcom.getEndereco() != null) {
                garcom.setEndereco(endereco);
                return true;
            }
        }
        return false;
    }


    public boolean inserirEnderecoGarcom(Endereco endereco, String codigo) {
        for (Garcom garcom : listaGarcom) {
            if (garcom != null && garcom.getCodigo().equalsIgnoreCase(codigo) && garcom.getEndereco() == null) {
                garcom.setEndereco(endereco);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existeGarcom(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerGarcomCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public boolean checarFuncionario(Garcom g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerGarcom(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Garcom pesquisarGarcom(String codigo, String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerEndGarcon(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean inserirEndGarcom(Endereco endereco, String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
