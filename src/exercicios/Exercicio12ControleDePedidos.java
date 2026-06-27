package exercicios;
public class Exercicio12ControleDePedidos {
    public static  void main(String[] args){
        int pedidosLiberados = 0;
        int pedidosBloqueados = 0;
        int clienteBloqueados = 0;

        for(int pedido  = 1 ; pedido <= 3; pedido ++){
            switch (pedido){
                case 1 :
                    System.out.println("Pedido " +  pedido + " Notebook");
                    break;
                case 2:
                    System.out.println("Pedido " + pedido + " Mouse");
                    break;
                case 3:
                    System.out.println("Pedido " + pedido + " Teclado");
                    break;
                default:
                    System.out.println("Pedido invalido");
            }
            boolean pagamentoAprovado = pedido != 3;
            boolean produtoDisponivel = pedido !=2 ;
            boolean clienteBloqueado = pedido ==3 ;
            boolean pedidoLiberado = pagamentoAprovado && produtoDisponivel && !clienteBloqueado;

            if(pedidoLiberado){
                System.out.println("Pedido Liberado");
                pedidosLiberados ++ ;
            }else if(clienteBloqueado){
                System.out.println("Pedido bloqueado : cliente bloqueado");
                pedidosBloqueados ++;
                clienteBloqueados ++;
            } else if (!pagamentoAprovado){
                System.out.println("Pedido bloqueado : Pagamento recusado");
                pedidosBloqueados++;
            }else{
                System.out.println("pedido bloqueado : Produto indisponivel");
            }
            System.out.println();
        }
        System.out.println("Resumo final");
        System.out.println("Pedidos liberados " + pedidosLiberados);
        System.out.println("Pedidos Bloqueados " + pedidosBloqueados);
        System.out.println("Cliente Bloqueados " + clienteBloqueados);
    }
}