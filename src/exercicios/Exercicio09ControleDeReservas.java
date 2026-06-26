package exercicios;
public class Exercicio09ControleDeReservas {
    public static void main(String[] args){
        for(int reserva = 1 ; reserva <= 3 ; reserva++){
            switch (reserva){
                case 1:
                    System.out.println("Reserva"+ reserva + "Sala de reunião ");
                    break;
                case 2 :
                    System.out.println("Reserva "+ reserva+ "Auditório ");
                    break;
                case 3:
                    System.out.println("Reserva" + reserva+ "Laboratório");
                    break;
                default:
                    System.out.println("Reserva inválida");
            }
            boolean horarioDisponivel = reserva !=2;
            boolean solicitanteAutorizado = reserva !=3;
            boolean reservaCancelada = reserva ==3;
            boolean reservaLiberada = horarioDisponivel && solicitanteAutorizado && reservaCancelada;

            if(reservaLiberada){
                System.out.println("Reserva Liberada");
            }else if(reservaCancelada){
                System.out.println("Reserva bloqueada : reserva cancelada" );
            } else if (!horarioDisponivel) {
                System.out.println("Reserva bloqueada : Horario indisponivel");
            }else{
                System.out.println("Reserva bloqueada : Solicitante não autorizado ");
            }
            System.out.println();
        }
    }

}