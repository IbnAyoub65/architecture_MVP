package models;

import java.util.Date;

public class Epargne extends Compte {

    private Date dateBlocage;
    private Date finBlocage;
    private String taux;

    public Epargne(int numero, int solde, Client client, Date dateBlocage, Date finBlocage, String taux) {
        super(numero, solde, client);
        this.dateBlocage = dateBlocage;
        this.finBlocage = finBlocage;
        this.taux = taux;
    }

    public Date getDateBlocage() {
        return dateBlocage;
    }

    public void setDateBlocage(Date dateBlocage) {
        this.dateBlocage = dateBlocage;
    }

    public Date getFinBlocage() {
        return finBlocage;
    }

    public void setFinBlocage(Date finBlocage) {
        this.finBlocage = finBlocage;
    }

    public String getTaux() {
        return taux;
    }

    public void setTaux(String taux) {
        this.taux = taux;
    }
}
