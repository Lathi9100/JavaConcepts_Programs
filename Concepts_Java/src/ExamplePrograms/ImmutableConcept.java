package ExamplePrograms;

final class ImmutableConcept {

	final String name;
	final int rollNo;
	
	public ImmutableConcept(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public String getName() {
		return name;
	}
	public int getrollNo() {
		return rollNo;
	}
	
	public static void main(String[] args) {
		
		ImmutableConcept obj = new ImmutableConcept("Hello",101);
		System.out.println(obj.name);
		System.out.println(obj.rollNo);
	}
}
