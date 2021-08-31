/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaedita_edd1_valeriacabrera;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Lista {
  
    protected ArrayList<Character> elementos = new ArrayList();
    
    public Lista(){
        //constructor vacio
    }
    
    public Lista(ArrayList<Character> elementos){
        this.elementos=elementos;
    }
    
    abstract void METE(char c, Lista P);
    abstract void SACA(Lista P);
    abstract void ANULA(Lista P);
    abstract void IMPRIME_LISTA(Lista P);
    abstract boolean VACIA(Lista P);
    
    
    
}
