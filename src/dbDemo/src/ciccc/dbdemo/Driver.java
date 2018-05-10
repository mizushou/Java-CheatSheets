package dbDemo.src.ciccc.dbdemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Properties;


import dbDemo.src.ciccc.dbdemo.data.Employee;
import dbDemo.src.ciccc.dbdemo.database.Database;
import dbDemo.src.ciccc.dbdemo.database.dao.EmployeeDao;

public class Driver {

	private static final String DB_PROPERTIES_FILENAME = "db.properties";

	private final Properties dbProperties;
	private static Database database;
	private List<Employee> employees;

	@SuppressWarnings("unused")
	private Connection connection;
	private EmployeeDao employeeDao;

	private Driver(File dbPropertiesFile) throws IOException {
		dbProperties = new Properties();
		dbProperties.load(new FileReader(dbPropertiesFile));

		database = new Database(dbProperties);
	}

	public static void main(String[] args) {
		// DateTime when the program starts
		Instant startDateTime = Instant.now();
		System.out.println("Start at: " + startDateTime);

		try {
			File dbPropertiesFile = getPropertyFile();
			Driver driver = new Driver(dbPropertiesFile);
			driver.run();
		}

		catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// DateTime when the program ends
			Instant endDateTime = Instant.now();
			System.out.println("Finished at: " + endDateTime);

			// Difference between those two dates
			Duration duration = Duration.between(startDateTime, endDateTime);
			System.out.println("Duration: " + duration.toMillis() + " ms\n");
		}
	}

	private void run() throws ClassNotFoundException, SQLException, Exception {
		connection = database.getConnection();
		employeeDao = new EmployeeDao(database);

		// Set the employeeDao to the tester
		EmployeeDaoTester.setEmployeeDao(employeeDao);

		try {

			// Get a list of all employees object in the table
			employees = EmployeeDaoTester.getEmployeesFromDB();

			System.out.println("Employees from DB:\n");

			for (Employee employee : employees) {
				System.out.println(employee);
			}
			System.out.println();
		} finally {
			database.shutdown();
		}
	}

	private static File getPropertyFile() {
		File dbPropertiesFile = new File(DB_PROPERTIES_FILENAME);
		if (!dbPropertiesFile.exists()) {
			System.out.format("Required '%s' is missing.", DB_PROPERTIES_FILENAME);
			System.exit(-1);
		}

		return dbPropertiesFile;
	}

}
