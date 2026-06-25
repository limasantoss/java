package exercicios;
public  class Exercicio04ControleDeEntregas{
    public static void main(String[] args){
        boolean enderecovalido = true;
        boolean produtoSeparado = true;
        boolean entregaCancelada = false ;

        boolean entregaLiberada = enderecovalido & produtoSeparado & entregaCancelada;

        for(int entrega = 1;  entrega <=3; entrega++){
            switch (entrega){
                case 1:
                    System.out.println("Entrega" +  entrega + ": Notebook");
                    break;
                case 2:
                    System.out.println("Entrega" + entrega + ": Celular");
                    break;
                case 3:
                    System.out.println("Entrega" + entrega + ":Monitor");
                    break;
                default:
                    System.out.println("Entrega invalida");
            }
            if(entregaLiberada){
                System.out.println("Entrega liberada");
            }else if(entregaCancelada){
                System.out.println("Entrega Bloqueada");
            }else{
                System.out.println("Entrega bloqueada : Endereço invalido ou produto não separado");
            }
            System.out.println();
        }
    }
}