import action.ClientAction;
import model.Client;

/**
 * Created by 1 on 16.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        ClientAction clientAction = new ClientAction();
        Client client = clientAction.getClientById(1);
        System.out.println(client);

    }
}
