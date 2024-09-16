package ifpb.entitybasic.interfaces;

public interface IID<T> {
    T getId();
    boolean compareTo(IID<T> compareId);
}
