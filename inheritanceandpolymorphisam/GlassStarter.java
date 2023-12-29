class GlassStarter
{
	public static void main(String[] any)
	{
		LaminatedGlass laminated=new LaminatedGlass();
		LaminatedGlass laminated1=new LaminatedGlass("borosil","spectacles",2.1f,1.8f,GlassType.CONCAVE,999d,2);
		System.out.println("brand: "+laminated1.brand);
		System.out.println("usage: "+laminated1.usage);
		System.out.println("length: "+laminated1.length);
		System.out.println("thickness: "+laminated1.thickness);
		System.out.println("type: "+laminated1.type);
		System.out.println("cost: "+laminated1.cost);
		System.out.println("warranty: "+laminated1.warranty);
		
		ToughendGlass toughend=new ToughendGlass();
		ToughendGlass toughend1=new ToughendGlass("borosil","spectacles",2.1f,1.8f,GlassType.CONCAVE,0.8f,"kiran");
		System.out.println("brand: "+toughend1.brand);
		System.out.println("usage: "+toughend1.usage);
		System.out.println("length: "+toughend1.length);
		System.out.println("thickness: "+toughend1.thickness);
		System.out.println("type: "+toughend1.type);
		System.out.println("weight: "+toughend1.weight);
		System.out.println("ownerName: "+toughend1.ownerName);
		
		TintedGlass tinted=new TintedGlass();
		TintedGlass tinted1=new TintedGlass("borosil","spectacles",2.1f,1.8f,GlassType.CONCAVE,0.8f,"kiran");
		System.out.println("brand: "+tinted1.brand);
		System.out.println("usage: "+tinted1.usage);
		System.out.println("length: "+tinted1.length);
		System.out.println("thickness: "+tinted1.thickness);
		System.out.println("type: "+tinted1.type);
		System.out.println("weight: "+tinted1.weight);
		System.out.println("ownerName: "+tinted1.ownerName);
		
		GorillaGlass gorilla=new GorillaGlass();
		GorillaGlass gorilla1=new GorillaGlass("borosil","spectacles",2.1f,1.8f,GlassType.CONCAVE,999d,2);
		System.out.println("brand: "+gorilla1.brand);
		System.out.println("usage: "+gorilla1.usage);
		System.out.println("length: "+gorilla1.length);
		System.out.println("thickness: "+gorilla1.thickness);
		System.out.println("type: "+gorilla1.type);
		System.out.println("cost: "+gorilla1.cost);
		System.out.println("warranty: "+gorilla1.warranty);
		
		
	}
}





		
	