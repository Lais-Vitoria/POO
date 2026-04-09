public class Aluno extends Pessoa{

    private int matricula;

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    //Polimorfismo usando override
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Matricula: " + getMatricula());
    }

}