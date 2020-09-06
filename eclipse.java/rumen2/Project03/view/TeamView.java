package view;
/*
 * ����ģ��,����˵�����ʾ�ʹ����û�����
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
			System.out.println("1-�Ŷ��б� 2-����Ŷӳ�Ա 3-ɾ���Ŷӳ�Ա 4-�˳� ��ѡ��(1-4):");
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
				System.out.println("�Ƿ�ȷ���˳�(Y/N)");
				char isExit = TSUtility.readConfirmSelection();
				if(isExit == 'Y') {
					loop = false;
				}
				break;
			}
		}
	}
	//��ʾ���е�Ա����Ϣ
	private void listAllEmployees() {
//		System.out.println("��ʾ��˾����Ա��");
		System.out.println("---------------------------------------�����Ŷӵ������-----------------------------\n");
		Employee[] employees = listSvc.getAllEmployees();
		if(employees == null || employees.length == 0) {
			System.out.println("��˾��û���κ�Ա����Ϣ");
			return ;
		}else {
			System.out.println("ID\t����\t����\t����\tְλ\t״̬\t����\t��Ʊ\t�����豸");
			for (int i = 0; i < employees.length; i++) {
				System.out.println(employees[i].toString());
			}
		}
		
		
	}
	private void getTeam() {
//		System.out.println("�鿴�����Ŷ����");
		Programmer[] team = teamSvc.getTeam();
		if(team.length == 0) {
			System.out.println("�Ŷ���û�г�Ա");
			return;
		}
		System.out.println("----------------------------�Ŷӳ�Ա�б�--------------------------");
		System.out.println("TID/ID\t����\t����\t����\tְλ\t״̬\t����\t��Ʊ");
		for (int i = 0; i < team.length; i++) {
			
			System.out.println(team[i].getDetailsForTeam());
		}
	}
	private void addMember() {
		System.out.println("����Ŷӳ�Ա");
		System.out.println("������Ҫ���Ա����ID");
		int ID = TSUtility.readInt();
		
		try {
			Programmer employee = (Programmer)this.listSvc.getEmployee(ID);
			teamSvc.addMember(employee);
			employee.setStatus(Status.BUSY);
			
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		} catch(ClassCastException e) {
			System.out.println("�Բ���,���Ա������");
		}
		
	}
	private void deleteMember() {
		System.out.println("ɾ���Ŷӳ�Ա");
		System.out.println("������Ҫɾ��Ա����ID");
		int ID = TSUtility.readInt();
		System.out.println("ȷ���Ƿ�ɾ��(Y/N)");
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
