package exercicios;
public class exercicio15ControledeCheckIn{
public static void main(String[] args){
    int checkinsLiberados = 0;
    int checkinsNegados = 0;
    for(int hospede = 1 ; hospede <=4; hospede ++){
        switch (hospede){
            case 1 :
                System.out.println("Hóspede "  + hospede + " Jõao");
                break;
            case 2:
                System.out.println("Hospede " + hospede + "Maria");
                break;
            case 3:
                System.out.println("Hospede" + hospede + "Carlos ");
                break;
            case 4:
                System.out.println("Hospede" + hospede + "Fernanda");
                break;
            default:
                System.out.println("Hospede inválido");
        }
        boolean reservaConfirmada = hospede != 4;
        boolean pagamentoConfirmado = hospede !=2;
        boolean hospedeBloqueado = hospede == 3;
        boolean checkinLiberado = reservaConfirmada && pagamentoConfirmado && !hospedeBloqueado;
        if(checkinLiberado){
            System.out.println("Check-in liberado");
            checkinsLiberados++;
        } else if (hospedeBloqueado) {
            System.out.println("Check-in negado : hóspede bloqueado");
            checkinsNegados++;
        } else if (!pagamentoConfirmado) {
            System.out.println("Check-in negado : pagamento pendente");
            checkinsNegados++;
        }else {
            System.out.println("Check-in negado : reserva não encontrada");
            checkinsNegados++;
        }
        System.out.println();
    }
    System.out.println("Resumo final:");
    System.out.println("Check-ins liberados: " + checkinsLiberados);
    System.out.println("Check-ins negados: " + checkinsNegados);
    }
}