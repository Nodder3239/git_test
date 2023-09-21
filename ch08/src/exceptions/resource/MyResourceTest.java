package exceptions.resource;

public class MyResourceTest {
	public static void main(String[] args) throws Exception {
	
		MyResource res1 = new MyResource("rest1");
	
		//System.out.println(res1.read1());
		//System.out.println(res1.read2());
		
		System.out.println(Integer.parseInt(res1.read1()));
		System.out.println(Integer.parseInt(res1.read2()));

		
		
		res1.close();
		
	}
}
