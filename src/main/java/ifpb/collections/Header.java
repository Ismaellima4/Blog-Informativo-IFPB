package ifpb.collections;

import ifpb.collections.interfaces.IAuthors;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IInformation;
import ifpb.entitycomplex.exceptions.InvalidSizeAuthors;
import ifpb.collections.interfaces.IHeader;

public class Header implements IHeader {
    private IInformation information;
    private IAuthors authors;

    public Header(IInformation information, IAuthors authors) throws Throwable {
        this.information = hasNullInformation(information);
        this.authors = hasNullAuthors(authors);
        hasSizeValidForAuthor(authors);
    }

    @Override
    public IInformation getInformation() {
        return this.information;
    }

    @Override
    public IAuthors getAuthors() {
        return this.authors;
    }

    private IInformation hasNullInformation(IInformation information) throws InvalidNullException {
        if (information == null || information.getDescription() == null || information.getTitle() == null){
            throw new InvalidNullException();
        }

        return information;
    }

    private void hasSizeValidForAuthor(IAuthors authors) throws InvalidSizeAuthors {
        if (authors.get().length < 1) throw new InvalidSizeAuthors();
    }

    private IAuthors hasNullAuthors(IAuthors authors) throws Throwable {
        if (authors == null) throw new InvalidNullException();

        return authors;
    }
}
