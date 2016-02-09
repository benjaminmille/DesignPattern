/**
 * 
 */
package factory;

/**
 * @author bmille
 *
 */
public class DatabaseFactory {
	public Database getOracle() {
		return new Oracle();
	};
	public Database getMySql() {
		return new MySql();
	};
}
