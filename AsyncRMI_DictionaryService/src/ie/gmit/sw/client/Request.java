package ie.gmit.sw.client;

/*
 * Bean class for request 
 * 
 * Did not get the queue working
 */

public class Request {
	//Variables 
	private int jobId = 0;
	private String query = "";
	
//=========== Constructor ==================================
	public Request(int jobId, String query) {
		
		this.jobId = jobId;
		this.query = query;
	}

//========== Getters and Setters =================================
	public int getJobId() {
		return jobId;
	}


	public void setJobId(int jobId) {
		this.jobId = jobId;
	}


	public String getQuery() {
		return query;
	}


	public void setQuery(String query) {
		this.query = query;
	}

//======== toString =========================================================
	@Override
	public String toString() {
		return "Request [jobId=" + jobId + ", query=" + query + "]";
	}
	
	
	
	

}
