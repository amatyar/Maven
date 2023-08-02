package Boston;

public class newTset2 {
	
		String name;
		char type;
		public newTset2() {
			
		}
		public newTset2(String nm)
		{
			this.name= nm;
		}
		public newTset2(String nm, char ty) {
			this.name= nm;
			this.type = ty;
		}
		public void DisplayType()
		{
			System.out.println(this.type);
		}
	
}
