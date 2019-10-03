package com.mycompany.Banco;
import java.rmi.*;
public interface InterfazBanco extends Remote {
    double cotizarDolar(String arg) throws RemoteException;
}