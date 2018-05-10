package dbDemo.src.ciccc.dbdemo;

import dbDemo.src.ciccc.dbdemo.data.Employee;
import dbDemo.src.ciccc.dbdemo.database.dao.EmployeeDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDaoTester {

	private static List<Integer> listOfEmployeesId;
	private static EmployeeDao _employeeDao;

	/**
	 * Set the employeeDao
	 * 
	 * @param employeeDao
	 *            the employeeDao to set
	 */
	public static void setEmployeeDao(EmployeeDao employeeDao) {
		_employeeDao = employeeDao;
	}

	/**
	 * Fill the employees id list
	 * 
	 * @throws SQLException
	 *             SQLException
	 */
	public static void fillListOfEmployeesId() throws SQLException {
		listOfEmployeesId = _employeeDao.getIds();
	}

	/**
	 * 
	 * @return The list of employees Id
	 */
	public static List<Integer> getListOfEmployeesId() {
		return listOfEmployeesId;
	}

	/**
	 * Add a employees object in the DB
	 * 
	 * @param employees
	 *            to be added
	 * @throws SQLException
	 *             SQLException
	 */
	public static void addEmployeeToDB(Employee employee) throws SQLException {
		_employeeDao.add(employee);
	}

	/**
	 * Get all employees object from the DB
	 * 
	 * @return A List of employees from the DB
	 * @throws SQLException
	 *             SQLException
	 * @throws Exception
	 */
	public static List<Employee> getEmployeesFromDB() throws SQLException, Exception {

		List<Employee> employees = new ArrayList<Employee>();

		if (listOfEmployeesId == null) {
			fillListOfEmployeesId();
		}

		for (Integer id : listOfEmployeesId) {
			Employee employee = _employeeDao.readById(id);
			employees.add(employee);
		}

		return employees;
	}
}
