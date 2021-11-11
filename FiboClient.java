package java_rmi;

import java.rmi.*;

public class FiboClient {

    public static void main(String[] args) {

        try {
            FibonacciInterface fibo = 
                (FibonacciInterface) Naming.lookup("rmi://172.24.250.233:1900/test");
            
            int num = Integer.parseInt(args[0]);
            System.out.println("Serverden cavab: " + fibo.fibonacci(num));
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}