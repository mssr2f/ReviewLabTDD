

public class Publisher {
	 private String name;
	 private String address;
	
	public Publisher(String name, String address)
	{		
		this.address= address;
		this.setName(name);
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


}
