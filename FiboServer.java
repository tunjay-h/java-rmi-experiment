package java_rmi;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class FiboServer extends UnicastRemoteObject implements FibonacciInterface {
    

    FiboServer() throws RemoteException {
        super();
    }

    public int fibonacci(int n) throws RemoteException {
        if (n <= 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String args[])
    {
        try
        {
            // Create an object of the interface
            // implementation class
            FiboServer obj = new FiboServer();
 
            // rmiregistry within the server JVM with
            // port number 1900
            LocateRegistry.createRegistry(1900);
 
            // Binds the remote object by the name
            // geeksforgeeks
            Naming.rebind("rmi://172.24.250.233:1900/test", obj);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}