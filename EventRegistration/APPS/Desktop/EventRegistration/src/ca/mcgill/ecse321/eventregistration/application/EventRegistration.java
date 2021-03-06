package ca.mcgill.ecse321.eventregistration.application;

import ca.mcgill.ecse321.eventregistration.model.RegistrationManager;
import ca.mcgill.ecse321.eventregistration.persistence.PersistenceXStream;
import ca.mcgill.ecse321.eventregistration.view.EventRegistrationPage;
import ca.mcgill.ecse321.eventregistration.view.ParticipantPage;

public class EventRegistration {
	private static String fileName = "output/eventregistration.xml";

	public static void main(String[] args) {
	    final RegistrationManager rm = PersistenceXStream.initializeModelManager(fileName);

	    // start UI
	    java.awt.EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            new EventRegistrationPage(rm).setVisible(true);
	        }
	    });

	}
}
