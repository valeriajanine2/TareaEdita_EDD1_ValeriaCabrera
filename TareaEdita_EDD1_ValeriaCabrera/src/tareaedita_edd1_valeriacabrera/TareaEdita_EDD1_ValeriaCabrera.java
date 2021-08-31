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
public class TareaEdita_EDD1_ValeriaCabrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editor e = new Editor();
        
        //editar texto
        e.EDITA('a');
        e.EDITA('b');
        e.EDITA('c');
        e.EDITA('#');
        e.EDITA('d');
        e.EDITA('#');
        e.EDITA('#');
        e.EDITA('e');
        e.EDITA('f');
        e.EDITA('g');
        e.EDITA('#');
        
        //obtener pila generada
        System.out.println("PILA GENERADA: ");
        Pila P = e.getPila();
        P.IMPRIME_LISTA(P);
        System.out.println("");
        
        //anular
        System.out.println("Anulando la lista....");
        e.EDITA('@');
        P.IMPRIME_LISTA(P);
        
    }
    
}
