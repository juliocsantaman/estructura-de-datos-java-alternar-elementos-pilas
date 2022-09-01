/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alternarelementospilas;

import java.util.Stack;

/**
 *
 * @author Julio Cesar Santaman.
 */
public class AlternarElementosPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack<String> miPila1 = new Stack();
        Stack<String> miPila2 = new Stack();
        Stack<String> miPila3 = new Stack();
        
        //miPila1 va a tener valores: 1, 2 y 3.
        for(int i=1; i<=3; i++) {
            miPila1.push(String.valueOf(i));
        }
        
        
        //miPila2 va a tener valores: a, b y c.
        for(char a='a'; a<='c'; a++) {
            miPila2.push(Character.toString(a));
        }
        
       
        
        //miPila3, contiene los valores alternados.
        // 3, c, 2, b, 1, a.
        
        for(int i=0; i<3; i++) {
            miPila3.push(miPila1.pop());
            miPila3.push(miPila2.pop());
        }
        
        
        //Imprimiendo miPila3.
        System.out.println("/***** VALORES ALTERNADOS *****/");
        while(!miPila3.isEmpty()) {
            System.out.println(miPila3.pop());
        }
     
        
        
    }
    
}
