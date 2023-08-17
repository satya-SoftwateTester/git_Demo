package orangeHrmfrmwk;



public class Execution {

	public static void main(String[] args) throws InterruptedException 
	{
		
//		WebDriver d; 
//		d=new ChromeDriver();
//		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		d.manage().window().maximize();
		Login.orange();
		
		
		Login.action_user_1();
		Login.action_pwd1();;
		Login.lgn();
		Thread.sleep(2000);
//		logout.pfle();
//		Thread.sleep(2000);
//		logout.logot();
		create_prfl.mf();
		create_prfl.fnm();
		create_prfl.ei();
		create_prfl.sv();
		
		
		


	}

}
