package factory;

public class Main {
	private static String DB = "oracle";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseFactory factory = new DatabaseFactory();
		Database database = null;
		
		if (Main.DB.equals("oracle")) {
			database = factory.getOracle();
		} else if (Main.DB.equals("mysql")) {
			database = factory.getMySql();
		}
		
		database.connect();
	}

}
