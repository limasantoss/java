package exercicios;

public class Exercicio17ControleDeMatriculas {

    public static void main(String[] args) {

        int matriculasAprovadas = 0;
        int matriculasNegadas = 0;

        for (int aluno = 1; aluno <= 4; aluno++) {

            switch (aluno) {
                case 1:
                    System.out.println("Aluno " + aluno + ": Pedro");
                    break;

                case 2:
                    System.out.println("Aluno " + aluno + ": Laura");
                    break;

                case 3:
                    System.out.println("Aluno " + aluno + ": Bruno");
                    break;

                case 4:
                    System.out.println("Aluno " + aluno + ": Camila");
                    break;

                default:
                    System.out.println("Aluno inválido");
            }

            boolean documentosCompletos = aluno != 2;
            boolean pagamentoEfetuado = aluno != 3;
            boolean alunoBloqueado = aluno == 4;

            boolean matriculaAprovada =
                    documentosCompletos &&
                            pagamentoEfetuado &&
                            !alunoBloqueado;

            if (matriculaAprovada) {
                System.out.println("Matrícula aprovada");
                matriculasAprovadas++;

            } else if (alunoBloqueado) {
                System.out.println("Matrícula negada: aluno bloqueado");
                matriculasNegadas++;

            } else if (!pagamentoEfetuado) {
                System.out.println("Matrícula negada: pagamento pendente");
                matriculasNegadas++;

            } else {
                System.out.println("Matrícula negada: documentação incompleta");
                matriculasNegadas++;
            }

            System.out.println();
        }

        System.out.println("Resumo final:");
        System.out.println("Matrículas aprovadas: " + matriculasAprovadas);
        System.out.println("Matrículas negadas: " + matriculasNegadas);
    }
}