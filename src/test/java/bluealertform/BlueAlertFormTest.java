package bluealertform;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static constants.TestConstants.*;

public class BlueAlertFormTest extends BaseTest {

    @Test
    public void test() {
        blueAlertFormPage
                .load()
                .fillFirstName(VALID_FIRST_NAME)
                .fillLastName(VALID_LAST_NAME)
                .fillEmail(VALID_EMAIL)
                .fillPhoneNumber(VALID_PHONE_NUMBER)
                .fillPeselNumber(VALID_PESEL_NUMBER)
                .fillIdNumber(VALID_ID_NUMBER)
                .fillDate(VALID_DATE)
                .clickConfirmButton();
    }
}
