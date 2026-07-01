package exercicios;

public class Exercicio16ControleDeEmbarque {

    public static void main(String[] args) {

        int embarquesLiberados = 0;
        int embarquesNegados = 0;

        for (int passageiro = 1; passageiro <= 4; passageiro++) {

            switch (passageiro) {
                case 1:
                    System.out.println("Passageiro " + passageiro + ": Lucas");
                    break;

                case 2:
                    System.out.println("Passageiro " + passageiro + ": Mariana");
                    break;

                case 3:
                    System.out.println("Passageiro " + passageiro + ": Rafael");
                    break;

                case 4:
                    System.out.println("Passageiro " + passageiro + ": Juliana");
                    break;

                default:
                    System.out.println("Passageiro inválido");
            }

            boolean possuiPassagem = passageiro != 4;
            boolean documentoValido = passageiro != 2;
            boolean passageiroBloqueado = passageiro == 3;

            boolean embarqueLiberado =
                    possuiPassagem &&
                            documentoValido &&
                            !passageiroBloqueado;

            if (embarqueLiberado) {
                System.out.println("Embarque liberado");
                embarquesLiberados++;

            } else if (passageiroBloqueado) {
                System.out.println("Embarque negado: passageiro bloqueado");
                embarquesNegados++;

            } else if (!documentoValido) {
                System.out.println("Embarque negado: documento inválido");
                embarquesNegados++;

            } else {
                System.out.println("Embarque negado: passagem não encontrada");
                embarquesNegados++;
            }

            System.out.println();
        }

        System.out.println("Resumo final:");
        System.out.println("Embarques liberados: " + embarquesLiberados);
        System.out.println("Embarques negados: " + embarquesNegados);
    }
}