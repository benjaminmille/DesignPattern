package factory;

public interface Database {
	public Database connect();
	public int create();
	public int update();
	public int delete();
	public int getItem();
}
