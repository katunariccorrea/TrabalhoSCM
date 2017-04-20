package scm;
import java.util.Scanner;

class SCM {
    public String nome;
    public int idade;
    
    
 //torna um ano mais velho
    public static int fazAniversario(int aniversario){
    aniversario++;    
    return aniversario;
}
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        SCM novaPessoa;
        novaPessoa = new SCM();
        
        novaPessoa.nome = "Mike";
        novaPessoa.idade = 84;
        int op;
        
        System.out.println(novaPessoa.nome + " tem " + novaPessoa.idade + " anos");
        System.out.println("\nDeseja viajar 1 ano no futuro?");
        System.out.println("Digite 1 para sim ou 2 para nÃ£o:");
        
        op = in.nextInt();
        
        switch (op){
            case 1:
                novaPessoa.idade = fazAniversario(novaPessoa.idade);
                System.out.println(novaPessoa.nome + " tem " + novaPessoa.idade + " anos");
                break;
            default:
                System.out.println("Resposta incorreta!");
        }
    
}
}