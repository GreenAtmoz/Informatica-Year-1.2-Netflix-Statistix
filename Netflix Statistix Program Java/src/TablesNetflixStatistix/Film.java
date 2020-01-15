package TablesNetflixStatistix;

import javafx.beans.property.SimpleStringProperty;

public class Film {
    private final SimpleStringProperty Id;
    private final SimpleStringProperty SerieId;
    private final SimpleStringProperty Titel;
    private final SimpleStringProperty Tijdsduur;

    public Film(SimpleStringProperty id, SimpleStringProperty serieId, SimpleStringProperty titel, SimpleStringProperty tijdsduur) {
        Id = id;
        SerieId = serieId;
        Titel = titel;
        Tijdsduur = tijdsduur;
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

    public String getSerieId() {
        return SerieId.get();
    }

    public SimpleStringProperty serieIdProperty() {
        return SerieId;
    }

    public void setSerieId(String serieId) {
        this.SerieId.set(serieId);
    }

    public String getTitel() {
        return Titel.get();
    }

    public SimpleStringProperty titelProperty() {
        return Titel;
    }

    public void setTitel(String titel) {
        this.Titel.set(titel);
    }

    public String getTijdsduur() {
        return Tijdsduur.get();
    }

    public SimpleStringProperty tijdsduurProperty() {
        return Tijdsduur;
    }

    public void setTijdsduur(String tijdsduur) {
        this.Tijdsduur.set(tijdsduur);
    }
}
