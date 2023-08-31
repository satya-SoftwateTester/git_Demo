package Test;

import Selnium_Utility.Basic_operation;
import page.Add_to_Cart;
import page.Login_page;
import page.Logout_page;
import page.buy_page;
import page.facebook;

public class logintest extends Login_page
{
	public static void validcrenditional() throws InterruptedException
	{
		Basic_operation.browser();
		Basic_operation.explicity();
		Login_page.user_action("standard_user");
		Thread.sleep(3000);
		Login_page.password_action("secret_sauce");
		Thread.sleep(3000);
		Login_page.Logn_action();
		Thread.sleep(3000);
		Logout_page.action_btn();
	    Logout_page.action_logout();
		drv.quit();
//		Basic_operation.windowhandle();
//		Thread.sleep(4000);
//		facebook.action_email();
	}
	
	public static void invalid_username() throws InterruptedException 
	{
		Basic_operation.browser();
		Basic_operation.explicity();
		Login_page.user_action("standard");
		Thread.sleep(3000);
		Login_page.password_action("secret_sauce");
		Thread.sleep(3000);
		Login_page.Logn_action();
		Thread.sleep(3000);
		//Logout_page.action_btn();
		drv.close();
		
	}
	public static void invalid_password() throws InterruptedException 
	{
		Basic_operation.browser();
		Basic_operation.explicity();
		Login_page.user_action("standard_user");
		Thread.sleep(3000);
		Login_page.password_action("secret");
		Thread.sleep(3000);
		Login_page.Logn_action();
		Thread.sleep(3000);
		//Logout_page.action_btn();
		drv.close();
	}
	public static void empty_unmae_empty_pwd() throws InterruptedException 
	{
		Basic_operation.browser();
		Basic_operation.explicity();
		Login_page.user_action("");
		Thread.sleep(3000);
		Login_page.password_action("");
		Thread.sleep(3000);
		Login_page.Logn_action();
		Thread.sleep(3000);
		//Logout_page.action_btn();
		drv.close();
	}
	public static void invalid_username_invalidpassword() throws InterruptedException 
	{Basic_operation.browser();
	Basic_operation.explicity();
	Login_page.user_action("xsjxhsjxh");
	Thread.sleep(3000);
	Login_page.password_action("zanajshajs");
	Thread.sleep(3000);
	Login_page.Logn_action();
	Thread.sleep(3000);
	//Logout_page.action_btn();
	drv.close();
		
	}
	

//		Logout_page.action_btn();;
//		Logout_page.action_logout();
		
//		Add_to_Cart.action_cart();
//		Thread.sleep(3000);
//
//		Add_to_Cart.action_ct();
//		Thread.sleep(3000);
//
//		buy_page.action_checkout();
//		Thread.sleep(3000);
//
//		buy_page.firstnm_action();
//		buy_page.lastname_action();
//		buy_page.zip_code_action();
//		buy_page.continue_action();
//		Thread.sleep(2000);
//		buy_page.action_finish();
//		Thread.sleep(3000);
//		Logout_page.action_btn();;
//		Thread.sleep(3000);
//		
//		Logout_page.action_logout();
	

}
