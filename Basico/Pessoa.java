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
    public void mostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
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
        if( idade >= 0){
            this.idade = idade;
        }
        else
            System.out.println("Idade invalida, não exixte idade negativa!");
    }

}