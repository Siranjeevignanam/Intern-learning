package records;

public record emp(String name,int yoj,int sal,String role )
{
	public emp
	{
	if(yoj==2025)
		throw new IllegalArgumentException("The person is not an employee,but intern");
	}
	
	
	public String empdet()
	{
		if(role=="HR")
			return "Details are confidential";
		else
		return this.toString();
	}
}