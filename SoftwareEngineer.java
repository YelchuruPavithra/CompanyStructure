package miniproject2;

public class SoftwareEngineer extends TechnicalEmployee
{
	public boolean codeaccess;
	
	
	public SoftwareEngineer(String name)
	{
		super(name);
		setCodeAccess(true);
	}
	
	public boolean getCodeAccess()
	{
		return codeaccess;
	}
	
	public void setCodeAccess(boolean access)
	{
		this.codeaccess=access;
	}
	public int getSuccessfulCheckIns()
	{
		//Should return the current count of how many times this SoftwareEngineer has successfully checked in code
		return checkIns;
	}
	
	public boolean checkInCode() 
	{
		//Should check if this SoftwareEngineer's manager approves of their check in.
        // If the check in is approved their successful checkin count should be increased and the method should return "true".
        // If the manager does not approve the check in the SoftwareEngineer's code access should be changed to false and
        // the method should return "false"
		TechnicalLead manager=(TechnicalLead)this.getManager();
		if(manager.approveCheckIn(this))
		{
			this.checkIns++;
			return true;
		}
		else
		{
			codeaccess=false;
			return false;
		}
		
	}

}
