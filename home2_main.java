package lab6;

public class home2_main {
	public static void main(String args[]) {
        home2_class o1 = new home2_class();
        home2_class o2 = new home2_class();
        home2_class o3 = new home2_class();

        System.out.println("Number of Objects Created: " + home2_class.getcObj());
        home2_class.delete(o3);
        System.out.println("Number of Objects Deleted: " + home2_class.getdObj());
        System.out.println("Number of Objects present: " + home2_class.getcObj());
    }
}
