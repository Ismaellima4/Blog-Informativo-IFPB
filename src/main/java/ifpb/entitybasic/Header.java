package ifpb.entitybasic;

import ifpb.collections.interfaces.IAuthors;
import ifpb.collections.interfaces.ICollectionId;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IInformation;
import ifpb.entitycomplex.exceptions.InvalidSizeAuthors;
import ifpb.entitybasic.interfaces.IHeader;

public class Header implements IHeader {
    private IInformation information;
    private ICollectionId authors;

    public Header(IInformation information, ICollectionId authors) throws Throwable {
        this.information = hasNullInformation(information);
        this.authors = hasNullAuthors(authors);
        hasSizeValidForAuthor(authors);
    }

    @Override
    public IInformation getInformation() {
        return this.information;
    }

    @Override
    public ICollectionId getAuthors() {
        return this.authors;
    }

    private IInformation hasNullInformation(IInformation information) throws InvalidNullException {
        if (information == null || information.getDescription() == null || information.getTitle() == null){
            throw new InvalidNullException();
        }

        return information;
    }

    private void hasSizeValidForAuthor(ICollectionId authors) throws InvalidSizeAuthors {
        if (authors.getSize() < 1) throw new InvalidSizeAuthors();
    }

    private ICollectionId hasNullAuthors(ICollectionId authors) throws Throwable {
        if (authors == null) throw new InvalidNullException();

        return authors;
    }
}
