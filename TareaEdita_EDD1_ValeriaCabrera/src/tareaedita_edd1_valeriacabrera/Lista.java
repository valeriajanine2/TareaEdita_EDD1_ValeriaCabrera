/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaedita_edd1_valeriacabrera;

/**
 *
 * @author Usuario
 */
public abstract class Lista {
  
    protected int tope;
    protected char [] elementos = new char [100];
    
    public Lista(int tope, char [] elementos){
        this.tope=tope;
        this.elementos=elementos;
    }
    
    abstract void METE(char c, Lista P);
    abstract void SACA(Lista P);
    abstract void ANULA(Lista P);
    abstract void IMPRIME_LISTA(Lista P);
    
    
    
}
