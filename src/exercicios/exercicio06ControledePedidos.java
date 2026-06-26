package exericicios ;

public class exercicio06ControledePedidos {
    public static  void main(String[] args){
        for(int pedido = 1 ; pedido <=3; pedido++){
            switch (pedido){
                case 1 :
                    System.out.println("Pedido " + pedido + "Notebook");
                    break;
                case 2 :
                    System.out.println("Pedido" + pedido + "Mouse");
                    break;
                case 3:
                    System.out.println("Pedido" + pedido + "Teclado");
                    break;
                default:
                    System.out.println("Pedido invalido");
            }

            boolean pagamentoAprovado = pedido !=2;  // true
            boolean produtoDisponivel = pedido !=3; //  true
            boolean clienteBloqueado = pedido == 3; // false

            boolean pedidoLiberado = pagamentoAprovado  && produtoDisponivel &&  !clienteBloqueado;

            if(pedidoLiberado){
                System.out.println("Pedido liberado");
            }else if(clienteBloqueado){
                System.out.println("Cliente  bloqueado: Pagamento recusado");
            }else if(!pagamentoAprovado){
                System.out.println("Pedido Bloquado : pagamento recusado");
            }else{
                System.out.println("Pedido Bloqueado : produto indisponivel");
            }
            System.out.println();
        }
    }

}