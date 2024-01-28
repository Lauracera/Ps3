package it.epicode.be;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RIVISTA")
public class Rivista extends CatalogoElemento{
    public enum Periodicita {SETTIMANALE, MENSILE, SEMESTRALE}
}
