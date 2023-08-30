package Test;

import Selnium_Utility.Basic_operation;
import page.Add_to_Cart;
import page.Login_page;
import page.Logout_page;

public class logintest 
{
	public static void main(String[] args) throws InterruptedException {
		Basic_operation.browser();
		Basic_operation.explicity();
		Login_page.user_action();
		Login_page.password_action();
		Login_page.Logn_action();
//		Logout_page.action_btn();;
//		Logout_page.action_logout();
//		
		Add_to_Cart.action_cart();
	}
	
}
