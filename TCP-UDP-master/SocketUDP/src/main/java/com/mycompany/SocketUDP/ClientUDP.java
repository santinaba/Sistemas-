package com.mycompany.SocketUDP;
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class ClientUDP {
  public static void main(String args[]) {
    try {
        Scanner br=new Scanner(System.in);
        String dato="";
        for (int i = 0; i < 5; i++) {
                System.out.println("Introducir posicion "+i);
                dato += br.nextLine();
            }
        String ip="localhost";
      DatagramSocket socketUDP = new DatagramSocket();
      byte[] mensaje = dato.getBytes();
      InetAddress hostServidor = InetAddress.getByName(ip);
      int puertoServidor = 6789;
      // Construimos un datagrama para enviar el mensaje al servidor
      DatagramPacket peticion =
        new DatagramPacket(mensaje, dato.length(), hostServidor,
                           puertoServidor);
      // Enviamos el datagrama
      socketUDP.send(peticion);
      // Construimos el DatagramPacket que contendrá la respuesta
      byte[] bufer = new byte[1000];
      DatagramPacket respuesta =
        new DatagramPacket(bufer, bufer.length);
      socketUDP.receive(respuesta);
      // Enviamos la respuesta del servidor a la salida estandar
      System.out.println("Respuesta: " + new String(respuesta.getData()));
      // Cerramos el socket
      socketUDP.close();
    } catch (SocketException e) {
      System.out.println("Socket: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO: " + e.getMessage());
    }
  }
}