class GroupStarter
{
 public static void main(String[] any)
 {
	 System.out.println("starting of main metohd\n");
	   Printer printer=new Printer();
	   Printer printer1=new Printer("hp");
	   Printer printer2=new Printer("hp",2020);
	   Printer printer3=new Printer("hp",1221,2020);
       Printer printer4=new Printer("hp",1221,2020,8000);
	   		System.out.println("\n");
	   Helmet helmet=new Helmet();
	   Helmet helmet1=new Helmet("vega");
	   Helmet helmet2=new Helmet("vega",true);
	   Helmet helmet3=new Helmet("vega",true,400.0f);
       Helmet helmet4=new Helmet("vega",true,400.0f,"full",800);	
System.out.println("\n");
       KeyChain keyChain=new KeyChain();
	   KeyChain keyChain1=new KeyChain("india");
	   KeyChain keyChain2=new KeyChain("india",5);
	   KeyChain keyChain3=new KeyChain("india",5,3);
       KeyChain keyChain4=new KeyChain("india",5,3,"glass",400);	
System.out.println("\n");
       Bracelet bracelet=new Bracelet();
	   Bracelet bracelet1=new Bracelet("coffee");
	   Bracelet bracelet2=new Bracelet("coffee","classy");
	   Bracelet bracelet3=new Bracelet("coffee","classy",20.0f);
       Bracelet bracelet4=new Bracelet("coffee","classy",20.0f,"leather",200);	
System.out.println("\n");
       Carrom carrom=new Carrom();
	   Carrom carrom1=new Carrom("red");
	   Carrom carrom2=new Carrom("red",19);
	   Carrom carrom3=new Carrom("red",19,8);
       Carrom carrom4=new Carrom("red",19,8,8,5.5f);	
	   
	   System.out.println("ending of main metohd\n");
	 
 }
}
	 