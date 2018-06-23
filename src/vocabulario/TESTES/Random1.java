/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabulario.TESTES;

/**
 *
 * @author francivaldo
 */
import java.util.Random;

public class Random1 {

    public static void main(String[] args) {

//        //instância um objeto da classe Random usando o construtor padrão
//        Random gerador = new Random();
//         
//        //imprime sequência de 10 números inteiros aleatórios
//        for (int i = 0; i < 10; i++) {
//            System.out.println(gerador.nextInt(5));
//            
        Random rn = new Random();

        for (int i = 0; i < 5; i++) {
            int answer = rn.nextInt(5) + 1;
            System.out.println(answer);
        }

    
}
}
