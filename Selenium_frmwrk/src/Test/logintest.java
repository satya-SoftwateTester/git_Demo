package Test;

import Selnium_Utility.Basic_operation;
import page.Login_page;

public class logintest 
{
	public static void main(String[] args) {
		Basic_operation.browser();
		Basic_operation.explicity();
		Login_page.user_action();
		Login_page.password_action();
		Login_page.Logn_action();
	}
	
}
