package service;
/*
 * 用数组管理公司员工和开发团队成员对象
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
	//将指定员工添加到开发团队中
	public void addMember(Employee e)throws TeamException{
		if(total >= MAX_NUMBER) {
			throw new TeamException("团队已满,无法添加");
		}else if(!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员,无法添加");
		}else if(isExist(e)) {
			throw new TeamException("已有该员工");
		}
		Programmer p = (Programmer)e;
		if(p.getStatus().getName().equals("BUSY")) {
			throw new TeamException("该成员已是某团队成员");
		}else if(p.getStatus().getName().equals("VOCATION")){
			throw new TeamException("该成员正在休假中");
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
				throw new TeamException("团队中只能有一名架构师");
		}else if(p instanceof Designer) {
			if(numOfDes >= 2)
				throw new TeamException("团队中只能有两名设计师");
		}else if(numOfPro >= 3) {
			throw new TeamException("团队中只能有三名程序员");
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
	//删除成员
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
			throw new TeamException("未找到指定memberId的员工,删除失败");
		}
		for (int j = i+1; j < total; j++) {
				team[j - 1] = team[j];
		}
		team[--total] = null;
		
	}
}
