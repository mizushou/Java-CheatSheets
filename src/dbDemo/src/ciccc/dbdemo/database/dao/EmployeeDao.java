package dbDemo.src.ciccc.dbdemo.database.dao;

import dbDemo.src.ciccc.dbdemo.data.Employee;
import dbDemo.src.ciccc.dbdemo.database.Database;
import dbDemo.src.ciccc.dbdemo.helper.Helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Rodrigo Moura Gonçalves
 *
 */
public class EmployeeDao extends Dao {

	public static final String TABLE_NAME = "employees";
	public static final String ID = "emp_no";
	public static final String FIRST_NAME = "first_name";
	public static final String LAST_NAME = "last_name";
	public static final String BIRTH_DATE = "birth_date";
	public static final String GENDER = "gender";
	public static final String HIRE_DATE = "hire_date";

	/**
	 * Constructor
	 * 
	 * @param database
	 *            the database to set
	 */
	public EmployeeDao(Database database) {
		super(database, TABLE_NAME);
	}

	/**
	 * Add a new employee object in the table
	 * 
	 * @param employee
	 *            the employee object to add
	 * @throws SQLException
	 *             SQLException
	 */
	public void add(Employee employee) throws SQLException {
		Connection connection;
		Statement statement = null;

		try {
			connection = _database.getConnection();
			statement = connection.createStatement();

			String insertQuery = String.format("INSERT INTO %s VALUES('%s', '%s', '%s', '%s', '%s')", //
					_tableName, //
					employee.getFirstName(), //
					employee.getLastName(), //
					employee.getGender(), //
					employee.getBirthDate(), //
					employee.getHireDate());

			System.out.println(insertQuery);
			statement.executeUpdate(insertQuery);
		} finally {
			close(statement);
		}
	}

	/**
	 * Get a single employee object by id
	 * 
	 * @param id
	 *            the employee id as an int
	 * @return the employee object
	 * @throws Exception
	 */
	public Employee readById(int id) throws Exception {
		Connection connection;
		Statement statement = null;
		Employee employee = null;

		try {

			connection = _database.getConnection();
			statement = connection.createStatement();

			String selectQuery = String.format("SELECT * FROM %s WHERE %s = %d", _tableName, ID, id);

			ResultSet resultSet = statement.executeQuery(selectQuery);

			int count = 0;
			while (resultSet.next()) {
				count++;

				if (count > 1) {
					throw new Exception(String.format("Expected one result, got %d", count));
				}

				int idEmployee = resultSet.getInt(ID);
				String firstName = resultSet.getString(FIRST_NAME);
				String lastName = resultSet.getString(LAST_NAME);
				char gender = resultSet.getString(GENDER).charAt(0);
				String bDate = resultSet.getString(BIRTH_DATE);
				String hDate = resultSet.getString(HIRE_DATE);

				LocalDate birthDate = Helper.convertStringFromDBToDate(bDate);
				LocalDate hireDate = Helper.convertStringFromDBToDate(hDate);

				employee = new Employee(idEmployee, firstName, lastName, gender, birthDate, hireDate);

			}
		} finally {
			close(statement);
		}

		return employee;
	}

	/**
	 * Get a single employee object by id
	 * 
	 * @param id
	 *            the employee id as a String
	 * @return the employee object
	 * @throws Exception
	 */
	public Employee getEmployee(String id) throws Exception {
		int employeeId = Integer.parseInt(id);

		return readById(employeeId);
	}

	/**
	 * Get a list of all ids objects in the table
	 * 
	 * @return A List that contains all ids objects in the table
	 * @throws SQLException
	 *             SQLException
	 */
	public List<Integer> getIds() throws SQLException {
		Connection connection;
		Statement statement = null;
		List<Integer> listOfIds = new ArrayList<Integer>();

		try {

			connection = _database.getConnection();
			statement = connection.createStatement();

			String selectQuery = String.format("SELECT %s FROM %s LIMIT 10", ID, _tableName);
			ResultSet resultSet = statement.executeQuery(selectQuery);

			while (resultSet.next()) {
				int idEmployee = resultSet.getInt(ID);
				listOfIds.add(idEmployee);
			}
		} finally {
			close(statement);
		}

		return listOfIds;
	}

	/**
	 * Update a employee object in the table
	 * 
	 * @param employee
	 *            the employee object to update
	 * @throws SQLException
	 *             SQLException
	 */
	public void update(Employee employee) throws SQLException {
		Connection connection;
		Statement statement = null;

		try {

			connection = _database.getConnection();
			statement = connection.createStatement();
			String updateQuery = String.format(
					"UPDATE %s SET %s = '%s', %s = '%s', %s = '%s', %s = '%s', %s = '%s' WHERE %s = %d", //
					_tableName, //
					FIRST_NAME, employee.getFirstName(), //
					LAST_NAME, employee.getLastName(), //
					GENDER, employee.getGender(), //
					BIRTH_DATE, employee.getBirthDate().toString(), //
					HIRE_DATE, employee.getHireDate().toString(), //
					ID, employee.getIdentifier());

			int rowCount = statement.executeUpdate(updateQuery);
			System.out.println(rowCount);
		} finally {
			close(statement);
		}
	}

	/**
	 * Delete a employee object from the table
	 * 
	 * @param employee
	 *            the employee object to delete
	 * @throws SQLException
	 *             SQLException
	 */
	public void delete(Employee employee) throws SQLException {
		Connection connection;
		Statement statement = null;

		try {

			connection = _database.getConnection();
			statement = connection.createStatement();

			String deleteQuery = String.format("DELETE FROM %s WHERE %s = %d", _tableName, ID,
					employee.getIdentifier());

			int rowCount = statement.executeUpdate(deleteQuery);
			System.out.println(rowCount);
		} finally {
			close(statement);
		}
	}

}
