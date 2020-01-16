package TablesNetflixStatistix;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Account {
    private final StringProperty AccountId;
    private final StringProperty EMail;
    private final StringProperty Land;
    private final StringProperty Provincie;
    private final StringProperty Plaats;
    private final StringProperty Straat;
    private final StringProperty Huisnummer;
    private final StringProperty Toevoeging;
    private final StringProperty Postcode;

    public Account(String accountId, String EMail, String land, String provincie, String plaats, String straat, String huisnummer, String toevoeging, String postcode) {
        AccountId = new SimpleStringProperty(accountId);
        this.EMail = new SimpleStringProperty(EMail);
        Land = new SimpleStringProperty(land);
        Provincie = new SimpleStringProperty(provincie);
        Plaats = new SimpleStringProperty(plaats);
        Straat = new SimpleStringProperty(straat);
        Huisnummer = new SimpleStringProperty(huisnummer);
        Toevoeging = new SimpleStringProperty(toevoeging);
        Postcode = new SimpleStringProperty(postcode);
    }

    public String getAccountId() {
        return AccountId.get();
    }

    public StringProperty accountIdProperty() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        this.AccountId.set(accountId);
    }

    public String getEMail() {
        return EMail.get();
    }

    public StringProperty EMailProperty() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail.set(EMail);
    }

    public String getLand() {
        return Land.get();
    }

    public StringProperty landProperty() {
        return Land;
    }

    public void setLand(String land) {
        this.Land.set(land);
    }

    public String getProvincie() {
        return Provincie.get();
    }

    public StringProperty provincieProperty() {
        return Provincie;
    }

    public void setProvincie(String provincie) {
        this.Provincie.set(provincie);
    }

    public String getPlaats() {
        return Plaats.get();
    }

    public StringProperty plaatsProperty() {
        return Plaats;
    }

    public void setPlaats(String plaats) {
        this.Plaats.set(plaats);
    }

    public String getStraat() {
        return Straat.get();
    }

    public StringProperty straatProperty() {
        return Straat;
    }

    public void setStraat(String straat) {
        this.Straat.set(straat);
    }

    public String getHuisnummer() {
        return Huisnummer.get();
    }

    public StringProperty huisnummerProperty() {
        return Huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.Huisnummer.set(huisnummer);
    }

    public String getToevoeging() {
        return Toevoeging.get();
    }

    public StringProperty toevoegingProperty() {
        return Toevoeging;
    }

    public void setToevoeging(String toevoeging) {
        this.Toevoeging.set(toevoeging);
    }

    public String getPostcode() {
        return Postcode.get();
    }

    public StringProperty postcodeProperty() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        this.Postcode.set(postcode);
    }
}


