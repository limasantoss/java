package exercicios;
public class Exercicio10ControleDeEntregas {
    public static void main(String[] args){
        for(int entrega = 1 ; entrega <= 3 ; entrega++){
            switch (entrega){
                case 1: // entrega liberada
                    System.out.println(" Entrega  " + entrega + " Pizza");
                    break;
                case 2:
                    System.out.println(" Entrega " + entrega + " Remédio");
                    break;
                case 3:
                    System.out.println(" Entrega " + entrega + " Documento");
                    break;
                default:
                    System.out.println("Entrega Cancelada");

            }
            boolean entregaLiberada = entrega != 2;// true
            boolean enderecoInvalido = entrega != 3; // true
            boolean  entregaCancelada = entrega ==3; // false
            boolean entregaFeita = entregaLiberada && enderecoInvalido && !entregaCancelada;

            if(entregaFeita){
                System.out.println("Entrega liberada");
            }else if(enderecoInvalido){
                System.out.println("Entrega bloqueada : Endereço invalido");
            }else if(entregaCancelada){
                System.out.println("Entrega Bloqueada : Entrega Cancelada");
            }else{
                System.out.println("Entrega bloqueada : Entregador indisponivel ");
            }
            System.out.println();

        }
    }
}