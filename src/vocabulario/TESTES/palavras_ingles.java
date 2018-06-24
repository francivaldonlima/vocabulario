/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabulario.TESTES;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author francivaldo
 */
class palavras_ingles {

    public static void main(String[] args) {

        int x = 5;
        int n;
        SortedSet<Integer> z = new TreeSet<Integer>();

        while (x <= 7) {

            n = (int) Math.round(Math.random() * 10);
            z.add(n);

            x = z.size();
           

        }
        
         System.out.println(x + " --  tamanho");
            System.out.println(z);

    }

}
