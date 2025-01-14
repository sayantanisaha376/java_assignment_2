class Employee{
	private String ename;
	private String designation;
	private double salary;
	private String email;


//getter and setter

    public String getEname(){
		return ename;	
	}
	
	public void  setEname(String ename){
		this.ename=ename;
	}
	
	 public String getDesignation(){
		return designation;	
	}
	
	public void  setDesignation(String designation){
		this.designation=designation;
	}
	
	
	 public double getSalary(){
		return salary;	
	}
	public void  setSalary(double salary){
		this.salary=salary;
	}
	
	 public String getEmail(){
		return email;	
	}
	
	public void  setEmail(String email){
		this.email=email;
	}
	
	public static void main(String []args){
		Employee emp= new Employee();
		emp.setEname("Ankan");
		emp.setDesignation("Developer");
		emp.setSalary(5000);
		emp.setEmail("ank@ibm.com");
		
		System.out.println(emp.getEname() + " works as " + emp.getDesignation() +
                " with email id " + emp.getEmail() + " and earns " + emp.getSalary() + " per annum.");
				
		
		
	}
}
