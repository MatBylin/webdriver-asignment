package bluealertform;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.BlueAlertFormAgreementPage;

import static constants.TestConstants.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BlueAlertFormTest extends BaseTest {

    @Test
    public void fillBlueAlertFormPageValidateRedirectionToAgreementPage() {
        blueAlertFormPage
                .load()
                .fillFirstName(VALID_FIRST_NAME)
                .fillLastName(VALID_LAST_NAME)
                .fillEmail(VALID_EMAIL)
                .fillPhoneNumber(VALID_PHONE_NUMBER)
                .fillPeselNumber(VALID_PESEL_NUMBER)
                .fillIdNumber(VALID_ID_NUMBER)
                .fillDate(VALID_DATE);

        BlueAlertFormAgreementPage agreementPage = blueAlertFormPage.clickConfirmButton();
        assertThat(agreementPage.isPageTitlePresent(), is(true));
    }
}
