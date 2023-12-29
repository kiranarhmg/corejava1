class Company
{
	String name="tcs";
	long gstNo=12435l;
	String location="banglore";
	Job job;
	Company(Job job)
	{
		this.job=job;
	}
	void showInfo()
	{
				System.out.println("company name: "+name);
				System.out.println("company gstNo: "+gstNo);
				System.out.println("company location: "+location);
				System.out.println("job roll: "+job.roll);
				System.out.println("job salary : "+job.salary);
				System.out.println("job type : "+job.type+"\n");
	}
}
				





	