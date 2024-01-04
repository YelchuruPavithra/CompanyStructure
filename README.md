# CompanyStructure

# anudip-miniproject2
1.Employee 
Employee has two parameters name and base 
salary
getBaseSalary() returns the employee's base salary
getName() returns the  employee's name
getEmployeeID() returns a unique employee ID starting from 1 for the first employeet then 2 and so on.
getManager() returns a reference to the employee's manager.
equals(Employee other)  returns true if the two employee’s ID are the same, 
false otherwise
toString() returns a string representation of the employee as "ID Name".
employeeStatus() provides a string representation of the employee's status.

2. TechnicalEmployee has default base salary of 75000.
employeeStatus() returns a string representation that includes the employee's ID and the number of successful check-ins.
It is subclass of employee

3. BusinessEmployee has a default salary of 50000.
getBonusBudget() maintains and returns the bonus budget for the team they support.
employeeStatus() returns a string representation including the employee's ID, name, and budget.
It is subclass of employee

4. SoftwareEngineer 
getCodeAccess() returns whether the engineer has access to code.
setCodeAccess(boolean access) allows to update the code access.
getSuccessfulCheckIns() returns the number of successful code check-ins.
checkInCode() checks if the manager approves of a code check-in and updates the check-in count accordingly.
It is subclass of TechnicalEmployee

5. Accountant represents 
getTeamSupported() returns the TechnicalLead that the accountant is supporting.
supportTeam(TechnicalLead lead) Accountant's bonus budget should be 
updated to be the total of each SoftwareEngineer's base salary that 
reports to that TechnicalLead plus 10%.
approveBonus(double bonus) checks if the accountant can approve a bonus based on the budget.
employeeStatus() returns a string representation including the budget and the TechnicalLead's name.
It is subclass of  BusinessEmployee


6. TechnicalLead represents technical leads with a higher base salary and a default headcount of 4.
hasHeadCount()Should return true if the number of direct reports this 
manager has is less than their headcount.
addReport(SoftwareEngineer e) adds a software engineer as a direct report if there's headcount.
approveCheckIn(SoftwareEngineer e) checks if the manager can approves a software engineer's check-in.
requestBonus(Employee e, double bonus) checks if the bonus can be approved by the BusinessLead.
getTeamStatus() returns a string representation of the manager and their direct reports.
subclass of TechnicalEmployee


7.BusinessLead has a default headcount of 10.
hasHeadCount() Should return true if the number of direct reports this 
manager has is less than their headcount
addReport(Accountant e, TechnicalLead supportTeam) adds an accountant as a direct report and updates the budget and team they support.
requestBonus(Employee e, double bonus) checks if the bonus can be afforded by the business lead's budget.
approveBonus(Employee e, double bonus) consults accountants to see if the bonus can be afforded and rewards it if possible.
subclassof  BusinessEmployee

The CompanyStructure class contains the main method for testing.
