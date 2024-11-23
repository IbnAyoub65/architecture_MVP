package presenter;

import models.Client;
import models.Compte;
import models.Cheque;
import models.Epargne;
import repositories.ClientRepository;
import views.ClientView;

import java.util.Date;
import java.util.List;

public class ClientPresenterImpl implements ClientPresenter {

    private final ClientView view;
    private final ClientRepository repository;

    public ClientPresenterImpl(ClientView view, ClientRepository repository) {
        this.view = view;
        this.repository = repository;
    }

    @Override
    public void ajouterClient(String nom, String prenom) {
        Client client = new Client(nom, prenom);
        repository.ajouterClient(client);
        view.afficherMessage("Client ajouté : " + nom + " " + prenom);
    }

    @Override
    public void listerClients() {
        List<Client> clients = repository.listerClients();
        if (clients.isEmpty()) {
            view.afficherMessage("Aucun client enregistré.");
        } else {
            view.afficherClients(clients);
        }
    }

    @Override
    public void creerCompte(int clientId, String typeCompte, int solde) {
        Client client = repository.trouverClientParId(clientId);
        if (client == null) {
            view.afficherMessage("Client introuvable !");
            return;
        }

        Compte compte;
        if ("Epargne".equalsIgnoreCase(typeCompte)) {
            compte = new Epargne(solde, solde, client, new Date(), null, "0.5%");
        } else if ("Cheque".equalsIgnoreCase(typeCompte)) {
            compte = new Cheque(solde, solde, client, 50);
        } else {
            view.afficherMessage("Type de compte invalide !");
            return;
        }

        client.ajouterCompte(compte);
        view.afficherMessage("Compte " + typeCompte + " créé pour le client " + client.getNom() + ".");
    }

    @Override
    public void listerComptesClient(int clientId) {
        Client client = repository.trouverClientParId(clientId);
        if (client == null) {
            view.afficherMessage("Client introuvable !");
            return;
        }

        List<Compte> comptes = client.getComptes();
        if (comptes.isEmpty()) {
            view.afficherMessage("Aucun compte enregistré pour ce client.");
        } else {
            view.afficherComptes(comptes);
        }
    }
}
