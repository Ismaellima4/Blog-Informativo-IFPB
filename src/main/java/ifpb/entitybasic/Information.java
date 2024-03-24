package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidDescriptionInformationException;
import ifpb.entitybasic.exceptions.InvalidTitleInformationException;
import ifpb.entitybasic.exceptions.InvalidWhiteSpaceException;

public class Information {
    private String title;
    private String description;

    public Information(String title, String description) throws Exception {
        if (validateTitle(title) && validateDescription(description)) {
            this.title = title.trim();
            this.description = description.trim();
        }
    }

    public static boolean validateWhiteSpaces(String content){
        return content.isEmpty();
    }

    public static boolean validateTitle(String title) throws Exception {
        if (validateWhiteSpaces(title)){
            throw new InvalidWhiteSpaceException();
        }
        return title.matches("^.{5,60}");
    }

    public static boolean validateDescription(String description) throws Exception {
        if (validateWhiteSpaces(description)){
            throw new InvalidWhiteSpaceException();
        }
        return description.matches("^.{30,255}");
    }

    public void changeTitle(String title) throws Exception {
        String titleTrim = title.trim();
        if (!validateTitle(titleTrim)){
            throw new InvalidTitleInformationException();
        }
        this.title = titleTrim;
    }

    public void changeDescription(String description) throws Exception {
        String descriptionTrim = description.trim();
        if (!validateDescription(descriptionTrim)){
            throw new InvalidDescriptionInformationException();
        }
        this.description = descriptionTrim;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
