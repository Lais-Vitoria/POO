//Minha Classe
public class Pessoa{

    private String nome;
    private int idade;

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

    //Encapsulamento
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

}