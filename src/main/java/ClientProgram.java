import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class ClientProgram extends UnicastRemoteObject implements Client
{
    public ClientProgram() throws RemoteException {}

    public static void main(String[] argv) throws IOException, NotBoundException {
        new ClientProgram().do_the_work();
    }

    private void do_the_work() throws IOException, NotBoundException {
        System.out.println("Клиент запускается");
        TickerServer server = (TickerServer)Naming.lookup("rmi://localhost:1900/Ticker_Service");
        System.out.println("Подключение");

        System.out.println("Введите ваше имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        server.connect(name);
        Client.alert("Добро пожаловать, " + name + "!");
    }

    public void alert(String message) throws RemoteException {
        System.out.println(message);
    }
}