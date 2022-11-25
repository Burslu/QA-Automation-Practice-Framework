package patika_pratik_kosulkodblockları.Tasks.forloop.ForLoopTasks.patika_pratik.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		Scanner sc = new Scanner(System.in);
		System.out.println("bir saat degeri giriniz");
		double saatiDondurenProgram = sc.nextDouble();
		System.out.println("bir km degeri giriniz");
		double kmDondurenProgram = sc.nextDouble();
		System.out.println(saniyeDon(saatiDondurenProgram)+"saniye");
		System.out.println(kmDon(saatiDondurenProgram)+"km");

	}
	public static double saniyeDon(double saati){

		return saati*3600;
	}

	public static double kmDon(double km){
		return km*1.61;
	}





	
	
	
	
	
	
	
	


}
