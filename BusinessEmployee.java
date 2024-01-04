package miniproject2;


public class BusinessEmployee extends Employee
{
	
	public BusinessEmployee(String name)
	{
		//default salary  50000
		super(name,50000.00);
	}
	
	public double getBonusBudget()
	{
		return bonusBudget;
	}
	public void setBonusBudget(double bonusBudget)
	{
		this.bonusBudget=bonusBudget;
	}
	
	public String employeeStatus() 
	{
		// should return like this "1 Kasey with a budget of 22500.0"
		return toString()+" with a budget of "+getBonusBudget();
	}
}
