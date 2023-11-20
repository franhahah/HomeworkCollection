import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;
import java.awt.*;
public class PasswordValidatorTest {

    private PasswordValidator validator=new PasswordValidator();

    @Test
    public void goodPassword() {
        PasswordValidator validator = new PasswordValidator();
        String password = "P@ssw0rd";
        //boolean expectedResult = true;


        boolean result = validator.validate(password);

        //assertEquals(expectedResult, result);
    assertTrue(validator.validate(password));
        //System.out.println("expectedResult:" + expectedResult);
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

        boolean expectedResult = false;


        boolean result = validator.validate(password);

        assertFalse("Passsword must be unvalid", validator.validate(password));

        //assertEquals(expectedResult, result);
        System.out.println("expectedResult:" + expectedResult);
        System.out.println("result:" + result);
    }

    @Test
    public void PasswordisNull() {
        PasswordValidator validator = new PasswordValidator();
        String password = (" ");
        boolean result = validator.validate(" ");

        assertFalse("pasword is Null not valid", validator.validate(" "));

        System.out.println("result:" + result);

        assertFalse(validator.validate(password));
    }

    @Test
    public void PasswordNoLetters() {
        PasswordValidator validator = new PasswordValidator();

        boolean result = validator.validate("12365");

        assertFalse("pasword is no letters not valid", validator.validate("12365"));

        System.out.println("result:" + result);


    }
    @Test
    public void PasswordNoSpecChar(){

        assertFalse(validator.validate("P@ssw0rd"));


    }
}

