
public class Digitaldocs {

	int docid;
	String doctype;
	String doccredential;
	String issuedate;
	String expirydate;
	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
	}
	public String getDoctype() {
		return doctype;
	}
	public void setDoctype(String doctype) {
		this.doctype = doctype;
	}
	public String getDoccredential() {
		return doccredential;
	}
	public void setDoccredential(String doccredential) {
		this.doccredential = doccredential;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public Digitaldocs(int docid, String doctype, String doccredential, String issuedate, String expirydate) {
		
		this.docid = docid;
		this.doctype = doctype;
		this.doccredential = doccredential;
		this.issuedate = issuedate;
		this.expirydate = expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	@Override
	public String toString() {
		return "Digitaldocs [docid=" + docid + ", doctype=" + doctype + ", doccredential=" + doccredential
				+ ", issuedate=" + issuedate + ", expirydate=" + expirydate + "]";
	}

	
}
