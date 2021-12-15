/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresjava;

/**
 *
 * @author Ismael
 */
public class VectoresJava {

    /**
     Programa que carga automáticamente en un vector las letras del abecedario indicando el tamaño del vector en una constante.
     */
    public static void main(String[] args) {
    final int TAMANO = 26;
    char[] listaLetras = new char[TAMANO];
    char letra = 'A';
 
    //Asignación de letras a cada elemento del vector
    for(int i=0; i<TAMANO; i++) {
        listaLetras[i] = letra;
        letra++;
    }
 
    //Mostrar en pantalla el vector
    for(int i=0; i<TAMANO; i++) {
        System.out.print(listaLetras[i]+" ");
    }
    }
    
}
