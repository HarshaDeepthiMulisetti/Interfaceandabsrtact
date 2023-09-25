package intabstract;
 
public  class Lenovo implements Laptop {               //java doesn't support extends multiple classes and abstract classes
	public void copy() {
		System.out.println("Lenovo copy code");
	}
	public void cut() {
		System.out.println("Lenovo cut code");
	}
	@Override
	public void paste() {
		System.out.println("Lenovo paste code");
		
	}
	@Override
	public void keyboard() {
		System.out.println("it is using keyboard");
		
	}
	 
}
