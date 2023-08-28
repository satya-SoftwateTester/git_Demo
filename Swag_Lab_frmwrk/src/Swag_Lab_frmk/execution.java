package Swag_Lab_frmk;

public class execution {

	public static void main(String[] args) throws InterruptedException 
	{
		driver_swag.browser();
		
		//driver_swag.explicity(Login_operation_swag_lab.login, 10);
		driver_swag.explicity();
		
		Login_operation_swag_lab.user_action();
		Login_operation_swag_lab.password_action();
		Login_operation_swag_lab.Logn_action();
		
		logout_Swaglab.action_btn();
		logout_Swaglab.action_logout();
	}

}
