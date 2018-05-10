package dbDemo.src.ciccc.dbdemo.database;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Rodrigo Moura Gonçalves
 * 
 */
public class Database {

	public static final String DB_DRIVER_KEY = "db.driver";
	public static final String DB_URL_KEY = "db.url";
	public static final String DB_USER_KEY = "db.user";
	public static final String DB_PASSWORD_KEY = "db.password";

	private static Connection connection;
	private final Properties _properties;

	/**
	 * Constructor
	 * 
	 * @param properties
	 *            the properties to bet set
	 * @throws FileNotFoundException
	 *             If the db.properties file was not found
	 * @throws IOException
	 *             IOEXception
	 */
	public Database(Properties properties) throws FileNotFoundException, IOException {
		_properties = properties;
	}

	/**
	 * Open a connection with the DB
	 * 
	 * @return the connection
	 * @throws SQLException
	 *             SQLException
	 */
	public Connection getConnection() throws SQLException {
		if (connection != null) {
			return connection;
		}

		try {
			connect();
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		}

		return connection;
	}

	private void connect() throws ClassNotFoundException, SQLException {
		Class.forName(_properties.getProperty(DB_DRIVER_KEY));
		System.out.println("Driver loaded");

		connection = DriverManager.getConnection(_properties.getProperty(DB_URL_KEY),
				_properties.getProperty(DB_USER_KEY), _properties.getProperty(DB_PASSWORD_KEY));

		System.out.println("Database connected");
	}

	/**
	 * Close the connection
	 */
	public void shutdown() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Check if the table exists in the DB.
	 * 
	 * @param tableName
	 *            the table name to check
	 * @return True if the table exists or false if not exists in the DB
	 * @throws SQLException
	 *             SQLException
	 */
	public static boolean tableExists(String tableName) throws SQLException {
		DatabaseMetaData databaseMetaData = connection.getMetaData();
		ResultSet resultSet = null;
		String rsTableName = null;

		try {
			resultSet = databaseMetaData.getTables(connection.getCatalog(), "%", "%", null);
			while (resultSet.next()) {
				rsTableName = resultSet.getString("TABLE_NAME");
				if (rsTableName.equalsIgnoreCase(tableName)) {
					return true;
				}
			}
		} finally {
			resultSet.close();
		}

		return false;
	}
}
