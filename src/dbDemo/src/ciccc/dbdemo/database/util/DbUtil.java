package dbDemo.src.ciccc.dbdemo.database.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Rodrigo Moura Gonçalves
 * 
 */
public class DbUtil {

	/**
	 * Check if the table exists in the DB.
	 * 
	 * @param connection
	 *            the DB connection
	 * @param tableName
	 *            the table name to check
	 * @return True if the table exists or false if not exists in the DB
	 * @throws SQLException
	 *             SQLException
	 */
	public static boolean tableExists(Connection connection, String tableName) throws SQLException {
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
