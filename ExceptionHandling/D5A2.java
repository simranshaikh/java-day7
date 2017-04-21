package ExceptionHandling;

public class D5A2 {
  private String Eid;

public void setEid( String Eid1) throws DataEntryException {
if(Eid.length()==6)
	this.Eid = Eid1;
else
	throw new DataEntryException("Invalid data");
}
}
