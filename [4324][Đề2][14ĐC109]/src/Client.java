import java.rmi.ConnectException;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    private static final String host ="localhost";
    public static void main(String args[]) throws Exception{
        int a,b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap vao so a : ");
        a = nhap.nextInt();
        System.out.println("Nhap vao so b : ");
        b = nhap.nextInt();
        System.out.print("---------------------");
          try
        {
            // biến chuỗi chưa URL đối tượng
            String rmiObjectName="rmi://"+host+"/maxmin";
            Search obj_message = (Search) Naming.lookup(rmiObjectName);
            System.out.println("\nKet noi thanh cong");
            System.out.println("UCLN : "+ obj_message.UCLN(a, b));
            System.out.println("BCNN : "+obj_message.BCNN(a, b));
        }catch(ConnectException con)
        {
            System.out.println("Unable to connect to Server ");
            System.exit(1);
        }catch(Exception e)
        {
            System.exit(1);
        }
    } 
}
