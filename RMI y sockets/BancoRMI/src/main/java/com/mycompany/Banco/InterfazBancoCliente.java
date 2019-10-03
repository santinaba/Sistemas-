package com.mycompany.Banco;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface InterfazBancoCliente extends Remote{
   double Cotizar(String FInicio, String FFin, String FCotizacion)throws RemoteException;
}