package exercicios;

public class Exercicio05ControleDeTreinos{
    public static  void main(String[] args){
        boolean temEnergia = true ;
        boolean tenisAdequado = true ;
        boolean estaLesionado = false ;

        boolean treinoLiberado = temEnergia & tenisAdequado & !estaLesionado;

        for(int treino = 1; treino <=3; treino++){
            switch (treino) {
                case 1:
                    System.out.println(" Treino " + treino   + " Corrida leve ");
                    break;
                case 2:
                    System.out.println(" Treino " + treino   + " Corrida moderada ");
                    break;
                case 3:
                    System.out.println(" Treino "  +  treino   +  "Corrida forte ");
                    break;
                default:
                    System.out.println(" Treino invalido ");
            };
                if(treinoLiberado){
                    System.out.println(" Treino Liberado ");
                }else if(estaLesionado){
                    System.out.println(" esta lesionado ");
                }else{
                    System.out.println(" Treino bloqueado: falta de energia ou tenis adequado ");
                }
                System.out.println();
            }
        }
    }
