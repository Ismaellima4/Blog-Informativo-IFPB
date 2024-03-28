package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidDescriptionInformationException;
import ifpb.entitybasic.exceptions.InvalidTitleInformationException;
import ifpb.entitybasic.exceptions.InvalidWhiteSpaceException;
import ifpb.entitybasic.interfaces.IInformation;

public class Information implements IInformation {
    private String title;
    private String description;

    public Information(String title, String description) throws Exception {
        this.title = validateTitle(title.trim());
        this.description = validateDescription(description.trim());
    }

    private void validateWhiteSpaces(String content) throws Exception {
        if (content.isEmpty()){
            throw new InvalidWhiteSpaceException();
        }
    }

    private String validateTitle(String title) throws Exception {
        validateWhiteSpaces(title);
        if (!title.matches("^.{5,60}")){
            throw new InvalidTitleInformationException();
        }
        return title;
    }

    private String validateDescription(String description) throws Exception {
        validateWhiteSpaces(description);
        if (!description.matches("^.{30,255}")){
            throw new InvalidDescriptionInformationException();
        }
        return description;
    }

    @Override
    public void changeTitle(String title) throws Exception {
        this.title = validateTitle(title.trim());
    }
    @Override
    public void changeDescription(String description) throws Exception {
        this.description = validateDescription(description.trim());
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
