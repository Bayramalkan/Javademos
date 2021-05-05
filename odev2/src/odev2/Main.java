package odev2;

public class Main {

	public static void main(String[] args) {
		
		Appointment randevu1 = new Appointment(1,"Bayram","ALKAN","Halsizlik");
		
		Appointment randevu2 = new Appointment();
		randevu2.id = 2;
		randevu2.name = "Mehmet";
		randevu2.lastName = "ALKAN";
		randevu2.complaint = "Baþ aðrýsý";
		
		Appointment randevu3 = new Appointment();
		randevu3.id = 3;
		randevu3.name = "Erkan";
		randevu3.lastName = "ALKAN";
		randevu3.complaint = "Vücut aðrýlarý";
		
		
		Appointment[] randevular = {randevu1,randevu2,randevu3};
		
		for(Appointment randevu : randevular) {
			System.out.println(randevu.id+" "+randevu.name+" "+randevu.lastName+" "+randevu.complaint);
		}
		/*
		System.out.println(randevu1.complaint);
		System.out.println(randevu2.complaint);
		*/
		
		Clinic clinic1 = new Clinic("KBB","09:00-17:00");
		Clinic clinic2 = new Clinic("Dahiliye","09:00-17:00");
		Clinic clinic3 = new Clinic("Kardiyoloji","09:00-17:00");
		Clinic clinic4 = new Clinic("Nöroloji","09:00-17:00");
		
		//System.out.println(clinic.clinicName);
		
		Clinic[] clinics = {clinic1,clinic2,clinic3,clinic4};
		
		for(Clinic clinic : clinics) {
			System.out.println(clinic.clinicName+" Çalýþma saatleri: "+clinic.timeInterval);
		}
		
		AppointmentManager appointmentManager = new AppointmentManager();
		appointmentManager.takeAppointment(clinic1);
		appointmentManager.cancelAppointment(clinic2);
		
		
	}

}
