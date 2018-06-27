public class TestCode
{
	public static void main(String[] args) {
		System.out.println("In Test!");
	}
	
	public void testMethod(){
		boolean b = false;
		if(b == true){
			System.out.println("bad ");
		} 
		
		if(b) {
			System.out.println("good");
			System.out.println("Error: using a hardcoded string");
		}
	}
}