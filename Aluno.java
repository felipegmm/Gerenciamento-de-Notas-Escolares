package PIMIV_II;

public class Aluno {
    public String nome;
    private String matricula;
    private double[] notas;
    protected double total;
    protected double media;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;


    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double getNotaIndex(int index) {
        if (index > 3) return -1.0;

        return notas[index];
    }

    public double calculaNotaProvaI() {
        nota1 = notas[0] * 1;
        return nota1;
    }

    public double calculaNotaProvaII() {
        nota2 = notas[1] * 2;
        return nota2;
    }

    public double calculaNotaProvaIII() {
        nota3 = notas[2] * 3;
        return nota3;
    }

    public double calculaNotaProvaIV() {
        nota4 = notas[3] * 4;
        return nota4;
    }

    public double somaNotas() {
        total = 0;
        for (int i = 0; i<4; i++) {
            total = total + (notas[i] * (i+1) );
        }
        return total;
    }

    public double calculaMedia() {
        media = somaNotas() / 10;
        return media;
    }

    public String imprimeResultado() {
        if (Math.ceil(calculaMedia()) >= 5) {
            return "Aprovado(a)";
        }
        return "Reprovado(a)";
    }

    public void print() {

        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
        System.out.printf("Nota da prova 1 = %.2f", calculaNotaProvaI());
        System.out.printf("%nNota da prova 2 = %.2f", calculaNotaProvaII());
        System.out.printf("%nNota da prova 3 = %.2f", calculaNotaProvaIII());
        System.out.printf("%nNota da prova 4 = %.2f", calculaNotaProvaIV());
        System.out.printf("%nNotas somadas = %.2f", somaNotas());
        System.out.printf("%nMédia %.2f", calculaMedia());                      // resolver esse pepino;
        System.out.printf("%nResultado final: %s", imprimeResultado());
        System.out.println("\n---------------------------------" + "\n");
    }

//    public void print() {
//        System.out.println("Nome: " + getNome());
//        System.out.println("Matricula: " + getMatricula());
//        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Nota da prova " + (i + 1) + " = " + notas[i]);
//        }
//        System.out.printf("%nMédia %.2f", media);
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
