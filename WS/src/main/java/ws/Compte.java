package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)

public class Compte {
    private int code;
    private double solde;

    @XmlTransient

    private Date dateCreation;

    public Compte(int code, double solde, Date DateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Compte() {
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date DateCreation) {

        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {

        this.code = code;
    }

    public double getSolde() {

        return solde;
    }

    public void setSolde(double Solde) {

        this.solde = solde;
    }
}
