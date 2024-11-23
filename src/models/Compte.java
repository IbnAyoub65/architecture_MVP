package models;

public class Compte {

    protected int numero;
    protected int solde;
    private Client client;

    public Compte(int numero, int solde, Client client) {
        this.numero = numero;
        this.solde = solde;
        this.client = client;
    }

    public Compte(int numero, int solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public Compte() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
