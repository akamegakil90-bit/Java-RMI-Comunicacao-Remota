import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloCliente {
    public static void main(String[] args) {
        try {
            String host = args[0];
            Registry registry = LocateRegistry.getRegistry(host);

            Hello stub = (Hello) registry.lookup("Hello");

            String resposta = stub.sayHello();
            System.out.println("Resposta do servidor: " + resposta);

        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.getMessage());
        }
    }
}
