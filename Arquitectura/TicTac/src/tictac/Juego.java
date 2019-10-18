package tictac;
public class Juego {
    public int[][] tablero = new int[3][3];
    public static Juego instancia;
    
    private Juego(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                this.tablero[i][j] = 0;
            }
        }
    }

    public static Juego getInstancia(){
        if(instancia == null)
            instancia = new Juego();
        return instancia;
    }
    
    public void mostrar(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public void marca(int x, int y, int jugador){
        if(jugador == 1){
           if(tablero[x][y] == 0)
               tablero[x][y] = 1;
        } else if (jugador == 2){
            if(tablero[x][y] == 0)
                tablero[x][y] = 2;
        }
    }
    
    public String ganador(int jugador){
        String ganador = "";
        String cadena1 = "111";
        String cadena2 = "222";
        
        if(jugador == 1){
            if(cadena1.equals(String.valueOf(tablero[0][0]) + String.valueOf(tablero[0][1])
                + String.valueOf(tablero[0][2])))
                ganador = "1";
            if (cadena1.equals(String.valueOf(tablero[1][0]) + String.valueOf(tablero[1][1])
                    + String.valueOf(tablero[1][2]))) {
                ganador = "1";
            }
            if (cadena1.equals(String.valueOf(tablero[2][0]) + String.valueOf(tablero[2][1])
                    + String.valueOf(tablero[2][2]))) {
                ganador = "1";
            }
            
            if (cadena1.equals(String.valueOf(tablero[0][0]) + String.valueOf(tablero[1][0])
                    + String.valueOf(tablero[2][0]))) {
                ganador = "1";
            }
            if (cadena1.equals(String.valueOf(tablero[0][1]) + String.valueOf(tablero[1][1])
                    + String.valueOf(tablero[2][1]))) {
                ganador = "1";
            }
            if (cadena1.equals(String.valueOf(tablero[0][2]) + String.valueOf(tablero[1][2])
                    + String.valueOf(tablero[2][2]))) {
                ganador = "1";
            }
            
            if (cadena1.equals(String.valueOf(tablero[0][0]) + String.valueOf(tablero[1][1])
                    + String.valueOf(tablero[2][2]))) {
                ganador = "1";
            }
            
            if (cadena1.equals(String.valueOf(tablero[0][2]) + String.valueOf(tablero[1][1])
                    + String.valueOf(tablero[2][0]))) {
                ganador = "1";
            }
            
        } else if(jugador == 2){
            if (cadena2.equals(String.valueOf(tablero[0][0]) + String.valueOf(tablero[0][1])
                    + String.valueOf(tablero[0][2]))) {
                ganador = "2";
            }
            if (cadena2.equals(String.valueOf(tablero[1][0]) + String.valueOf(tablero[1][1])
                    + String.valueOf(tablero[1][2]))) {
                ganador = "2";
            }
            if (cadena2.equals(String.valueOf(tablero[2][0]) + String.valueOf(tablero[2][1])
                    + String.valueOf(tablero[2][2]))) {
                ganador = "2";
            }

            if (cadena2.equals(String.valueOf(tablero[0][0]) + String.valueOf(tablero[1][0])
                    + String.valueOf(tablero[2][0]))) {
                ganador = "2";
            }
            if (cadena2.equals(String.valueOf(tablero[0][1]) + String.valueOf(tablero[1][1])
                    + String.valueOf(tablero[2][1]))) {
                ganador = "2";
            }
            if (cadena2.equals(String.valueOf(tablero[0][2]) + String.valueOf(tablero[1][2])
                    + String.valueOf(tablero[2][2]))) {
                ganador = "2";
            }

            if (cadena2.equals(String.valueOf(tablero[0][0]) + String.valueOf(tablero[1][1])
                    + String.valueOf(tablero[2][2]))) {
                ganador = "2";
            }

            if (cadena2.equals(String.valueOf(tablero[0][2]) + String.valueOf(tablero[1][1])
                    + String.valueOf(tablero[2][0]))) {
                ganador = "2";
            }
        }   
        return ganador;
    }   
}