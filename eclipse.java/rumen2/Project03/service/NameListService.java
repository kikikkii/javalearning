package service;
import domain.Architect;
import domain.Designer;
/*
 *用数组管理公司员工和开发团队成员对象 
 * 保存公司所有员工对象
 */
import domain.Employee;
import domain.Equipment;
import domain.NoteBook;
import domain.PC;
import domain.Printer;
import domain.Programmer;

import static service.Data.*;
public class NameListService {
	Employee[] employees;

	/*
	 * 给数组及数组元素初始化
	 */
	public NameListService() {
		super();
		// TODO Auto-generated constructor stub
		employees = new Employee[EMPLOYEES.length];
		for (int i = 0; i < employees.length; i++) {
			int type = Integer.parseInt(EMPLOYEES[i][0]);
			int id = Integer.parseInt(EMPLOYEES[i][1]);
			String name = EMPLOYEES[i][2];
			int age = Integer.parseInt(EMPLOYEES[i][3]);
			double salary = Double.parseDouble(EMPLOYEES[i][4]);
			Equipment equipment;
			switch(type) {
			case Data.EMPLOYEE:{
				employees[i] = new Employee(id,name,age,salary);
				break;
			}
			case Data.PROGRAMMER:{
				equipment = CreatEquipment(i);
				employees[i] = new Programmer(id,name,age,salary,equipment);
				break;
			}
			case Data.DESIGNER:{
				equipment = CreatEquipment(i);
				double bonus = Double.parseDouble(EMPLOYEES[i][5]);
				employees[i] = new Designer(id,name,age,salary,equipment,bonus);
				break;
			}
			case Data.ARCHITECT:{
				equipment = CreatEquipment(i);
				double bonus = Double.parseDouble(EMPLOYEES[i][5]);
				int stock = Integer.parseInt(EMPLOYEES[i][6]);
				employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
				break;
			}
			}
		}
		
	}
	
	
	private Equipment CreatEquipment(int index) {
		// 获取指定index员工位置上的设备
		int type = Integer.parseInt(EQUIPMENTS[index][0]);
		switch(type) {
		case PC:{
			return new PC(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
		}
		case NOTEBOOK:{
			return new NoteBook(EQUIPMENTS[index][1], Double.parseDouble(EQUIPMENTS[index][2]));
		}
		case PRINTER:{
			return new Printer(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
		}
		}
		return null;
	}
	/*
	 * 获取当前所有员工
	 */
	
	public Employee[] getAllEmployees() {
		return this.employees;
	}
	//返回指定ID的员工
	public Employee getEmployee(int id) throws TeamException {
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getID() == id) {
				return employees[i];
			}
		}
		throw new TeamException("找不到指定员工");
	}
	
	
}
