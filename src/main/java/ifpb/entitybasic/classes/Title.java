package ifpb.entitybasic.classes;

import ifpb.entitybasic.exceptions.InvalidTitleInformationException;
import ifpb.entitybasic.exceptions.InvalidWhiteSpaceException;
import ifpb.entitybasic.interfaces.ITitle;

public class Title implements ITitle {
    private String title;

    public Title(String title) throws Exception {
        this.title = validateTitle(title);
    }

    private String validateTitle(String title) throws Exception {
        validateWhiteSpaces(title);
        if (!title.matches("^.{5,60}")){
            throw new InvalidTitleInformationException();
        }
        return title;
    }

    private void validateWhiteSpaces(String content) throws Exception {
        if (content.isEmpty()){
            throw new InvalidWhiteSpaceException();
        }
    }

    @Override
    public void changeTitle(String title) throws Exception {
        this.title = validateTitle(title.trim());
    }

    @Override
    public String getTitle() {
        return this.title;
    }
}
