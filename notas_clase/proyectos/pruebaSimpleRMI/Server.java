package example.hello;
        
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
        
public class Server implements Hola {
    long cuantos = 0;    
    String strHostname = System.getenv("COMPUTERNAME");
    public Server() {}

    public synchronized String sayHello() 
    { 
        cuantos++;
        System.out.println("Proporcionando el servicio no. " + cuantos);
        return "Servicio no. " + cuantos + " proporcionado desde " + strHostname;
    }

    public synchronized long sumaRemota( long a, long b)
	{
       long c = a + b;
	   return c;
	}		
    
    public static void main(String args[]) {
        
        try {
            Server obj = new Server();
            Hola stub = (Hola) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("Hola", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}