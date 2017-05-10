/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scm;

import java.util.Scanner;

/**
 *
 * @author katunaric
 */
public class Pessoa {
        public static void main(String args[]) {
 
            SCM pessoa = new SCM("João", 45);
            Scanner in = new Scanner(System.in);
            
            // alteração na BranchUm
        int op;
        
        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
        System.out.println("\nDeseja viajar 1 ano no futuro?");
        System.out.println("Digite 1 para sim ou 2 para não:");
        
        op = in.nextInt();
        
        switch (op){
            case 1:
                
                
                System.out.println(pessoa.getNome() + " tem " + FazAniver.fazAniver(pessoa.getIdade()) + " anos");
                break;
            default:
                System.out.println("Resposta incorreta!");
        }
    
}
}
