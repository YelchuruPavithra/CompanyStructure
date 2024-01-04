package miniproject2;

public abstract class Employee 
{
	private String name;
	public Double baseSalary;
	private int employeeID;
	private Employee manager;
	public double bonusBudget;
	public double bonus;
	public Accountant accountantSupport;
	public int headCount=0;
	
	//parametreized constructor
	public Employee(String name, double baseSalary)
	{
		this.name=name;
		this.baseSalary=baseSalary;
		CompanyStructure.countID++;
		this.employeeID=CompanyStructure.countID;
	}
	
	
	public double getBaseSalary()
	{
		return this.baseSalary;//Should return the employee's current salary
	}
	public String getName() 
	{
		return this.name;//Should return the employee's current name
	}
	public int getEmployeeID()
	{
		//Should return the employee's ID.
		// The ID should be issued on behalf of the employee at the time they are constructed.
		// The first ever employee should have an ID of "1", the second "2" and so on
		return this.employeeID;
	}
	
	public void setManager(Employee manager)
	{
		
		this.manager=manager;
	
	}
	public Employee getManager()
	{
		//Should return a reference to the Employee object that represents this employee's manager
		return manager;
	}
	public Accountant getaccountantSupport()
	{
		return accountantSupport;
	}
	public boolean equals(Employee other)
	{
		//Should return true if the two employee IDs are the same, false otherwise
		return this.getEmployeeID()==other.getEmployeeID();
	}
	public String toString()
	{
		//Should return a String representation of the employee that is a combination of their id followed by their name.
        // Example: "1 Kasey"
		return getEmployeeID()+" "+getName();
	}
	abstract public String employeeStatus();
	public void getBonus()
	{
		
	}
}
