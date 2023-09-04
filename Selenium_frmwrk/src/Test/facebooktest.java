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
		facebook.Login_action();
		//drv.close();
	}
	public static void fbemptyemailname() throws InterruptedException 
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
		facebook.action_email("");
		facebook.action_password("sshgs");
		facebook.Login_action();
	}public static void fbemptypassword() throws InterruptedException 
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
		facebook.action_email("xyz@gmail.com");
		facebook.action_password("");
		facebook.Login_action();
	}

}
