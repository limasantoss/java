package  exercicios;
public class Exercicio11ControleDeConsultas {
    public static  void main(String[] args){
        for(int consulta = 1 ; consulta <= 3; consulta++){
            switch (consulta){
                case 1:
                    System.out.println("Consulta " + consulta + " Clinico Geral");
                    break;
                case 2:
                    System.out.println("Consulta " + consulta + " Dentista");
                    break;
                case 3:
                    System.out.println("Consulta " + consulta + " Cardiologista");
                    break;
            }
            boolean consultaLiberada = consulta !=2;
            boolean consultaBloqueada = consulta !=3;
            boolean consultaCancelada = consulta ==3;
            boolean consultaFinal = consultaLiberada && consultaBloqueada && !consultaCancelada;

            if(consultaFinal){
                System.out.println("Consulta liberada");
            } else if (consultaBloqueada){
                System.out.println("Consulta bloqueada");
            } else if (consultaCancelada){
                System.out.println("consulta cancelada");
            }else {
                System.out.println("erro");
            }
           System.out.println();
        }
    }

}