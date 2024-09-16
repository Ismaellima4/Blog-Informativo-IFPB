package ifpb.entitybasic.classes;

import ifpb.entitybasic.exceptions.InvalidDescriptionInformationException;
import ifpb.entitybasic.exceptions.InvalidWhiteSpaceException;
import ifpb.entitybasic.interfaces.IDescription;

public class Description implements IDescription {
    private String description;

    public Description(String description) throws Exception {
        this.description = validateDescription(description.trim());
    }
    @Override
    public void changeDescription(String description) throws Exception {
        this.description = validateDescription(description.trim());
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    private String validateDescription(String description) throws Exception {
        validateWhiteSpaces(description);
        if (!description.matches("^.{30,255}")){
            throw new InvalidDescriptionInformationException();
        }
        return description;
    }

    private void validateWhiteSpaces(String content) throws Exception {
        if (content.isEmpty()){
            throw new InvalidWhiteSpaceException();
        }
    }
}
