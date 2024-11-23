package presenter;

public interface ClientPresenter {
    void ajouterClient(String nom, String prenom);
    void listerClients();
    void creerCompte(int clientId, String typeCompte, int solde);
    void listerComptesClient(int clientId);
}
