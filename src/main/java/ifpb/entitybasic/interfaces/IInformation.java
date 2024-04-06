package ifpb.entitybasic.interfaces;

public interface IInformation {
    void changeTitle(String title) throws Exception;
    void changeDescription(String description) throws Exception;
    void validateWhiteSpaces(String content) throws Exception;
    String validateTitle(String title) throws Exception;
    String validateDescription(String description) throws Exception;
}
