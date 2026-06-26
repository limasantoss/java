package exercicios ;
public class Exercicio08ControleDeAlunos{
    public static void main (String[] args){
        for(int aluno = 1  ; aluno <= 3 ; aluno++){
            switch (aluno){
                case 1 :
                    System.out.println("Aluno " + aluno + " : Igor");
                    break;
                case 2 :
                    System.out.println("Aluno  " + aluno + " : Ana");
                    break;
                case 3 :
                    System.out.println("Aluno " + aluno + " : Carlos");
                    break;
                default:
                    System.out.println("Aluno invalido");


            }
            boolean matriculaAtiva = aluno != 2 ; //true | false | true
            boolean notaInsuficiente = aluno != 3; //true | true  | false
            boolean alunoBloqueado = aluno == 3; // false  | false | true
            boolean alunoAprovado = matriculaAtiva && !notaInsuficiente && alunoBloqueado;

            if (alunoAprovado) {
                System.out.println("Aluno aprovado");
            } else if (alunoBloqueado) {
                System.out.println("Aluno reprovado: aluno bloqueado");
            } else if (!matriculaAtiva) {
                System.out.println("Aluno reprovado: matrícula inativa");
            } else {
                System.out.println("Aluno reprovado: nota insuficiente");
            }
            System.out.println();
        }
    }
}