package exercicios;

public class Exercicio02ControleDeEstacionamento {
    public static void main(String[] args){
        boolean temvaga = true;
        boolean motoristaHabilitado = true ;
        boolean veiculoBloqueado = false;
        boolean entradaLiberada = temvaga && !veiculoBloqueado && motoristaHabilitado;
        for(int veiculo = 1 ; veiculo <= 3 ; veiculo++){
            switch (veiculo){
                case 1 :
                    System.out.println("Veiculo" + veiculo +" Moto");
                    break;
                case 2 :
                    System.out.println("Veiculo" + veiculo + "Carro");
                    break;
                case 3 :
                    System.out.println("Veiculos" + veiculo + "Caminhão");
                    break;
                default:
                    System.out.println("Veiculo invalido");
            }
            if(entradaLiberada){
                System.out.println("Entrada Liberada");
            } else if(veiculoBloqueado){
                System.out.println("Entrada Negada : Veiculo bloqueado");
            }else{
                System.out.println("Entrada negada:verifique a vaga ou habilitação");
            }
            System.out.println();
        }
    }
}
