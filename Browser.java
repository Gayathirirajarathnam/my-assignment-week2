package week2.day1;

public class Browser {
	void launchbrowser(String BrowserName)
	
	{
		System.out.println("Broswer Launched successfull" +BrowserName);
		}
	public void loadUrl() {
		// TODO Auto-generated method stub
		System.out.println("App URL loaded successfully loadURL");
	}
	public static void main(String[] args) {
		
		Browser lm3= new Browser();
		
		lm3.launchbrowser("chrome");
		// TODO Auto-generated method stub
		Browser lm4= new Browser();
		lm4.loadUrl ();
	}

}
