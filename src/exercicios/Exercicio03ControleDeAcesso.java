package exercicios;
public class Exercicio03ControleDeAcesso {
    public static void main (String[] args){
        boolean senhaCorreta = true;
        boolean usuarioAtivo = true;
        boolean usuarioBloqueado = false;

        boolean  acessorPermitido = senhaCorreta && usuarioAtivo && usuarioBloqueado;
        for(int nivel = 1 ; nivel <=3 ; nivel++){
            switch (nivel) {
                case 1:
                    System.out.println("Nivel" + nivel + "Visitante");
                    break;
                //1 + 1 = 2
                case 2:
                    System.out.println("Nivel" + nivel + "Editor");
                    break;
                //2 + 1 = 3
                case 3:
                    System.out.println("Nivel" + nivel + "Administrador");
                    break;
                // nivel = 3 entao para aqui == 3
                default:
                    System.out.println("Nivel inválido");
            }

                    if(acessorPermitido){
                        System.out.println("Acesso Permitido");

                    }else if(usuarioBloqueado){
                        System.out.println("Usuario bloqueado");
                    }else{
                        System.out.println("Acesso negado : Senha errada ou usuario invalido");
                    }
                    System.out.println();
            }
        }
    }

