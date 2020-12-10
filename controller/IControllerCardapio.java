
package controller;

import Excecoes.CardapioException;


public interface IControllerCardapio {
  
    
    void mostrarCardapio(int codigo) throws CardapioException;

    int confirmarPrato(int codigo) throws CardapioException;
    
   
}


