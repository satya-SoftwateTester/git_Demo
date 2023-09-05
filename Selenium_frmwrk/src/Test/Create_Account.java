package Test;

import Selnium_Utility.Basic_operation;
import page.create_account;

public class Create_Account extends create_account
{
	public static void creat() throws InterruptedException
	{
		logintest.validcrenditional();
		Basic_operation.windowhandle();
	//	create_account.action_create();

	}
	public static void validcrdential() throws InterruptedException 
	{
		logintest.validcrenditional();
		Basic_operation.windowhandle();
		create_account.action_fname("satya");
		create_account.action_lname("rinku");
		create_account.action_email("satya123@gmail.com");
		create_account.action_remail("satya123@gmail.com");
		create_account.action_password("xhsxhsh122346");
		create_account.action_day("21");
	}

}
