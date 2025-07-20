
package com.mycompany.vetor04;

import java.util.Arrays;


public class Vetor04 {

    public static void main(String[] args) {
        int num[] = {3, 9, 8, 7, 5};
        
       
        int posicao = Arrays.binarySearch(num, 8);
        System.out.println(posicao);
        
    }
}
