package intabstract;

public  abstract class Hp extends Dell {

	@Override                                    //class can extends abstract class 
	public void paste() {
		System.out.println("Hp paste the code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Hp using keyboard");
		
	}
	public void print() {                           //add Aditional code also
		System.out.println("Hp print the code");
	}

}
