 interface b {
public void show();
}

abstract  class a implements b{
	 public abstract void display();
	 public abstract void show();
}
 
 class d extends a
 {
	 public void display (){
		 System.out.println("display");
	 }
	 
	 public void show (){
		 System.out.println("show");
	 }
 }
 
 public class ctest
 {
	 public static void main(String args[])
	 {
		 
	 }
 }
