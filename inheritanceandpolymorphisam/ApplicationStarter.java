class ApplicationStarter
{
	public static void main(String[] any)
	{
		Application app=new Application(1,"java",1.8f,"james gosling","1991",AppType.DESKTOP);
		app.run();
		System.out.println("=========================================================================");
		
		StandAloneApplication stand=new StandAloneApplication(4,"windows",OsType.UNIX,1,"java",1.8f,"james gosling","1991",AppType.DESKTOP);
		stand.consumerMemory();
		stand.consumeInternet();
		stand.show();
		stand.displayInfo();
		System.out.println("=========================================================================");
		
		String[] value={"chrome","firefox","edge","mozilla"};
      WebApplication web=new WebApplication(value,true,1,"java",1.8f,"james gosling","1991",AppType.DESKTOP);
	  web.showInfo();
      web.displayInfo();
	  
	  System.out.println("=========================================================================");
	  
	  String[] data={"movie","app","song"};
	  String[] history={"javapoint website","w3schools website","stack over flow website"};
	  

	  
	  Browser browser=new Browser(4,"windows",OsType.UNIX,1,"java",1.8f,"james gosling","1991",AppType.DESKTOP,data,history);
       browser.settings();
	   browser.displayHistory();
	   browser.showData();
	   
	   	  System.out.println("=========================================================================");
       String[] fav={"mp3","mp4"};
	   
	   MediaPlayer media=new MediaPlayer(4,"windows",OsType.UNIX,1,"java",1.8f,"james gosling","1991",AppType.DESKTOP,fav);
	   media.play();
	   media.delete();
	   media.download();
	   media.showDataInfo();
	   
	   	   	  System.out.println("=========================================================================");

	   ChromeBrowser chromeBrowser=new ChromeBrowser();
	   chromeBrowser.settings();
	   chromeBrowser.displayHistory();
	   chromeBrowser.consumerMemory();
	   chromeBrowser.consumeInternet();
	   	   	   	  System.out.println("=========================================================================");

	   EdgeBrowser edgeBrowser=new EdgeBrowser();
 edgeBrowser.settings();
	   edgeBrowser.displayHistory();
	   edgeBrowser.consumerMemory();
	   edgeBrowser.consumeInternet();
	   
	   System.out.println("=========================================================================");
	   FireFoxBrowser firefox=new FireFoxBrowser();
firefox.settings();
	   firefox.displayHistory();
	   firefox.consumerMemory();
	   firefox.consumeInternet();
	   

	   
	  
		
	}
}
