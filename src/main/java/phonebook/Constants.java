package phonebook;

/**
 * This class contains constants url,test data and credentials
 */
public class Constants {

    //constants url
    public static final String LOGIN_URL = "http://phonebook.telran-edu.de:8080/user/login";

    //test credentials
    public static String USER_EMAIL = "test@gmail.com";
    public static String USER_PASSWORD = "test@gmail.com";

    public static enum FieldType {
        EMAIL,
        PASSWORD
    }
}
