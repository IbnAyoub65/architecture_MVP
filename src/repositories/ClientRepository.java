package repositories;

import models.Client;

import java.util.List;

public interface ClientRepository {
    void ajouterClient(Client client);
    List<Client> listerClients();
    Client trouverClientParId(int id);
}
