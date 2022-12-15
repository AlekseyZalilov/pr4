import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TickerServer extends Remote {
    public void connect(String d) throws RemoteException;
}