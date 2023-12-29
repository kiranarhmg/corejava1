class PersonStarter
{
	public static void main(String... any)
	{
				System.out.println("starting of main methode");

		Developer developer=new Developer();
		Tester tester=new Tester();
		BusinessAnalyst business=new BusinessAnalyst();
		ProductOwner owner=new ProductOwner();
		DataBaseDeveloper dataBase=new DataBaseDeveloper();
		Devops devops=new Devops();
		
		Project project=new Project();
		project.validate(tester);
		project.validate(business);
		project.validate(owner);
		project.validate(dataBase);
		project.validate(devops);
				System.out.println("ending of main methode");


	}
}