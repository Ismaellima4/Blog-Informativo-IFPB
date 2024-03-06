package ifpb;

public interface UserManager {
    String singIn(String email,String pasword);
    String signUp(String name,String email,String password,String username);
    void removeUser(int id);
    boolean update(int id, String name, String email, String password,String username);
}
