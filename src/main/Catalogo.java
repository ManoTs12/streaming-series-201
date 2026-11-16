package main;

import java.util.ArrayList;

public class Catalogo {
    ArrayList<Series> series;

    public void adicionaSeries(Series series) {
        this.series.add(series);
    }

    public Series buscaSeries(String nomeBusca) {
        for (Series series : this.series) {
            if (series.getNome().equalsIgnoreCase(nomeBusca)) {
                return series;
            }
        }
        return null;

    }
}
