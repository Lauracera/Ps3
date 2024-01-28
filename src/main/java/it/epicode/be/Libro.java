package it.epicode.be;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("LIBRO")
public class Libro extends CatalogoElemento{
    private String autore;
    private String genere;
}
