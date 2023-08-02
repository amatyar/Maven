package Boston;

/**
 * @author Rabindra Amatya
 *
 *AND &&
 *OR  ||
 *NOT  !
 */
public class Logical {
	
	public static void log() {
		
	
	/*
	 * For AND && operator
	 * true && true    ==> true
	 * true && false   ==> false
	 * false && false  ==> false
	 * false && true   ==> false
	 */
		System.out.println(5 == 5 && 8 == 8);
		System.out.println(5 == 5 && 8 == 6);
		System.out.println(5 == 7 && 8 == 5);
		System.out.println(5 == 7 && 8 == 8);

		System.out.println("************OR******************");
	/*
	 * For OR  || operator
	 * true || true    ==> true
	 * true || false   ==> true
	 * false || false  ==> false
	 * false || true   ==> true
	 */
	
		System.out.println(5 == 5 && 8 == 8);
		System.out.println(5 == 5 && 8 == 5);
		System.out.println(5 == 7 && 8 == 18);
		System.out.println(5 == 7 && 8 == 8);
		System.out.println("**************NOT****************");
	/*
	 * For NOT  ! operator
	
	 * true     ==> false
	 
	 * false    ==> true
	 */
		
		System.out.println (!(5 == 7 ));
		System.out.println (!(7 == 7 ));
		 
		System.out.println("*************End*****************");
		}
}
