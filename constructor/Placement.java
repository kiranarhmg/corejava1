class Placement
{
	String officer;
	String interViewMode;
	int noOfRounds;
	int noOfStuSelected;
	String interViewMonth;
	int interViewDate;
	int noOfstuAttended;
	String company;
	double packageofJob;
	int avgPercentage;
	String address;
	int noOfVacancy;
	
	
	
	
    Placement(String officer,String company,String interViewMode,String interViewMonth,int interViewDate,String address,double packageofJob,int noOfVacancy,int avgPercentage,int noOfRounds,int noOfstuAttended,int noOfStuSelected)
	{
		this.officer=officer;
		this.company=company;
		this.interViewMode=interViewMode;
		this.interViewDate=interViewDate;
		this.interViewMonth=interViewMonth;
		this.noOfRounds=noOfRounds;
		this.noOfstuAttended=noOfstuAttended;
		this.noOfVacancy=noOfVacancy;
		this.address=address;
		this.packageofJob=packageofJob;
		this.avgPercentage=avgPercentage;
		this.noOfStuSelected=noOfStuSelected;
		
	}
	
	void display()
	{
		System.out.println("placement officer: "+officer);
		System.out.println("placement company: "+company);
		System.out.println("placement interViewMode: "+interViewMode);
       	System.out.println("placement interViewMonth: "+interViewMonth);
		System.out.println("placement interViewDate: "+interViewDate);
		System.out.println("placement address: "+address);
		System.out.println("placement packageofJob: "+packageofJob);
       	System.out.println("placement noOfVacancy: "+noOfVacancy);
		System.out.println("placement avgPercentage: "+avgPercentage);
		System.out.println("placement noOfRounds: "+noOfRounds);

      System.out.println("placement noOfstuAttended: "+noOfstuAttended);
		System.out.println("placement noOfStuSelected: "+noOfStuSelected);





					

	}
}