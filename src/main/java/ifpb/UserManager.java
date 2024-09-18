package ifpb;

public interface UserManager {
    String signIn(String email, String password); // Corrigido
    String signUp(String name, String email, String password, String username); // Corrigido
    void removeUser(int id);
    boolean update(int id, String name, String email, String password, String username);
}