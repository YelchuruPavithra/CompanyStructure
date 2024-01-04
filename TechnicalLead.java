package miniproject2;
import java.util.ArrayList;
public class TechnicalLead extends TechnicalEmployee
{
	public ArrayList<SoftwareEngineer>team=new ArrayList<>();
	
	public TechnicalLead(String name)
	{
		super(name);
		this.baseSalary*=1.3;
		this.headCount=4;
	}
	
	public boolean hasHeadCount() 
	{
		//Should return true if the number of direct reports this manager has is less than their headcount.
		if(team.size()<this.headCount)
			return true;
		else
			return false;
	}
	
	public boolean addReport(SoftwareEngineer e)
	{
		//if the TechnicalLead has head count left should add this employee to their list of direct reports.
		// If the employee is successfully added to the TechnicalLead's direct reports true should be returned,else return false
		if(hasHeadCount())
		{
			team.add(e);
			e.setManager(this);
			return true;
		}
		else
			return false;
	}
	
	public boolean approveCheckIn(SoftwareEngineer e)
	{
		//Should see if the employee passed in does report to this manager and if their code access is currently set to "true".
		// If both those things are true, true is returned, otherwise false is returned
		if(e.getManager().equals(this)&& e.getCodeAccess())
			return true;
		else
			return false;
	}
	
	public boolean requestBonus(Employee e, double bonus)
	{
		//Should check if the bonus amount requested would be approved by the BusinessLead supporting this TechnicalLead.
        // If it is, that employee should get that bonus and true should be returned. False should be returned otherwise
		BusinessLead businessLead=(BusinessLead)getaccountantSupport().getManager();
		if(businessLead.approveBonus(e,bonus))
			return true;
		else
			return false;
	}
	
	public String getTeamStatus()
	{
		if(team.size()==0)
			return this.employeeStatus()+"and no direct reports yet";
		else
		{
			String teamStatus="";
            for (int i=0;i<team.size();i++){
                teamStatus+=("    "+team.get(i).employeeStatus()+"\n");
            }
            return this.employeeStatus()+" and is managing: \n"+teamStatus;
		}
	}
	

}
