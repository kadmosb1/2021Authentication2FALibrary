package tfa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Authentication2FATest {

    @Test
    void checkAuthenticatorCode() {
        String secretKey = "2V3H5SSTZ6D7ENRWRVG5IFHWYU22H4D3";
        String expected = Authentication2FA.getTOTPCode (secretKey);
        assertTrue (Authentication2FA.checkAuthenticatorCode (secretKey, expected));
        String notExpected = String.valueOf ((Integer.valueOf (expected) + 1));
        assertFalse (Authentication2FA.checkAuthenticatorCode (secretKey, notExpected));
        Authentication2FA.getTOTPCode (secretKey);
    }
}