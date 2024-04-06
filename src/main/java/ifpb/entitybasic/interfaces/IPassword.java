package ifpb.entitybasic.interfaces;

public interface IPassword {
    void changePassword(String newPassword) throws Exception;
    String validate(String password) throws Exception;
    String generateHash(String password) throws Exception;
    boolean compareHash(String newPassword) throws Exception;
}
