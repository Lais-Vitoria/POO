//Minha Classe
plubic class Pessoa{

    public String nome;
    public int idade;

    //Construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Metodo
    public void mostrarDados(String nome1, int idade1){
        System.out.println("Nome: " + nome1);
        System.out.println("Idade: " + idade1);
    }
}