/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Mulay
 */
public class EjerciciosNivel01_2021 {

    //Declaro un array de integers para hacer pruebas
    
    int[] listaNumeros = {333, 31, 200, 20, 5, 99};
        
    public int maximo(int[] lista){
        int auxiliar = lista[0]; //el máximo va a ser el primer elemento del array
        for (int i=0; i< lista.length; i++){
            if (auxiliar < lista[i]){
                auxiliar = lista[i];
            }
        }
       return auxiliar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01_2021 ejercicio = new EjerciciosNivel01_2021();
        System.out.println(ejercicio.listaNumeros[1]); 
        System.out.println("el máximo es " + ejercicio.maximo(ejercicio.listaNumeros));
        
    }
    
}
