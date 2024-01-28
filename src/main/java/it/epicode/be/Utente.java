package it.epicode.be;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cognome;
    private Date dataNascita;
    private String numeroTessera;

    public Utente() {
    }

    public Utente(String nome, String cognome, Date dataNascita, String numeroTessera) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.numeroTessera = numeroTessera;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, dataNascita, numeroTessera);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Utente utente = (Utente) obj;
        return Objects.equals(nome, utente.nome) &&
                Objects.equals(cognome, utente.cognome) &&
                Objects.equals(dataNascita, utente.dataNascita) &&
                Objects.equals(numeroTessera, utente.numeroTessera);
    }
}
