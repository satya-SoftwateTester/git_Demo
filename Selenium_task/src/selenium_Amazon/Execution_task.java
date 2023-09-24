package selenium_Amazon;

public class Execution_task {

	public static void main(String[] args) throws InterruptedException 
	{
		Selenium_Utility.browser();
		first_task.enter_value("Camera");
		//first_task.dropdownlist();
		Selenium_Utility.dropdown();
		first_task.enter_go_action();
		second_task.details();
		
	}

}
