package ifpb.entitybasic.classes;

import ifpb.collections.interfaces.ICollection;
import ifpb.entitybasic.exceptions.InvalidNullException;
import ifpb.entitybasic.interfaces.IID;
import ifpb.entitybasic.interfaces.IInformation;
import ifpb.entitycomplex.exceptions.InvalidSizeAuthors;
import ifpb.entitybasic.interfaces.IHeader;

public class Header implements IHeader {
    private IInformation information;
    private ICollection<IID> authors;

    public Header(IInformation information, ICollection<IID> authors) throws Throwable {
        this.information = hasNullInformation(information);
        this.authors = hasNullAuthors(authors);
        hasSizeValidForAuthor(authors);
    }

    @Override
    public IInformation getInformation() {
        return this.information;
    }

    @Override
    public ICollection<IID> getAuthors() {
        return this.authors;
    }

    @Override
    public IHeader update(IHeader header) {
        this.information = header.getInformation();
        this.authors = getAuthors();
        return header;
    }

    private IInformation hasNullInformation(IInformation information) throws InvalidNullException {
        if (information == null || information.getDescription() == null || information.getTitle() == null){
            throw new InvalidNullException();
        }

        return information;
    }

    private void hasSizeValidForAuthor(ICollection<IID> authors) throws InvalidSizeAuthors {
        if (authors.getSize() < 1) throw new InvalidSizeAuthors();
    }

    private ICollection<IID> hasNullAuthors(ICollection<IID> authors) throws Throwable {
        if (authors == null) throw new InvalidNullException();

        return authors;
    }
}
