class Technology
{
	String nameOfTech;
	int noOfTechOfferd;
	double fees;
	int noOfStuTaken;
	int durationOfTech;
	String techProvider;
	String name;
	int noOfTechFrontEnd;
	int noOfTechBackEnd;
	boolean techQuality;
	String techLearningMode;
	String reviewOfTech;
	
	
    Technology(String name,String nameOfTech,String techProvider,String techLearningMode,String reviewOfTech,int noOfTechOfferd,double fees,int noOfStuTaken,int durationOfTech,int noOfTechBackEnd,int noOfTechFrontEnd,boolean techQuality)
	{
		this.name=name;
		this.nameOfTech=nameOfTech;
		this.techProvider=techProvider;
		this.techLearningMode=techLearningMode;
		this.reviewOfTech=reviewOfTech;
		this.noOfTechOfferd=noOfTechOfferd;
		this.fees=fees;
		this.noOfTechBackEnd=noOfTechBackEnd;
		this.noOfTechFrontEnd=noOfTechFrontEnd;
		this.techQuality=techQuality;
		this.noOfStuTaken=noOfStuTaken;
		this.durationOfTech=durationOfTech;
		
	}
	
	void display()
	{
		System.out.println("technology name: "+name);
		System.out.println("technology nameOfTech: "+nameOfTech);
		System.out.println("technology techProvider: "+techProvider);
       	System.out.println("technology techLearningMode: "+techLearningMode);
		System.out.println("technology reviewOfTech: "+reviewOfTech);
		System.out.println("technology fees: "+fees);
		System.out.println("technology noOfTechOfferd: "+noOfTechOfferd);
       	System.out.println("technology noOfTechBackEnd: "+noOfTechBackEnd);
		System.out.println("technology noOfTechFrontEnd: "+noOfTechFrontEnd);
		System.out.println("technology techQuality: "+techQuality);

      System.out.println("technology durationOfTech: "+durationOfTech);
		System.out.println("technology noOfStuTaken: "+noOfStuTaken);





					

	}
}