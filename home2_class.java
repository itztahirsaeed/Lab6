package lab6;

public class home2_class {
	 private static int c_Obj;
	    private static int d_Obj;
	    
	    home2_class(){
	        c_Obj++;
	    }
	    
	    public static int getcObj(){
	        return c_Obj;
	    }
	    
	    public static void delete(home2_class o){
	        o = null;
	        c_Obj--;
	        d_Obj++;
	    }
	    
	    public static int getdObj(){
	        return d_Obj;
	    }
}
