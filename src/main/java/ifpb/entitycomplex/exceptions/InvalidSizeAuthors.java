package ifpb.entitycomplex.exceptions;

/** Lança a excessão quando o número de autores não atende ao número mínimo*/
public class InvalidSizeAuthors extends Exception {
    public InvalidSizeAuthors() {
        super("Invalid size for authors, minimum one author");
    }
}
