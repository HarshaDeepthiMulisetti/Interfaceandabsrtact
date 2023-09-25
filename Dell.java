package intabstract;

public abstract    class Dell implements Laptop{
	public void copy() {
		System.out.println("Lenovo copy code"); //non abstract
		                                           //abstract class can provide implntation of interface 
	}
	public void cut() {
		System.out.println("Lenovo cut code");
	}
	 public abstract void paste();            //abstract
	 public abstract void keyboard();
}
