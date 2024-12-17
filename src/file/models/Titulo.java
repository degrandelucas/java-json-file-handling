package file.models;

public class Titulo {
    private String movie;
    private String genero;
    private int anoLancamento;

    public Titulo(String movie, String genero, int anoLancamento) {
        this.movie = movie;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "movie='" + movie + '\'' +
                ", genero='" + genero + '\'' +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
