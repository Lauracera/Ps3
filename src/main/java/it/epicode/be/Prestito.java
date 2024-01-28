package it.epicode.be;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Utente utente;

    @ManyToOne
    private Elemento elemento;

    private Date dataInizioPrestito;
    private Date dataRestituzionePrevista;
    private Date dataRestituzioneEffettiva;

    public Prestito() {
    }

    public Prestito(Utente utente, Elemento elemento, Date dataInizioPrestito) {
        this.utente = utente;
        this.elemento = elemento;
        this.dataInizioPrestito = dataInizioPrestito;
        // Imposta la data restituzione prevista a 30 giorni dalla data inizio prestito
        this.dataRestituzionePrevista = new Date(dataInizioPrestito.getTime() + (30 * 24 * 60 * 60 * 1000));
    }

    @Override
    public int hashCode() {
        return Objects.hash(utente, elemento, dataInizioPrestito, dataRestituzionePrevista, dataRestituzioneEffettiva);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Prestito prestito = (Prestito) obj;
        return Objects.equals(utente, prestito.utente) &&
                Objects.equals(elemento, prestito.elemento) &&
                Objects.equals(dataInizioPrestito, prestito.dataInizioPrestito) &&
                Objects.equals(dataRestituzionePrevista, prestito.dataRestituzionePrevista) &&
                Objects.equals(dataRestituzioneEffettiva, prestito.dataRestituzioneEffettiva);
    }
}
