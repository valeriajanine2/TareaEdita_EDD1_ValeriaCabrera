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
public class Pila extends Lista{
    
    public Pila(){
        super();
    }
    
    public Pila(ArrayList<Character> elementos){
        super(elementos);
    }
    
    @Override
    boolean VACIA(Lista P){
        if(P.elementos.size()==0){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    void METE(char c, Lista P){
        P.elementos.add(c);
    }
    
    @Override
    void SACA(Lista P){
        P.elementos.remove(P.elementos.size()-1);
    }
    
    @Override
    void ANULA(Lista P){
        P.elementos.clear();
    }
    
    @Override
    void IMPRIME_LISTA(Lista P){
        if(P.VACIA(P)){
            System.out.println("La pila esta vacia");
        }else{
            for (int i = 0; i < P.elementos.size(); i++) {
                System.out.println(P.elementos.get(i));
            }
        } 
    }
    
}
