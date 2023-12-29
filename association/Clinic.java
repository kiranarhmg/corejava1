class Clinic
{
	String specialization;
	int totalBeds;
	int totalPatients;
	Doctor doctor;
	Clinic(	Doctor doctor)
	{
		this.doctor=doctor;
	}
	void showInfo()
	{
		System.out.println("doctor name: "+doctor.name);
		System.out.println("doctor experience: "+doctor.exp);
		System.out.println("doctor fake or not: "+doctor.fake);
		System.out.println("doctor fees: "+doctor.fees);
		System.out.println("clinic specialization: "+specialization);
		System.out.println("clinic totalBeds: "+totalBeds);
			System.out.println("clinic totalPatients: "+totalPatients);
	}
}

	



		

