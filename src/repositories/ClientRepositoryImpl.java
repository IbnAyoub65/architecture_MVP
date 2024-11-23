package repositories;

import models.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {

    private List<Client> clients = new ArrayList<>();

    @Override
    public void ajouterClient(Client client) {
        client.setId(clients.size() + 1);
        clients.add(client);
    }

    @Override
    public List<Client> listerClients() {
        return clients;
    }

    @Override
    public Client trouverClientParId(int id) {
        return clients.stream().filter(client -> client.getId() == id).findFirst()
                .orElse(null);
    }
}
