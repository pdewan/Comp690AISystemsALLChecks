package gradingTools.comp690f26.assignment1;
import grader.junit.AJUnitProjectRequirements;


public class Assignment1Requirements extends AJUnitProjectRequirements {
	
	public Assignment1Requirements() {

		addDueDate("10/01/2026 01:00:00", 1.05);
		addDueDate("10/06/2026 01:00:00", 1.0);

		addJUnitTestSuite(F26Assignment1Suite.class);	


	}
}
