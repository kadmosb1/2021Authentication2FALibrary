import tfa.Authentication2FA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String key = Authentication2FA.activate ("user1", "Invoicing");

        if (key != null) {

            System.out.print ("De code in uw Google Authenticator: ");

            if (Authentication2FA.checkAuthenticatorCode (key, scanner.nextLine ())) {
                System.out.println ("klopt");
            }
            else {
                System.out.printf ("Code had %s moeten zijn.", Authentication2FA.getTOTPCode (key));
            }
        }
    }
}