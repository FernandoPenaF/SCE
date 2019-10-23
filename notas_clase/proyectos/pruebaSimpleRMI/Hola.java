package example.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hola extends Remote {
    String sayHello() throws RemoteException;
	long   sumaRemota( long a, long b) throws RemoteException;
}