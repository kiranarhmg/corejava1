class Camera
{
	String brand;
	float pixel;
	float batteryDuration;
	CameraColor color;
	
	Camera()
	{
		System.out.println("no-arg const of camera");
	}
	
	Camera(String brand,float pixel,float batteryDuration,CameraColor color)
	{
		this.brand=brand;
		this.pixel=pixel;
		this.batteryDuration=batteryDuration;
		this.color=color;
		System.out.println("const of String,float,float,CameraColor in camera");

	}
	
}
	