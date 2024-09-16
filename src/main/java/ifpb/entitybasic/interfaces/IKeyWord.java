package ifpb.entitybasic.interfaces;

public interface IKeyWord extends IBasicEntity<IKeyWord> {
    boolean compareTo( IKeyWord compareData);

    IID getId();
}
