import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public interface Search extends Remote{
    int UCLN(int a, int b) throws RemoteException;
    int BCNN(int a, int b) throws RemoteException;
}