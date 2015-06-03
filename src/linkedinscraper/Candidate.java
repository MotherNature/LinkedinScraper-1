package linkedinscraper;
/*
 * Object for candidates that are stored in a linkedlist and added to
 * the excel file
 * 
 * created by Weston Jackson
 */
public class Candidate {
	String name;     //name of the candidate
	String url;      //linkedin url
	String job;      //job of the candidate
	public Candidate(String a, String b, String c)
	{
		name = a;
		url = b;
		job = c;
	}
	
	public Candidate() {
		
	}

	public void setName(String x){name = x;}
	public void setUrl(String x){url = x;}
	public void setJob(String x){job = x;}
	
	public String getName(){return name;}
	public String getUrl(){return url;}
	public String getJob(){return job;}
}
