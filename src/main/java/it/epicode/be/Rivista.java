package it.epicode.be;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
@DiscriminatorValue("RIVISTA")
public class Rivista extends CatalogoElemento{
    public enum Periodicita {SETTIMANALE, MENSILE, SEMESTRALE}
    private Periodicita periodicita;

    public Rivista() {
    }

    public Rivista(String isbn, String titolo, int annoPubblicazione, int numPagine, Periodicita periodicita) {
        super(isbn, titolo, annoPubblicazione, numPagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), periodicita);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Rivista rivista = (Rivista) obj;
        return periodicita == rivista.periodicita;
    }
}
