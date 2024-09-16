package ifpb.entitybasic.interfaces;

public interface IAuthor extends IBasicEntity<IAuthor> {
    boolean compareKeys(IID id);
    String getName();
    IID<String> getId();
}
