import java.rmi.Naming;
import java.rmi.Remote;

public class Sever {
    private static final String host = "localhost";
    public static void main(String[] args) throws Exception
    {

        UclnBcnn objImplement = new UclnBcnn();

        String rmiObjectName="rmi://"+host+"/maxmin";

        Naming.rebind(rmiObjectName, (Remote) objImplement);
        // Thông báo quá trình này đã hoàn tất
        System.out.println("Binding complete...\n");
    }
}
