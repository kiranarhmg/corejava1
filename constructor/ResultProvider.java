class ResultProvider
{
	public static void main(String[] any)
	{
		Free free=new Free("javacourse","csr","no");
		free.display();
		Free free1=new Free("pythoncourse","csr","yes");
		free1.display();
		Free free12=new Free("cybersecurity course","csr","yes");
		free12.display();
		Free free2=new Free("cryptography","non csr","no");
		free2.display();
		Free free3=new Free("data sceince","csr","yes");
		free3.display();
		Free free4=new Free("cloud","no csr","no");
		free4.display();
		Free free5=new Free("web","csr","yes");
		free5.display();
		Free free6=new Free("db","csr","yes");
		free6.display();
		Free free8=new Free("hacking"," non csr","no");
		free8.display();
		Free free7=new Free("blackchain","non csr","no");
		free7.display();
		Free free9=new Free("devops","non csr","no");
		free9.display();
		Free free10=new Free("no sql","csr","yes");
		free10.display();
		System.out.println("\n");
		
		Month month=new Month("january",30,4,3);
		month.display();
		Month month1=new Month("feb",28,3,4);
		month1.display();
		Month month2=new Month("march",31,4,2);
		month2.display();
		Month month3=new Month("april",30,5,6);
		month3.display();
		Month month4=new Month("may",31,4,4);
		month4.display();
		Month month5=new Month("june",30,4,3);
		month5.display();
		Month month6=new Month("july",31,5,2);
		month6.display();
		Month month7=new Month("august",30,4,3);
		month7.display();
		Month month8=new Month("sep",31,4,2);
		month8.display();
		Month month9=new Month("oct",30,5,4);
		month9.display();
		Month month10=new Month("nov",31,4,3);
		month10.display();
		Month month11=new Month("dec",30,3,2);
		month11.display();
		
		System.out.println("\n");
		
		Course course=new Course("java",24000,"xworkz","offline",5,2,30);
		course.display();
		Course course1=new Course("pythoncourse",22000,"xworkz","offline",5,2,30);
		course1.display();
		Course course2=new Course("cryptography",30000,"xworkz","online",6,2,20);
		course2.display();
		Course course3=new Course("cybersecurity",30000,"xworkz","online",5,2,10);
		course3.display();
		Course course4=new Course("data sceince",25000,"xworkz","offline",5,2,15);
		course4.display();
		Course course5=new Course("blackchain",20000,"xworkz","offline",5,2,10);
		course5.display();
		Course course6=new Course("devops",21000,"xworkz","offline",6,2,20);
		course6.display();
		Course course7=new Course("web",20000,"xworkz","offline",5,2,30);
		course7.display();
		Course course8=new Course("nosql",20000,"xworkz","offline",4,2,10);
		course8.display();
		Course course9=new Course("hacking",40000,"xworkz","offline",5,2,12);
		course9.display();
		Course course10=new Course("db",20000,"xworkz","offline",5,2,30);
		course10.display();
		Course course11=new Course("cloud",35000,"xworkz","offline",5,2,10);
		course11.display();
		System.out.println("\n");
		
		Placement placement=new Placement("kumar","infosys","offline","january",12,"dvg",4.5,20,70,4,150,15);
		placement.display();
		Placement placement1=new Placement("ramesh","infosys","online","january",15,"dvg",4.5,25,70,4,200,10);
		placement1.display();
		Placement placement2=new Placement("raghu","wipro","offline","january",12,"dvg",4.2,20,70,4,150,15);
		placement2.display();
		Placement placement4=new Placement("pavan","infosys","offline","frb",30,"bangalore",5,20,70,4,150,15);
		placement4.display();
		Placement placement3=new Placement("vijay","ibm","offline","april",29,"dvg",4.5,20,70,4,150,15);
		placement3.display();
		Placement placement5=new Placement("sanjay","infotech","offline","march",12,"mysore",4.5,20,70,4,150,15);
		placement5.display();
		Placement placement6=new Placement("uday","tcs","offline","dec",12,"blr",4.5,20,70,4,150,15);
		placement6.display();
		Placement placement7=new Placement("kiran","accenture","offline","april",12,"dvg",4.5,20,70,4,150,15);
		placement7.display();
	  Placement placement8=new Placement("brunda","infosys","offline","january",22,"dvg",4.5,20,70,4,150,15);
		placement8.display();
	   Placement placement9=new Placement("karan","ibm","online","january",12,"dvg",4.5,20,70,4,150,15);
		placement9.display();
		Placement placement10=new Placement("kavya","infosys","online","january",12,"dvg",4.5,20,70,4,150,15);
		placement10.display();
		Placement placement11=new Placement("kumar","infosys","offline","january",12,"dvg",4.5,20,70,4,150,15);
		placement11.display();
		System.out.println("\n");
		
		Technology technology=new Technology("kiran","java","xworkz","offline","good",12,30000,30,6,3,1,true);
		technology.display();
	    Technology technology1=new Technology("kumar","python","xworkz","offline","good",12,30000,30,6,3,1,true);
		technology1.display();
		Technology technology2=new Technology("pavan","cybersecurity","xworkz","onlineline","good",12,30000,30,6,3,1,true);
		technology2.display();
		Technology technology3=new Technology("raghu","web","xworkz","offline","good",12,30000,30,6,3,1,true);
		technology3.display();
		Technology technology4=new Technology("ramesh","java","xworkz","offline","good",12,30000,30,6,3,1,true);
		technology4.display();
		Technology technology5=new Technology("manoj","cryptography","xworkz","offline","good",12,30000,10,6,3,1,true);
		technology5.display();
		Technology technology6=new Technology("lingu","java","xworkz","offline","good",12,30000,30,6,3,1,true);
		technology6.display();
		Technology technology7=new Technology("praveen","python","xworkz","offline","good",12,30000,30,6,3,1,true);
		technology7.display();
		Technology technology8=new Technology("shivu","data sceince","xworkz","offline","good",12,30000,30,6,3,1,true);
		technology8.display();
		Technology technology9=new Technology("sagar","java","xworkz","offline","good",12,30000,30,6,3,1,true);
		technology9.display();
		Technology technology10=new Technology("ajay","blackchain","xworkz","offline","good",12,30000,30,6,3,1,true);
		technology10.display();
		Technology technology11=new Technology("pradeep","java","xworkz","offline","good",12,30000,30,6,3,1,true);
		technology11.display();
	
		
	
	
	
	
	
	
	
	
	
	
	}
}
	
	
	