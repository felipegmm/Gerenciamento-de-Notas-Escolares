public class AlunosTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joãozinho", "12.187-9", new double[]{2.00, 2.50, 3.65, 8.00});
        Aluno aluno2 = new Aluno("Mariazinha", "12.763-8", new double[]{4.45, 3.05, 6.70, 6.40});
        Aluno aluno3 = new Aluno("Chiquinha", "12-239-0", new double[]{7.85, 6.70, 8.50, 8.90});
        Aluno aluno4 = new Aluno("Ritinha", "12.563-8", new double []{9.00, 8.25, 6.75, 8.50});


        Classe classe = new Classe(new Aluno[]{aluno1, aluno2, aluno3, aluno4});

        System.out.println("\n---------------Relatorio de aluno----------------");
        aluno1.print();
        aluno2.print();
        aluno3.print();
        aluno4.print();

        classe.relatorio();


    }
}

