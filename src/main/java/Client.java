import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote {
    public static void alert(String mesg) throws RemoteException {
        System.out.println(mesg);
    }
}