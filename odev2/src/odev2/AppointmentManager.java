package odev2;

public class AppointmentManager {

	public void takeAppointment(Clinic clinic) {
		System.out.println(clinic.clinicName+" randevunuz al�nm��t�r.");
	}
	public void cancelAppointment(Clinic clinic) {
		System.out.println(clinic.clinicName+" randevunuz iptal edilmi�tir.");
	}
}
