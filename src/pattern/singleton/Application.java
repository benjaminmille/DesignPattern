package pattern.singleton;

public class Application {
	private static Application instance = new Application();
	
	/*private User account;*/
	
	private Application() {};
	
	public static Application getInstance() {
		return Application.instance;
	}
}
