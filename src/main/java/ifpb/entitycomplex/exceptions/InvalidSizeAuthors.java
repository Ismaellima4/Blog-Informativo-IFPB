package ifpb.entitycomplex.exceptions;

public class InvalidSizeAuthors extends Exception {
    public InvalidSizeAuthors() {
        super("Invalid size for authors, minimum one author");
    }
}
