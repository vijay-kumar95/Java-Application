package date;
public class ClientDate
{
	private String interview_date;
	private String written_date;
	private String joining_date;
	public void candidateDetails()
	{
		interview_date="12-09-2018";
		written_date="13-09-2018";
		joining_date="14-09-2018";
		System.out.println("Dear Candidate note down your schedule dates: ");
	    System.out.println("written_date: "+ written_date);
		System.out.println("interview_date: "+interview_date);
		System.out.println("joining_date: "+joining_date);

	}
}