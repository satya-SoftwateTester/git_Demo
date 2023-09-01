package Test;

import Selnium_Utility.Basic_operation;
import page.Login_page;
import page.facebook;

public class facebooktest extends facebook

{
	public static void fbvalidcreditional() throws InterruptedException 
	{
		Basic_operation.browser();
		Basic_operation.explicity();
		Login_page.user_action("standard_user");
		Thread.sleep(3000);
		Login_page.password_action("secret_sauce");
		Thread.sleep(3000);
		Login_page.Logn_action();
		Thread.sleep(3000);
		Basic_operation.windowhandle();;
		facebook.action_email("abc@gmail.com");
		facebook.action_password("sshgs");
		drv.close();
	}

}
