package basic;

public class AbstractDemo1 extends AbstractDemo {
	
	public void name() {
		System.out.println("Vani");
	}
	
	public void age() {
		System.out.println(34);
	}
	public static void main(String[] args) {
		AbstractDemo1 ad= new AbstractDemo1();
		
	ad.name();
	ad.age();
	}
}

	
	


