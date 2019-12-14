package PIMIV_II;

public class Classe {

    private Aluno[] alunos;
    private double mediaClasse = 0;


    public Classe( Aluno[] alunos){
        this.alunos = alunos;
    }

    public void  calculaMediaClasse () {
        double sum  = 0.0;

        for (Aluno aluno : alunos){
            sum += aluno.calculaMedia();
        }

        System.out.println("Media da Classe: "+ (sum / alunos.length));
    }

    public void relatorio() {

        System.out.println("\n-------------Relatorio da turma-------------");
        if (alunos != null && alunos.length != 0) {
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome() +
                        ",\t nota 1: " + aluno.getNotaIndex(0) + ",\t nota 2: " + aluno.getNotaIndex(1) +
                        ",\t nota 3: " + aluno.getNotaIndex(2) + ",\t nota 4: " + aluno.getNotaIndex(3) +
                        ",\t total: " + aluno.somaNotas() + ",\t média: " + aluno.calculaMedia() +
                        ",\t resutado final: " + aluno.imprimeResultado());
            }
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

}
