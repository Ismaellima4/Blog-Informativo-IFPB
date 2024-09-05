package ifpb.entitybasic.exceptions;


/*
 * Lança a exceção quando a tentativa de mudança de senha é falha pois a senha é igual a senha anterior
 */
public class InvalidChangePassword extends Exception {
    public InvalidChangePassword() {
        super("The new password cannot be the same as the previous password.");
    }
}