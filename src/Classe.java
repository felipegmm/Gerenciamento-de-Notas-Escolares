import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;

public class Classe {
    private Aluno[] alunos;
    private double mediaClasse = 0;


    public Classe(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public double calculaMediaClasse() {
        double sum = 0.0;

        for (Aluno aluno : alunos) {
            sum += aluno.calculaMediaAluno();
        }
        mediaClasse = sum / alunos.length;
        return mediaClasse;
    }

    public static void arredondaMediaClasse(double valor) {
        System.out.println("Média da classe: " + new DecimalFormat("#,##0.00").format(valor));
    }

    public void relatorio() {

        System.out.println("\n-------------Relatorio da turma-------------");
        if (alunos != null && alunos.length != 0) {
            for (Aluno aluno : alunos) {
                System.out.print("Nome: " + aluno.getNome() + "\n" +
                        "\t nota 1: " + aluno.getNota1() + "\t nota 2: " + aluno.getNota2() +
                        "\t nota 3: " + aluno.getNota3() + "\t nota 4: " + aluno.getNota4() +
                        ",\t total: " + aluno.somaNotas()+",\t");
                Aluno.arredondaMediaAluno(aluno.calculaMediaAluno());
            System.out.println("\t\tresutado final: " + aluno.imprimeResultado()+"\n");
            }
            arredondaMediaClasse(calculaMediaClasse());
            return;
        }
        System.out.println("Nenhum aluno matriculado.");
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public double getMediaClasse() {
        return mediaClasse;
    }
}

