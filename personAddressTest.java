public class personAddressTest {
	//Main method…
	public static void main(String [] args) {
		//create 3 objects
		personAddress mashkur = new personAddress();
		personAddress akbar = new personAddress();
		personAddress rafik = new personAddress();
		//set information for the objects
		mashkur.setFirstname("Mashkur");
		mashkur.setLastname("Billah");
		mashkur.setTel("0191-02394");
		mashkur.setEmail("mash@gmail.com");
		
		akbar.setFirstname("Akbar");
		akbar.setLastname("Shah");
		akbar.setTel("0011-30319");
		akbar.setEmail("akbar@gmail.com");
		
		rafik.setFirstname("Rafik");
		rafik.setLastname("Hossain");
		rafik.setTel("0111-10112");
		rafik.setEmail("rafik22@gmail.com");
		//display information
		System.out.println("Akbar's full name is " +akbar.getFirstname() +" " +akbar.getLastname());
		System.out.println("Mashkur's telephone number is " +mashkur.getTel());
		System.out.println("Rafik's email address is " +rafik.getEmail());
		//display telephone number after changing
		mashkur.setTel("0111-11111");
		System.out.println("Mashkur's telephone number is now " +mashkur.getTel());
		//display email address after changing
		rafik.setEmail("raf0011@yahoo.com");
		System.out.println("Rafik's email address is now " +rafik.getEmail());
		
		//create another object called mashkur2
		personAddress mashkur2 = new personAddress();
		mashkur2.setFirstname("Mashkur");
		mashkur2.setLastname("Hossain");
		
		//Test whether two instances are equal based solely on name
		System.out.println("Is Mashkur equals Mashkur2??? " +mashkur.equals(mashkur2));
		
	}
	
}
