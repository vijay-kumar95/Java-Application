package contact;
import date.*;
public class CandidateInformation
{    
	private static String candidate_name;
	private static String college_name;
	private static String state_name;
	private static String university_name;
	public static void main(String[] args)
	{   
       ClientDate cd=new ClientDate();
       candidate_name="ravi kumar";
       college_name="TIT bhopal";
       state_name="Madhya pardesh";
       university_name="RGPV bhopal";
       System.out.println("candidate_name: "+candidate_name);
       System.out.println("college_name: "+college_name);
       System.out.println("state_name: "+state_name);
       System.out.println("university_name: "+university_name);
       cd.candidateDetails();
	}
}
