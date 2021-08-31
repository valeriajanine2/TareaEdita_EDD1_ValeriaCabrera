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
public class Editor {
    
    private Pila P = new Pila();
    private char c;
    
    public Editor(){
        
    }
    
    public Editor(char c){
        this.c=c;
    }
    
    public void EDITA(){
        this.P.ANULA(P);
        if(c == '#'){
            P.SACA(P);
        }else if(c == '@'){
            P.ANULA(P);
        }else{
            P.METE(c, P);
        }
        P.IMPRIME_LISTA(P);
    }
    
}
