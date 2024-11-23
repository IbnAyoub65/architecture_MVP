package views;

import models.Client;
import models.Compte;

import java.util.List;

public interface ClientView {
    void afficherMessage(String message);
    void afficherClients(List<Client> clients);
    void afficherComptes(List<Compte> comptes);
}
