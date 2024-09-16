package ifpb.entitybasic.classes;

import ifpb.entitybasic.exceptions.InvalidChangePassword;
import ifpb.entitybasic.exceptions.InvalidPasswordException;
import ifpb.entitybasic.interfaces.IPassword;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Password implements IPassword {
    private String password;

    public Password(String password) throws Exception {
        this.password = validate(password);
    }

    private String validate(String password) throws Exception {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!?.,*/_])(?=\\S+$).{8,20}$";
        if (!password.matches(regex)){
            throw new InvalidPasswordException();
        }
        return generateHash(password);
    }

    private String generateHash(String password) throws Exception {
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte[] hash = algorithm.digest(password.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            hexString.append(String.format("%02X", 0xFF & b));
        }
        return hexString.toString();
    }

    @Override
    public void changePassword(String newPassword) throws Exception {
        if (compareHash(newPassword)){
            throw new InvalidPasswordException();
        }
        this.password = validate(newPassword);
    }

    private boolean compareHash(String newPassword) throws Exception {
        String passwordHash = generateHash(newPassword);
        if (this.password.equals(passwordHash)){
            throw new InvalidChangePassword();
        }
        return false;
    }

}
