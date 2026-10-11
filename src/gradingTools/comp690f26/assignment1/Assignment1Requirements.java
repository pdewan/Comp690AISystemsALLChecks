package gradingTools.comp690f26.assignment1;
import grader.junit.AJUnitProjectRequirements;


public class Assignment1Requirements extends AJUnitProjectRequirements {
	
	public Assignment1Requirements() {

		addDueDate("10/02/2026 01:00:00", 1.05);
		addDueDate("10/07/2026 01:00:00", 1.0);

		addJUnitTestSuite(F26Assignment1Suite.class);	


	}
}
