package views;

import models.Client;
import models.Compte;
import presenter.ClientPresenter;

import java.util.List;
import java.util.Scanner;

public class ClientViewImpl implements ClientView {

    private ClientPresenter presenter;

    public ClientViewImpl(ClientPresenter presenter) {
        this.presenter = presenter;
    }

    public void setPresenter(ClientPresenter presenter) {
        this.presenter = presenter;
    }

    public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ajouter un client");
            System.out.println("2. Lister les clients");
            System.out.println("3. Créer un compte");
            System.out.println("4. Lister les comptes d’un client");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Nom du client : ");
                    String nom = scanner.nextLine();
                    System.out.print("Prénom du client : ");
                    String prenom = scanner.nextLine();
                    presenter.ajouterClient(nom, prenom);
                    break;

                case 2:
                    presenter.listerClients();
                    break;

                case 3:
                    System.out.print("ID du client : ");
                    int clientId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Type de compte (Epargne/Cheque) : ");
                    String typeCompte = scanner.nextLine();
                    System.out.print("Solde initial : ");
                    int solde = scanner.nextInt();
                    presenter.creerCompte(clientId, typeCompte, solde);
                    break;

                case 4:
                    System.out.print("ID du client : ");
                    int idClient = scanner.nextInt();
                    presenter.listerComptesClient(idClient);
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 0);
    }

    @Override
    public void afficherMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void afficherClients(List<Client> clients) {
        System.out.println("\nListe des clients :");
        for (Client client : clients) {
            System.out.println("ID : " + client.getId() + ", Nom : " + client.getNom() + ", Prénom : " + client.getPrenom());
        }
    }

    @Override
    public void afficherComptes(List<Compte> comptes) {
        System.out.println("\nListe des comptes :");
        for (Compte compte : comptes) {
            System.out.println("Numéro : " + compte.getNumero() + ", Solde : " + compte.getSolde());
        }
    }
}
