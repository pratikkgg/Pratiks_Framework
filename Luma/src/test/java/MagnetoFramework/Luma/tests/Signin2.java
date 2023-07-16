package MagnetoFramework.Luma.tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import MagnetoFramework.Luma.AbstractComponent.SetupDriver;
import MagnetoFramework.Luma.pageobject.SignInPOC;


public class Signin2 {

	@Test
	public void Signin() throws IOException {

		SetupDriver st = new SetupDriver();
		WebDriver driver = st.launchApplication();
		SignInPOC sip = new SignInPOC(driver);

		// Sign_in
		sip.Sign_in_withvalidCredentials();

		// signin validation msg
		sip.Sign_in_Validation_Msg();

		// Sign Out
		sip.Sign_Out();

		// Signout validation
		sip.Sign_Out_validation();

		// signin with invalid credentials
		sip.Sign_in_withinvalidCredentials();

		// Validate the error messages (Capture the screenshot)
		sip.Sign_in_withinvalidCredentials_Screenshot();

		// close the browser
		st.closeTheApplication();
	}

}
