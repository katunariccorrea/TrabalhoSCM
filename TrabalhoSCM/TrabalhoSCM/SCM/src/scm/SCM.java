package scm;

class SCM {
    public String nome;
    public int idade;

    public SCM(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
   //     SCM novaPessoa;
 //       novaPessoa = new SCM();
        
   //     novaPessoa.nome = "Mike";
   //     novaPessoa.idade = 84;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}