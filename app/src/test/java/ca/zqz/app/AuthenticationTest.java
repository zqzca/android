package ca.zqz.app;

import org.junit.Ignore;

import ca.zqz.app.logic.Authentication;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class AuthenticationTest {
    @Ignore
    public void testAuthentication() {
        Authentication a = new Authentication();

        boolean success = a.Login("x", "y");

        assertEquals(success, true);
    }
}