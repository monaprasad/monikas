package com.girnar.ems;

public class Manager1 extends Manager {
	
private int ssn;
private String designation;
private String name;	
	

	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "manager id"+"\t"+"designation"+"\t"+"name"+"\n"
			   +ssn+"\t"+designation+"\t\t" +name;
	}

    public String getDesignation() 
    {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
