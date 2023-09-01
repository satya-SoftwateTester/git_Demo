package Test;

import page.Add_to_Cart;
import page.buy_page;

public class Buy_test extends buy_page
{
public static void empty_first_name() throws InterruptedException 
{
	logintest.validcrenditional();
	Add_to_Cart.action_cart();
	Add_to_Cart.action_ct();
	buy_page.action_checkout();
	buy_page.firstnm_action("");
	buy_page.lastname_action("vgghg");
	buy_page.zip_code_action("vhgh");
	buy_page.continue_action();
	
	drv.close();
	
}
public static void empty_last_name() throws InterruptedException 
{
logintest.validcrenditional();
Add_to_Cart.action_cart();
Add_to_Cart.action_ct();
buy_page.action_checkout();
buy_page.firstnm_action("jaaj");
buy_page.lastname_action("");
buy_page.zip_code_action("24545");
buy_page.continue_action();
drv.close();

}
public static void empty_zip_code() throws InterruptedException 
{
	logintest.validcrenditional();
	Add_to_Cart.action_cart();
	Add_to_Cart.action_ct();
	buy_page.action_checkout();
	buy_page.firstnm_action("jaaj");
	buy_page.lastname_action("nnnj");
	buy_page.zip_code_action("");
	buy_page.continue_action();
	drv.close();
}
public static void empty () throws InterruptedException 
{
	logintest.validcrenditional();
	Add_to_Cart.action_cart();
	Add_to_Cart.action_ct();
	buy_page.action_checkout();
	buy_page.firstnm_action("");
	buy_page.lastname_action("");
	buy_page.zip_code_action("");
	buy_page.continue_action();
	drv.close();
}
public static void fill_all() throws InterruptedException 
{
	logintest.validcrenditional();
	Add_to_Cart.action_cart();
	Add_to_Cart.action_ct();
	buy_page.action_checkout();
	buy_page.firstnm_action("haghg");
	buy_page.lastname_action("haghgz");
	buy_page.zip_code_action("satyabrata behera");
	buy_page.continue_action();
	drv.close();
}
}
