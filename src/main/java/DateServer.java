import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class DateServer {
    public static void main(String[] args) {
        System.out.println("Сервер запускается...");

        try {
            LocateRegistry.createRegistry(1900);
            TickerServerImpl im = new TickerServerImpl();
            Naming.rebind("rmi://localhost:1900/Ticker_Service", im);

            System.out.println("Сервер запущен");
        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
    }
}