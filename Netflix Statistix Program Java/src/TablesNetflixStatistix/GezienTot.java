package TablesNetflixStatistix;

import javafx.beans.property.SimpleStringProperty;

public class GezienTot {
    private final SimpleStringProperty ProfielId;
    private final SimpleStringProperty Id;
    private final SimpleStringProperty GeblevenBij;

    public GezienTot(SimpleStringProperty profielId, SimpleStringProperty id, SimpleStringProperty geblevenBij) {
        ProfielId = profielId;
        Id = id;
        GeblevenBij = geblevenBij;
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

    public String getId() {
        return Id.get();
    }

    public SimpleStringProperty idProperty() {
        return Id;
    }

    public void setId(String id) {
        this.Id.set(id);
    }

    public String getGeblevenBij() {
        return GeblevenBij.get();
    }

    public SimpleStringProperty geblevenBijProperty() {
        return GeblevenBij;
    }

    public void setGeblevenBij(String geblevenBij) {
        this.GeblevenBij.set(geblevenBij);
    }
}
