class GroupResult
{
	public static void main(String[] any)
	{
				System.out.println("starting of main method");
				Speaker speaker=new Speaker(100);
				Tv1 tv=new Tv1(speaker,"sony oled");
				tv.showInfo();
				
				MenuCard menuCard=new MenuCard();
				menuCard.setDetails(10,200);
				Hotel hotel=new Hotel();
				hotel.setDetails("aradya","kumar",menuCard);
				hotel.showInfo();
				
				Job job=new Job();
				Company company=new Company(job);
				company.showInfo();
				
				Doctor doctor=new Doctor();
				doctor.name="kumar";
				doctor.exp=5;
				doctor.fake=false;
				doctor.fees=500;
				
				Clinic clinic=new Clinic(doctor);
				clinic.specialization="heart";
				clinic.totalBeds=20;
				clinic.totalPatients=18;
				clinic.showInfo();
				
			System.out.println("ending of main method");

	}
}
				
