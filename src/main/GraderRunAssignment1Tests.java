package main;
import gradingTools.comp690f26.assignment1.*;
public class GraderRunAssignment1Tests {
//	 static final int TRACES=8000;
	static String broken_drectory_root = "broken_filtered/";
	static String correct_directory = "correct_filtered";
	static String directory = correct_directory;
	
//	static String directory = broken_drectory_root + "remove_event_request_sent" ;
//	static String directory = broken_drectory_root + 
//			"wrong_field_complete_response_callback_invoked_callbackargument" ;


//[wrong_field_complete_response_callback_invoked_callbackargument](D:/dewan_backup/Java/EduCopilot/broken_filtered/wrong_field_complete_response_callback_invoked_callbackargument)
	public static void main(String[] args) {
//		Tracer.setMaxTraces(TRACES);
//		F26Assignment1Suite.setTraceDirectory(directory);
		F26Assignment1Suite.main(args);

	}

}