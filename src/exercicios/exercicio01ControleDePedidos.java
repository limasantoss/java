package exercicios;
public class exercicio01ControleDePedidos{
    public static void main(String[] args){
        boolean pagamentoAprovado = true ;
        boolean produtoDisponivel = true ;
        boolean clienteBloqueado = false ;
        boolean pedidoLiberado = pagamentoAprovado && produtoDisponivel && !clienteBloqueado;

        for(int  pedido = 1 ; pedido <= 3 ; pedido++){
            switch (pedido){
                case 1 :
                    System.out.println(" pedido " + pedido + " Notebook ");
                    if(pedidoLiberado){
                        System.out.println(" Pedido liberado ");
                    } else if (clienteBloqueado) {
                        System.out.println(" Cliente bloqueado ");
                    }else{
                        System.out.println(" Pedido bloqueado : Verifique o Pagamento ");
                    }
                    break;
                case 2 :
                    System.out.println(" pedido " + pedido + " Mouse ");
                    if(pedidoLiberado){
                        System.out.println(" Pedido Liberado ");
                    }else if(clienteBloqueado){
                        System.out.println(" Cliente bloqueado ");
                    }else{
                        System.out.println(" Pedido bloqueado : Verifique o Pagamento");
                    }
                    break;
                case 3 :
                    System.out.println(" pedido " + pedido + " Teclado ");
                    if(pedidoLiberado){
                        System.out.println(" Pedido liberado ");
                    }else if(clienteBloqueado){
                        System.out.println("Cliente bloqueado ");
                    }else{
                        System.out.println("Pedido bloqueado : verifique o Pagamento ");
                    }
                    break;
                default:
                    System.out.println("Erro no sistema");

            }
        }
    }
}