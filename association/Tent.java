class Tent
{
enum Color{RED,WHITE,GREEN}
int slNO;
int width;
int height;
Color[] color=Color.values();
Tent(int slNO,int width,int height)
{
	this.slNO=slNO;
	this.width=width;
	this.height=height;
}
boolean open()
{
	System.out.println("open method in tent");
	return false;
}
boolean close()
{
	System.out.println("close method in tent");
	return false;
}
void showInfo()
{
	System.out.println("tent slNO"+slNO);
		System.out.println("tent width"+width);
	System.out.println("tent height"+height);
}
}


	

