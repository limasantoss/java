package exercicios;
public  class Exercicio13ControleDeEntrada {
    public static void main(String[] args) {
        for (int pessoas = 1; pessoas <= 4; pessoas++) {
            int entradaLiberada = 0;
            int entradaBloquada = 0;

            switch (pessoas) {
                case 1:
                    System.out.println(" Pessoa " + pessoas + " Igor ");
                    break;
                case 2: // false
                    System.out.println(" Pessoa " + pessoas + " Ana ");
                    break;
                case 3: // true
                    System.out.println(" Pessoa " + pessoas + " Carlos ");
                    break;
                case 4:// true
                    System.out.println(" Pessoa " + pessoas + " Julia ");
                    break;
                default:
                    System.out.println(" Pessoa não  encontrada  ");
            }
            boolean entradaPermitida = pessoas != 2; // 1 , 3,4
            boolean entradaNegada_ingressoInvalido = pessoas !=3; ;// 1 , 2 , 4
            boolean entradaNegada_documentoInvalido = pessoas == 3 ;
            if (entradaPermitida) {
                System.out.println("Entrada Permitida");
            } else if (entradaNegada_ingressoInvalido) {
                System.out.println(" Entrada Negada : ingresso invalido ");
            }else if(entradaNegada_documentoInvalido){
                System.out.println("Entrada negada documento invalido");
            }
        }
    }
}