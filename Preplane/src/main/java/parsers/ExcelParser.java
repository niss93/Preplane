package parsers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import buisnessobject.Airport;
import buisnessobject.Crew;
import buisnessobject.Flight;
import buisnessobject.FlightStatus;

public final class ExcelParser {

	/**
	 * Creates and returns a list of Flight objects
	 * 
	 * @param xlsFilePath
	 * @return
	 */
	public static List<Flight> creatFlightsFromXLSFile(String xlsFilePath) {
		// The list of Flight objects
		ArrayList<Flight> flightsList = new ArrayList<Flight>();

		try {
			// Instanciating a new File from XLS file
			FileInputStream file = new FileInputStream(new File(xlsFilePath));

			// Get the workbook instance for XLS file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			int index = 1;
			Row row = sheet.getRow(index++);

			while (row != null) {
				Flight flight = rowToFlight(row);
				flightsList.add(flight);

				row = sheet.getRow(index++);
			}
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(flightsList.get(0).getArrivalAirport());
		return flightsList;
	}

	private static Flight rowToFlight(Row row) {
		Flight flight = new Flight();

		// Departure date
		String depDate = row.getCell(0).toString();
		flight.setDepartureDate(depDate);
		// Arrival date
		String arrDate = row.getCell(1).toString();
		flight.setArrivalDate(arrDate);
		// Arrival airport
		String depAirport = row.getCell(2).toString();
		flight.setDepartureAirport(depAirport);
		// Departure airport
		String arrAirport = row.getCell(3).toString();
		flight.setArrivalAirport(arrAirport);
		// Commercial number
		String comNumber = row.getCell(4).toString();
		flight.setCommercialNumber(comNumber);
		// ATC number
		String atcNumber = row.getCell(5).toString();
		flight.setAtcNumber(atcNumber);
		// Status
		String status = row.getCell(6).toString();
		flight.setFlightStatus(FlightStatus.valueOf(status));
		// Crew
		String crew = row.getCell(7).toString();
		flight.setCrew(new Crew(crew));
		// Plane
		int planeID = (int) row.getCell(8).getNumericCellValue();
		flight.setPlaneID(planeID);

		return flight;
	}

	public static void main(String[] args) {
		creatFlightsFromXLSFile(
				"C:\\Users\\Abdou\\git\\Preplane\\Preplane\\src\\main\\webapp\\ExcelFiles\\flights.xlsx");
	}
}
