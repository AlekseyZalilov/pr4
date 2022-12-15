import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class TickerServerImpl extends UnicastRemoteObject implements TickerServer, Runnable {
    private static final long serialVersionUID = 1;
    List<String> list = new ArrayList<String>();

    public TickerServerImpl() throws RemoteException {
        super();
    }

    public void connect(String da) throws RemoteException {
        System.out.println("Добавление клиента: " + da);
        list.add(da);
    }

    public void run() {
        Iterator it = list.iterator();
        String mesg = ("Добро пожаловать!");
    }
}