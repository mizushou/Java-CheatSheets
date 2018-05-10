package dbDemo.src.ciccc.dbdemo.database.dao;

import dbDemo.src.ciccc.dbdemo.database.Database;
import dbDemo.src.ciccc.dbdemo.database.util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author Rodrigo Moura Gonçalves
 * 
 */
public abstract class Dao {

	protected final Database _database;
	protected final String _tableName;

	/**
	 * Constructor
	 * 
	 * @param database
	 *            the database to set
	 * @param tableName
	 *            the tablename to set
	 */
	protected Dao(Database database, String tableName) {
		_database = database;
		_tableName = tableName;
	}

	/**
	 * Create table
	 * 
	 * @param createStatement
	 *            the createStatement to be executed
	 * @throws SQLException
	 *             SQLException
	 */
	protected void create(String createStatement) throws SQLException {
		Statement statement = null;
		try {
			System.out.println("Create table");
			Connection connection = _database.getConnection();
			statement = connection.createStatement();

			if (!DbUtil.tableExists(connection, _tableName)) {
				statement.executeUpdate(createStatement);
			}
		} finally {
			close(statement);
		}
	}

	/**
	 * Add a data object in the table
	 * 
	 * @param updateStatement
	 *            the updateStament to be executed
	 * @throws SQLException
	 *             SQLException
	 */
	protected void add(String updateStatement) throws SQLException {
		Statement statement = null;
		try {

			Connection connection = _database.getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(updateStatement);
		} finally {
			close(statement);
		}
	}

	/**
	 * Drop table if already exists
	 * 
	 * @throws SQLException
	 *             SQLException
	 */
	public void drop() throws SQLException {
		Connection connection;
		Statement statement = null;

		try {
			System.out.println("Drop table");
			connection = _database.getConnection();
			statement = connection.createStatement();

			if (DbUtil.tableExists(connection, _tableName)) {
				String dropStatement = "DROP TABLE " + _tableName;

				statement.executeUpdate(dropStatement);
			}
		} finally {
			close(statement);
		}
	}

	/**
	 * Close the statement
	 * 
	 * @param statement
	 *            the statement to be closed
	 */
	protected void close(Statement statement) {
		try {
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}