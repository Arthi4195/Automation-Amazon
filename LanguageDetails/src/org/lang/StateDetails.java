package org.lang;

public class StateDetails {
	public void northIndia() {
		System.out.println("northIndia");
	}
public void southIndia() {
	System.out.println("southIndia");
}
	public static void main(String[] args) {
		StateDetails a = new StateDetails();
		LanguageInfo e = new LanguageInfo(); 
		a.northIndia();
		a.southIndia();
		e.tamilLanguage();
		e.hndiLanguage();
		e.englishLanguage();

		
	}

}
