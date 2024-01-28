package it.epicode.be;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Elemento {
    @Id
    private String isbn;
    private String titolo;
    private int annoPubblicazione;
    private int numPagine;

    public Elemento() {
    }

}
