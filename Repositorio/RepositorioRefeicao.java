
package Repositorio;

import Excecoes.RefeicaoException;
import Modelo.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioRefeicao implements IRepositorioRefeicao {

    public static IRepositorioRefeicao getInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

	private String nomeRefeicao;
	private List<Prato> componentesRefeicao;
	private String descricaoRefeicao;

	
	public RepositorioRefeicao(String nomeRefeicao, String descricaoRefeicao) throws RefeicaoException {
		this.nomeRefeicao = nomeRefeicao;
		this.descricaoRefeicao = descricaoRefeicao;
		this.componentesRefeicao = new ArrayList<Prato>();
	}

	public void addPrato(Prato prato) {
		this.componentesRefeicao.add(prato);
	}

	
	public String getNome() {
		return this.nomeRefeicao;
	}

	
	public void setNome(String nomeRefeicao) {
		this.nomeRefeicao = nomeRefeicao;
	}

	public List<Prato> getConjuntoPratos() {
		return this.componentesRefeicao;
	}

	
	public String getDescricaoRefeicao() {
		return this.descricaoRefeicao;
	}

	
	public void setDescricaoRefeicao(String descricaoRefeicao) {
		this.descricaoRefeicao = descricaoRefeicao;
	}

	

	public double calculaPrecoRefeicao() {

		double preco = 0;

		for (Prato prato : this.componentesRefeicao) {
			preco += prato.getPreco();
		}
		return preco * 0.9;
	}

	
	public boolean equals(Object obj) {
		if (obj instanceof Cardapio) {
			Cardapio outraRefeicao = (Cardapio) obj;
			if (this.nomeRefeicao.equalsIgnoreCase(outraRefeicao.nomeRefeicao)) {
				if (this.componentesRefeicao.equals(outraRefeicao.componentesRefeicao)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Metodo responsavel por <b>retornar a formatacao em String do objeto</b>.
	 */
	public String toString() {
		String precoFormatado = String.format("R$%.2f", this.getPreco());
		precoFormatado = precoFormatado.replace(".", ",");
		return "Nome: " + this.getNome() + " Preco: "  + "Descricao: "
				+ this.getDescricaoRefeicao() + "Pratos: " + this.pratosDaRefeicao();
	}
//retorna o preço da refeição
        
	public double getPreco() {
		return this.calculaPrecoRefeicao();
	}

	/**
	 * Metodo responsavel por <b>retornar os nomes dos pratos da refeicao</b>
	 * 
	 * @return os nomes dos pratos concatenados <b>String</b>
	 */
	public String pratosDaRefeicao() {
		String descricao = "";
		for (int i = 0; i < this.componentesRefeicao.size(); i++)
			if (!(i == this.componentesRefeicao.size() - 1)) {
				descricao += this.componentesRefeicao.get(i).getNome() + ", ";
			} else {
				descricao += this.componentesRefeicao.get(i).getNome() + ".";
			}

		return descricao;
	}

	/**
	 * Metodo responsavel por <b>retornar os componentes da refeicao".
	 * 
	 * @return compnentes do tipo <b>String</b>
	 */
	public String getComponentesRefeicao() {
		String descricao = "";
		descricao = this.descricaoRefeicao.substring(0, this.descricaoRefeicao.length() - 1);
		descricao += "." + " Serao servidos: ";
		for (int i = 0; i < this.componentesRefeicao.size(); i++)
			if (!(i == this.componentesRefeicao.size() - 1)) {
				descricao += "(" + (i + 1) + ") " + this.componentesRefeicao.get(i).getNome() + ", ";
			} else {
				descricao += "(" + (i + 1) + ") " + this.componentesRefeicao.get(i).getNome() + ".";
			}

		return descricao;
	}

   // @Override
    public String nomeRefeicao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


