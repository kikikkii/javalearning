package service;
/*
 * ���������˾Ա���Ϳ����Ŷӳ�Ա����
 * 
 * 
 */

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;

public class TeamService {
	public static final int length = 0;
	private static int count = 1;
	private final int MAX_NUMBER = 5;
	private Programmer[] team = new Programmer[MAX_NUMBER];
	private int total = 0;
	
	public TeamService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Programmer[] getTeam() {
		Programmer[] team =new Programmer[total];
		for (int i = 0; i < team.length; i++) {
			team[i] = this.team[i];
		}
		return team;
	}
	//��ָ��Ա����ӵ������Ŷ���
	public void addMember(Employee e)throws TeamException{
		if(total >= MAX_NUMBER) {
			throw new TeamException("�Ŷ�����,�޷����");
		}else if(!(e instanceof Programmer)) {
			throw new TeamException("�ó�Ա���ǿ�����Ա,�޷����");
		}else if(isExist(e)) {
			throw new TeamException("���и�Ա��");
		}
		Programmer p = (Programmer)e;
		if(p.getStatus().getName().equals("BUSY")) {
			throw new TeamException("�ó�Ա����ĳ�Ŷӳ�Ա");
		}else if(p.getStatus().getName().equals("VOCATION")){
			throw new TeamException("�ó�Ա�����ݼ���");
		}
		int numOfArch = 0,numOfDes = 0,numOfPro =0;
		for (int i = 0; i < total ; i++) {
			if(team[i] instanceof Architect) {
				numOfArch++;
			}else if(team[i] instanceof Designer) {
				numOfDes++;
			}else if(team[i] instanceof Programmer) {
				numOfPro++;
			}
		}
		if(p instanceof Architect ) {
			if(numOfArch >= 1)
				throw new TeamException("�Ŷ���ֻ����һ���ܹ�ʦ");
		}else if(p instanceof Designer) {
			if(numOfDes >= 2)
				throw new TeamException("�Ŷ���ֻ�����������ʦ");
		}else if(numOfPro >= 3) {
			throw new TeamException("�Ŷ���ֻ������������Ա");
		}
		
		team[total++] = p;
		p.setStatus(Status.BUSY);
		p.setMemberID(count++);
	}
	
	private boolean isExist(Employee e) {
		for (int i = 0; i < total; i++) {
			if(team[i].getID() == e.getID()) {
				return true;
			}
		}
		return false;
	}
	//ɾ����Ա
	public void removeMember(int memberId)throws TeamException{
		int i = 0;
		for (i = 0; i < total; i++) {
			 if(team[i].getID() == memberId) {
				 team[i].setStatus(Status.FREE); 
				 team[i] = null;
				 break;
			 }
		}
		if(i == total) {
			throw new TeamException("δ�ҵ�ָ��memberId��Ա��,ɾ��ʧ��");
		}
		for (int j = i+1; j < total; j++) {
				team[j - 1] = team[j];
		}
		team[--total] = null;
		
	}
}
