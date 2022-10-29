package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFactory sf=new SymptomFactory();
		Observable	pacient=new	Covid19Pacient("aitor",	35, sf);
		new	PacientObserverGUI	(pacient);
		new	PacientSymptomGUI	((Covid19Pacient) pacient);
	}


}
