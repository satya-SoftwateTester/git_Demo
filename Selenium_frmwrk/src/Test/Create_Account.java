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
	}

}
