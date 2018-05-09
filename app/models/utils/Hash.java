package models.utils;

import org.mindrot.jbcrypt.BCrypt;

import java.util.UUID;


public class Hash {

    /* Create Password*/
    public static String createPassword(String clearString) throws AppException {
        if (clearString == null) {
            throw new AppException("No password defined!");
        }
        return BCrypt.hashpw(clearString, BCrypt.gensalt());
    }

    /* Check password*/
    public static boolean checkPassword(String candidate, String encryptedPassword) {
        if (candidate == null) {
            return false;
        }
        if (encryptedPassword == null) {
            return false;
        }
        return BCrypt.checkpw(candidate, encryptedPassword);
    }
}
