package exe1;

import javax.swing.*;

public class Aluno {

    public int numeroAluno, idade;
    public String nome;
    public float p1, p2, media;

    public Aluno() {
        this.nome = "Sem nome";
    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }

    public void dadosAluno() {
        JOptionPane.showMessageDialog(null, "Código do aluno: " + this.numeroAluno +
                            "\nNome do aluno: " + this.nome +
                            "\nIdade: " + this.idade +
                            "\nSituação: " + this.passou() +
                            "\n-----------------------------------------");
    }

    public String passou(){
        return (this.notaFinal() >= 6) ? "Passou": "Não passou";
    }



}
