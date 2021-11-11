package java_rmi;

import java.rmi.*;

public interface FibonacciInterface extends Remote {

    public int fibonacci(int n) throws RemoteException;
}