package HYR_Web_Waits;

public class Execution {

	public static void main(String[] args) throws InterruptedException
	{
		driver.browser();
		wait_operation.selptc_action();
		Thread.sleep(3000);
		wait_operation.wait_action1();
		Thread.sleep(5000);
		wait_operation.remove_ad_action();
	}

}
