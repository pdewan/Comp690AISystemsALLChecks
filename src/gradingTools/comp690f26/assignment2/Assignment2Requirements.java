package gradingTools.comp690f26.assignment2;
import grader.junit.AJUnitProjectRequirements;


public class Assignment2Requirements extends AJUnitProjectRequirements {
	
	public Assignment2Requirements() {

		addDueDate("11/06/2026 01:00:00", 1.05);
		addDueDate("11/01/2026 01:00:00", 1.0);

		addJUnitTestSuite(F26Assignment2Suite.class);	


	}
}
