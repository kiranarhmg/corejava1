class Project
{
	void validate(Person5 person)
	{
		if(person!=null)
		{
			
			
			if(person instanceof Developer)
			{
			   Developer developer=(Developer)person;
			   developer.eat();
			   developer.sleep();
			   developer.code();
			}
			
			if(person instanceof Tester)
			{
			   Tester tester=(Tester)person;
			   tester.qualityCheck();
			   tester.code();
			   tester.eat();
			}
			
			if(person instanceof BusinessAnalyst)
			{
			   BusinessAnalyst business=(BusinessAnalyst)person;
                business.checkRequirement();
				business.eat();
				business.sleep();
			}
			if(person instanceof ProductOwner)
			{
			  ProductOwner owner=(ProductOwner)person;
			  owner.validate();
				owner.eat();
				owner.sleep();
			}
			
			if(person instanceof DataBaseDeveloper)
			{
			   DataBaseDeveloper dataBase=(DataBaseDeveloper)person;
			  dataBase.runScripts();
			  dataBase.code();
			  dataBase.eat();
			  dataBase.sleep();
			}
			if(person instanceof Devops)
			{
				Devops devops=(Devops)person;
				devops.runBuild();
				devops.eat();
				devops.sleep();
			}
		}
	}
}