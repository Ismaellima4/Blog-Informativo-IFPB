package ifpb.entitybasic.interfaces;

public interface IUser {

    void changeName(String name);
    void changeEmail(String email);
    String getUsername();
    void changePassword(String password);
    boolean verifyPassword(String password);
}
