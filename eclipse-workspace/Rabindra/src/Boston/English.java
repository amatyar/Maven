package Boston;

public class English {

	public static void main(String[] args) {
		Subject sub = new Subject();
		sub.subj(4, 5, 6);
		sub.subj(2.22, 3.33, 4.44);


	}

}
 
class Subject {

public void subj (int Nep, int Eng, int Sci) {
	System.out.println(Nep+ Eng+Sci);
}
public void subj (Double mk1,Double mk2, Double mk3 ) {
	System.out.println(mk1+mk2+mk3);
}
}