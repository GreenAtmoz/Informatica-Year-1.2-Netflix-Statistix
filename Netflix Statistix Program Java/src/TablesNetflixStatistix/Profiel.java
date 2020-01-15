package TablesNetflixStatistix;

import javafx.beans.property.SimpleStringProperty;

public class Profiel {
    private final SimpleStringProperty ProfielId;
    private final SimpleStringProperty AccountId;
    private final SimpleStringProperty Geboortedatum;
    private final SimpleStringProperty Profielnaam;

    public Profiel(SimpleStringProperty profielId, SimpleStringProperty accountId, SimpleStringProperty geboortedatum, SimpleStringProperty profielnaam) {
        ProfielId = profielId;
        AccountId = accountId;
        Geboortedatum = geboortedatum;
        Profielnaam = profielnaam;
    }

    public String getProfielId() {
        return ProfielId.get();
    }

    public SimpleStringProperty profielIdProperty() {
        return ProfielId;
    }

    public void setProfielId(String profielId) {
        this.ProfielId.set(profielId);
    }

    public String getAccountId() {
        return AccountId.get();
    }

    public SimpleStringProperty accountIdProperty() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        this.AccountId.set(accountId);
    }

    public String getGeboortedatum() {
        return Geboortedatum.get();
    }

    public SimpleStringProperty geboortedatumProperty() {
        return Geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.Geboortedatum.set(geboortedatum);
    }

    public String getProfielnaam() {
        return Profielnaam.get();
    }

    public SimpleStringProperty profielnaamProperty() {
        return Profielnaam;
    }

    public void setProfielnaam(String profielnaam) {
        this.Profielnaam.set(profielnaam);
    }
}
