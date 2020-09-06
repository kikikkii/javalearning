package junit;

import org.junit.Test;

import domain.Employee;
import service.NameListService;
import service.TeamException;

/*
 * ∂‘NameListService¿‡µƒ≤‚ ‘
 */


public class NameListServiceTest {
	
	@Test
	public void testGetAllEmployees() {
		NameListService service = new NameListService();
		Employee[] allEmployees = service.getAllEmployees();
		for (int i = 0; i < allEmployees.length; i++) {
			System.out.println(allEmployees[i]);
		}
		
	}
	@Test
	public void testGetEmployee() {
		NameListService service = new NameListService();
		try {
			System.out.println(service.getEmployee(1));
			System.out.println(service.getEmployee(100));
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}

