package exe1;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.numeroAluno=0;
        aluno1.nome="Suellen";
        aluno1.idade=25;
        aluno1.p1= 3;
        aluno1.p2= 7;

        aluno1.dadosAluno();
        aluno1.notaFinal();
        aluno1.passou();

        Aluno aluno2 = new Aluno(1,"Silver", 25, 8, 9);
        aluno2.dadosAluno();
        aluno2.notaFinal();
        aluno2.passou();

    }
}
