package inheritance;

public class Admin extends Developer {
    public static void Manage() {
    	
    	Read();
    	Write();
    	System.out.println("Manage Method");
    }
    
   public static void Read() {
	 
	   System.out.println("Updated Read Method");
   }
   

   public void Read1() {
	 
	   System.out.println("Updated Read Method");
   }
}
