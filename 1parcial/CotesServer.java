package sisbanco;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;


public class ServidorCotes
    extends UnicastRemoteObject
    implements ICotes
	 
{
    ServidorCotes() throws java.rmi.RemoteException{
	super();
    }
    
    public Factura[] pedientes(int idcliente) throws RemoteException {
        if (idcliente==1)
        {
            Factura[] aux=new Factura[2];
            aux[0]=new Factura("Cotes",154,50.00);
            aux[1]=new Factura("Cotes",326,70.00);
            
            return aux;
        }
        else if (idcliente==2)
        {
            Factura[] aux=new Factura[2];
            aux[0]=new Factura("Cotes",325,60.00);
            aux[1]=new Factura("Cotes",457,80.00);
            
            return aux;
        }
        else
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public String pagar(Factura[] facturas) throws RemoteException {
            return "SI";
    }    
    
    
    
    public static void main(String args[]) { 
	try {
	    ServidorCotes Cotes;
	    LocateRegistry.createRegistry(1099);
	    Cotes=new ServidorCotes(); 
	    Naming.bind("Cotes", Cotes); 
            System.out.println("El servidor esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    } 
   
}


