package tictac;
import java.util.Scanner;
public class TicTac {
    public static void main(String[] args){
        Juego tic = Juego.getInstancia();
        Scanner in = new Scanner(System.in);
        System.out.println("\tJuego Iniciado");
        System.out.println("\t**************");
        int turno = 1, x, y;
        String ganador = "";
        while(true){
            if(turno == 1){
                System.out.println("\nJugador1: ");
                System.out.print("Posicion en x: ");
                x = in.nextInt();
                System.out.print("Posicion en y: ");
                y = in.nextInt();
                tic.marca(x, y, turno);
                ganador = tic.ganador(turno);    
                turno = 2;
            } 
            else if(turno == 2){
                System.out.println("\nJugador2: ");
                System.out.print("Posicion en x: ");
                x = in.nextInt();
                System.out.print("Posicion en y: ");
                y = in.nextInt();
                
                tic.marca(x, y, turno);
                
                ganador = tic.ganador(turno);
                turno = 1;
            }   
            tic.mostrar();
            
            if (ganador.equals("1") || ganador.equals("2"))
                break;
        }       
        System.out.println("\n\tFelicidades jugador" + ganador + " !!!");
    }
}