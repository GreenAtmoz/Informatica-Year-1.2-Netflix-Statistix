package TablesNetflixStatistix;

import javafx.beans.property.SimpleStringProperty;

public class Programma {
    private final SimpleStringProperty SerieId;
    private final SimpleStringProperty Serie;
    private final SimpleStringProperty Leeftijd;
    private final SimpleStringProperty Taal;
    private final SimpleStringProperty Genre;
    private final SimpleStringProperty LijktOp;

    public Programma(SimpleStringProperty serieId, SimpleStringProperty serie, SimpleStringProperty leeftijd,
                     SimpleStringProperty taal, SimpleStringProperty genre, SimpleStringProperty lijktOp) {
        SerieId = serieId;
        Serie = serie;
        Leeftijd = leeftijd;
        Taal = taal;
        Genre = genre;
        LijktOp = lijktOp;
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

    public String getSerie() {
        return Serie.get();
    }

    public SimpleStringProperty serieProperty() {
        return Serie;
    }

    public void setSerie(String serie) {
        this.Serie.set(serie);
    }

    public String getLeeftijd() {
        return Leeftijd.get();
    }

    public SimpleStringProperty leeftijdProperty() {
        return Leeftijd;
    }

    public void setLeeftijd(String leeftijd) {
        this.Leeftijd.set(leeftijd);
    }

    public String getTaal() {
        return Taal.get();
    }

    public SimpleStringProperty taalProperty() {
        return Taal;
    }

    public void setTaal(String taal) {
        this.Taal.set(taal);
    }

    public String getGenre() {
        return Genre.get();
    }

    public SimpleStringProperty genreProperty() {
        return Genre;
    }

    public void setGenre(String genre) {
        this.Genre.set(genre);
    }

    public String getLijktOp() {
        return LijktOp.get();
    }

    public SimpleStringProperty lijktOpProperty() {
        return LijktOp;
    }

    public void setLijktOp(String lijktOp) {
        this.LijktOp.set(lijktOp);
    }
}
