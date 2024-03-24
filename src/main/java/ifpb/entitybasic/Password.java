package ifpb.entitybasic;

import ifpb.entitybasic.exceptions.InvalidChangePassword;
import ifpb.entitybasic.exceptions.InvalidPasswordException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Password implements IPassword {
    private String password;

    public Password(String password) throws Exception {
        if(validate(password)){
            throw new InvalidPasswordException();
        }
        this.password = generateHash(password);
    }

    public static boolean validate(String password){
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!?.,*/_])(?=\\S+$).{8,20}$";
        return !password.matches(regex);
    }

    public static String generateHash(String password) throws Exception {
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
        if (validate(newPassword) || compareHash(newPassword)){
            throw new InvalidPasswordException();
        }
        this.password = generateHash(newPassword);
    }

    private boolean compareHash(String newPassword) throws Exception {
        String passwordHash = generateHash(newPassword);
        if (this.password.equals(passwordHash)){
            throw new InvalidChangePassword();
        }
        return false;
    }

    public String getPassword() {
        return password;
    }
}
