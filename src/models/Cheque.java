package models;

public class Cheque extends Compte {

    private int frais;

    public Cheque(int numero, int solde, Client client, int frais) {
        super(numero, solde, client);
        this.frais = frais;
    }

    public int getFrais() {
        return frais;
    }

    public void setFrais(int frais) {
        this.frais = frais;
    }
}
