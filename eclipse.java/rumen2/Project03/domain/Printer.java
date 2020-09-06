package domain;

public class Printer implements Equipment {
	private String model;
	private String type;
	
	public Printer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Printer(String model, String type) {
		super();
		this.model = model;
		this.type = type;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String getDescrpition() {
		// TODO Auto-generated method stub
		return model + "(" + type + ")";
	}
	
	
}
