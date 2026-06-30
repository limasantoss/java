package exercicios;
public class Exercicio14ControleDeEmprestimos {
    public static void main(String[] args) {
        int emprestimoLiberados = 0;
        int emprestimosNegados = 0;

        for (int livro = 1; livro <= 4; livro++) {
            switch (livro) {
                case 1:
                    System.out.println(" Livro " + livro + " Java Basico ");
                    break;
                case 2:
                    System.out.println(" Livro " + livro + " Algoritmos ");
                    break;
                case 3:
                    System.out.println(" Livro " + livro + " Banco de dados ");
                    break;
                case 4:
                    System.out.println(" Livro " + livro + " Redes de Computadores ");
                    break;
                default:
                    System.out.println("Livro infantil");
            }
            boolean usuarioAtivo = livro != 2;
            boolean livroDisponivel = livro != 3;
            boolean multaPendente = livro == 4;

            boolean emprestimoLiberado = usuarioAtivo && livroDisponivel && !multaPendente;

            if (emprestimoLiberado) {
                System.out.println("Emprestimo Liberado");
                emprestimoLiberados++;
            }else if(multaPendente){
                System.out.println("Emprestimo negado : usuario possui multa pendente");
                emprestimosNegados++;
            }else if(!usuarioAtivo){
                System.out.println("Emprestimo negado : usuario inativo");
                emprestimosNegados++;
            }else {
                System.out.println("Emprestimo negado : Livro indisponivel");
                emprestimosNegados++;
            }
            System.out.println();
        }
        System.out.println("Resumo");
        System.out.println("Emprestimo liberados"  + emprestimoLiberados);
        System.out.println("Emprstimo Negados :" + emprestimosNegados );
    }
}