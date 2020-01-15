package TablesNetflixStatistix;

import javafx.beans.property.SimpleStringProperty;

public class Account {
    private final SimpleStringProperty AccountId;
    private final SimpleStringProperty EMail;
    private final SimpleStringProperty Land;
    private final SimpleStringProperty Provincie;
    private final SimpleStringProperty Plaats;
    private final SimpleStringProperty Straat;
    private final SimpleStringProperty Adres;
    private final SimpleStringProperty Toevoeging;
    private final SimpleStringProperty Postcode;

    public Account(SimpleStringProperty accountId, SimpleStringProperty EMail, SimpleStringProperty land, SimpleStringProperty provincie,
                   SimpleStringProperty plaats, SimpleStringProperty straat, SimpleStringProperty adres, SimpleStringProperty toevoeging, SimpleStringProperty postcode) {
        this.AccountId = accountId;
        this.EMail = EMail;
        this.Land = land;
        this.Provincie = provincie;
        this.Plaats = plaats;
        this.Straat = straat;
        this.Adres = adres;
        this.Toevoeging = toevoeging;
        this.Postcode = postcode;
    }

    public void setAccountId(String accountId) {
        this.AccountId.set(accountId);
    }

    public void setEMail(String EMail) {
        this.EMail.set(EMail);
    }

    public void setLand(String land) {
        this.Land.set(land);
    }

    public void setProvincie(String provincie) {
        this.Provincie.set(provincie);
    }

    public void setPlaats(String plaats) {
        this.Plaats.set(plaats);
    }

    public void setStraat(String straat) {
        this.Straat.set(straat);
    }

    public void setAdres(String adres) {
        this.Adres.set(adres);
    }

    public void setToevoeging(String toevoeging) {
        this.Toevoeging.set(toevoeging);
    }

    public void setPostcode(String postcode) {
        this.Postcode.set(postcode);
    }

    public String getAccountId() {
        return AccountId.get();
    }

    public SimpleStringProperty accountIdProperty() {
        return AccountId;
    }

    public String getEMail() {
        return EMail.get();
    }

    public SimpleStringProperty EMailProperty() {
        return EMail;
    }

    public String getLand() {
        return Land.get();
    }

    public SimpleStringProperty landProperty() {
        return Land;
    }

    public String getProvincie() {
        return Provincie.get();
    }

    public SimpleStringProperty provincieProperty() {
        return Provincie;
    }

    public String getPlaats() {
        return Plaats.get();
    }

    public SimpleStringProperty plaatsProperty() {
        return Plaats;
    }

    public String getStraat() {
        return Straat.get();
    }

    public SimpleStringProperty straatProperty() {
        return Straat;
    }

    public String getAdres() {
        return Adres.get();
    }

    public SimpleStringProperty adresProperty() {
        return Adres;
    }

    public String getToevoeging() {
        return Toevoeging.get();
    }

    public SimpleStringProperty toevoegingProperty() {
        return Toevoeging;
    }

    public String getPostcode() {
        return Postcode.get();
    }

    public SimpleStringProperty postcodeProperty() {
        return Postcode;
    }
}
