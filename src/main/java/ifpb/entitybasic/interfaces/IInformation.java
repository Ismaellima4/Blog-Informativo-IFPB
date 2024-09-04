package ifpb.entitybasic.interfaces;

public interface IInformation {
    void changeTitle(String title) throws Exception;
    void changeDescription(String description) throws Exception;
    IDescription getDescription();
    ITitle getTitle();
}
