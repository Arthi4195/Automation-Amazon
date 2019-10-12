package assginment.com;

public class Marks extends Marks2 {
	 
public void tamilMark() {
System.out.println("Tamil Mark is "+60);


}

public void englishMark() {
System.out.println("English mark is" +70);
}

@Override
	public void telugu() {
		// TODO Auto-generated method 
		super.telugu();
	}

@Override
	public void hindi() {
		// TODO Auto-generated method stub
		super.hindi();
	}

	
	public static void main(String[] args) {
		Marks m = new Marks();
		m.tamilMark();
		m.englishMark();
		m.telugu();
		m.hindi();
	
		

	}

}
