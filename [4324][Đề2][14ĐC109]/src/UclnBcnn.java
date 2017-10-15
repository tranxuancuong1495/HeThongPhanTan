
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class UclnBcnn extends UnicastRemoteObject implements Search{
    public UclnBcnn() throws RemoteException{
    
    } 
    
    @Override
    public int UCLN(int a, int b){
        while (a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    
    @Override
    public int BCNN(int a, int b){
        return (a*b)/UCLN(a,b);
    }
}
