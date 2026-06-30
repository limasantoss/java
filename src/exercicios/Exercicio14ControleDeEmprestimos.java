package exercicios;
public static void main(String[] args){
    int emprestimoLiberados = 0;
    int emprestimosNegados = 0;

    for(int livro = 1; livro <= 4; livro++){
        switch (livro){
            case 1:
            System.out.println("Livro" + livro + "Java Basico");
            break;
            case 2:
                System.out.println("Livro "+ livro + "Algoritmos");
                break;
            case 3:
                System.out.println("Livro " + livro + " Banco de dados");
                break;
            case 4:
                System.out.println("Livro" + livro + "Redes de Computadores");
                break;
            default:
                System.out.println("Livro infantil");
        }
        boolean usuarioAtivo = livro != 2;
        boolean livroDisponivel = livro !=3;
    }
}