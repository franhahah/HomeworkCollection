import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.awt.*;
public class PasswordValidatorTest {

    @Test
    public void GoodPassword() {
        PasswordValidator validator = new PasswordValidator();
        String password = "P@ssw0rd1";
        boolean expectedResult = true;


        boolean result = validator.validate(password);

        assertEquals(expectedResult, result);

        System.out.println("expectedResult:" + expectedResult);
        System.out.println("result:" + result);
    }

    @Test
    public void PasswordToShort() {
        PasswordValidator validator = new PasswordValidator();

        String password = ("P@ss1");
        boolean expectedResult = false;

        boolean result = validator.validate(password);

        assertEquals(expectedResult, result);
        System.out.println("expectedResult:" + expectedResult);
        System.out.println("result:" + result);
    }

    @Test
    public void PasswordToLong() {
        PasswordValidator validator = new PasswordValidator();
        String password = ("P@ssword1234567895ede");

        assertTrue("Passsword must be unvalid", validator.validate(password));

    }

    @Test
    public void PasswordisNull() {
        PasswordValidator validator = new PasswordValidator();
        boolean result = validator.validate(" ");
        assertFalse("pasword is Null not valid", validator.validate(" "));
        System.out.println("result:" + result);

    }

    @Test
    public void PasswordNoLetters() {
        PasswordValidator validator = new PasswordValidator();

        boolean result = validator.validate("12365");

        assertFalse("pasword is no letters not valid", validator.validate("12365"));

        System.out.println("result:" + result);


    }
}

