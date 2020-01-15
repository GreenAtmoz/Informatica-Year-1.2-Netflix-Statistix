package TablesNetflixStatistix;

import javafx.beans.property.SimpleStringProperty;

public class Episode {
    private final SimpleStringProperty Id;
    private final SimpleStringProperty SerieId;
    private final SimpleStringProperty Titel;
    private final SimpleStringProperty Seizoen;
    private final SimpleStringProperty Aflevering;
    private final SimpleStringProperty Tijdsduur;

    public Episode(SimpleStringProperty id, SimpleStringProperty serieId, SimpleStringProperty titel, SimpleStringProperty seizoen,
                   SimpleStringProperty aflevering, SimpleStringProperty tijdsduur) {
        Id = id;
        SerieId = serieId;
        Titel = titel;
        Seizoen = seizoen;
        Aflevering = aflevering;
        Tijdsduur = tijdsduur;
    }

    public void setId(String id) {
        this.Id.set(id);
    }

    public void setSerieId(String serieId) {
        this.SerieId.set(serieId);
    }

    public void setTitel(String titel) {
        this.Titel.set(titel);
    }

    public void setSeizoen(String seizoen) {
        this.Seizoen.set(seizoen);
    }

    public void setAflevering(String aflevering) {
        this.Aflevering.set(aflevering);
    }

    public void setTijdsduur(String tijdsduur) {
        this.Tijdsduur.set(tijdsduur);
    }

    public String getId() {
        return Id.get();
    }

    public SimpleStringProperty idProperty() {
        return Id;
    }

    public String getSerieId() {
        return SerieId.get();
    }

    public SimpleStringProperty serieIdProperty() {
        return SerieId;
    }

    public String getTitel() {
        return Titel.get();
    }

    public SimpleStringProperty titelProperty() {
        return Titel;
    }

    public String getSeizoen() {
        return Seizoen.get();
    }

    public SimpleStringProperty seizoenProperty() {
        return Seizoen;
    }

    public String getAflevering() {
        return Aflevering.get();
    }

    public SimpleStringProperty afleveringProperty() {
        return Aflevering;
    }

    public String getTijdsduur() {
        return Tijdsduur.get();
    }

    public SimpleStringProperty tijdsduurProperty() {
        return Tijdsduur;
    }
}
