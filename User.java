package inheritance;

public class User {
      public static void main(String[] args) {
		Guestuser Guest =new Guestuser();
		Developer Dev = new Developer();
		Admin Adm = new Admin();
		Guest.Read();
		Dev.Read();
		Dev.Write();
		Adm.Read();
		Adm.Write();
		Adm.Manage();
		
	}
}
