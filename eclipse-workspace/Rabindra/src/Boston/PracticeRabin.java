package Boston;

public class PracticeRabin {

	public static void main(String[] args) {
	
		 // call constructor with no parameter
	    manny obj1 = new manny();
	    obj1.language="English";
	    System.out.println("Nepali");

	    // call constructor with a single parameter
	   manny obj2 = new manny("Python");
	   System.out.println(obj2.language);

	    obj1.getName();
	    obj2.getName();
	}

}

class manny {

	  String language;

	  // constructor with no parameter
	  public manny() {
	    this.language="Java";
	  }

	  // constructor with a single parameter
	 public manny (String language) {
	    this.language = language;
	  }

	  public void getName() {
	    System.out.println("Programming Langauage: " + this.language);
	  }

}