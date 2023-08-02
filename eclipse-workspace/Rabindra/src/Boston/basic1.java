package Boston;

public class basic1 {

	public static void main(String[] args) {
		// Comparison operator
		// < , >, <=, >=, !=, == answer will be true/ false (boolean)
		System.out.println(5 < 4);
		
		//logical operator
		// AND   &&
		/*
		 * true && true = true
		 * false && true = false
		 * false && false = false
		 * true && false = false
		 */
		System.out.println(7==7 && 6==9);
		// OR   ||
		/*
		 * true || true  = true
		 * true || false = true
		 * false || true= true
		 * false || false = false
		 */
		System.out.println(7==8 || 9 == 9);
		
		// NOT   !
		/*
		 *  !true = false
		 *  !false = true
		 */
		System.out.println(!(9==7));
		
	}

}
