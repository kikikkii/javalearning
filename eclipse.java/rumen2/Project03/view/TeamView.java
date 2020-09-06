package view;
/*
 * 主控模块,负责菜单的显示和处理用户操作
 * 
 * 
 */

import domain.Employee;
import domain.Programmer;
import service.NameListService;
import service.Status;
import service.TeamException;
import service.TeamService;

public class TeamView {
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();
	
	public  void enterMainMenu() {
		boolean loop = true;
		char menu = '0';
		while(loop) {
			if(menu != '1') {
				listAllEmployees();
			}
			System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4):");
			menu = TSUtility.readMenuSelection();
			switch (menu) {
			case '1':
				this.getTeam();
				break;
			case '2':
				this.addMember();
				break;
			case '3':
				this.deleteMember();
				break;
			case '4':
				System.out.println("是否确认退出(Y/N)");
				char isExit = TSUtility.readConfirmSelection();
				if(isExit == 'Y') {
					loop = false;
				}
				break;
			}
		}
	}
	//显示所有的员工信息
	private void listAllEmployees() {
//		System.out.println("显示公司所有员工");
		System.out.println("---------------------------------------开发团队调度软件-----------------------------\n");
		Employee[] employees = listSvc.getAllEmployees();
		if(employees == null || employees.length == 0) {
			System.out.println("公司中没有任何员工信息");
			return ;
		}else {
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			for (int i = 0; i < employees.length; i++) {
				System.out.println(employees[i].toString());
			}
		}
		
		
	}
	private void getTeam() {
//		System.out.println("查看开发团队情况");
		Programmer[] team = teamSvc.getTeam();
		if(team.length == 0) {
			System.out.println("团队里没有成员");
			return;
		}
		System.out.println("----------------------------团队成员列表--------------------------");
		System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票");
		for (int i = 0; i < team.length; i++) {
			
			System.out.println(team[i].getDetailsForTeam());
		}
	}
	private void addMember() {
		System.out.println("添加团队成员");
		System.out.println("请输入要添加员工的ID");
		int ID = TSUtility.readInt();
		
		try {
			Programmer employee = (Programmer)this.listSvc.getEmployee(ID);
			teamSvc.addMember(employee);
			employee.setStatus(Status.BUSY);
			
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		} catch(ClassCastException e) {
			System.out.println("对不起,这个员工废了");
		}
		
	}
	private void deleteMember() {
		System.out.println("删除团队成员");
		System.out.println("请输入要删除员工的ID");
		int ID = TSUtility.readInt();
		System.out.println("确认是否删除(Y/N)");
		char readConfirmSelection = TSUtility.readConfirmSelection();
		if(readConfirmSelection == 'Y') {
			try {
				teamSvc.removeMember(ID);
			} catch (TeamException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
	}
	
}
