package CollectionDemo;

import ExceptionHandling.AccountException;

public class Account {
private String accId;   //Start with ACC & accId length must be 6
private String accType;

//by constructor
public Account(String accId, String accType) throws AccountException {
	super();
	if (accId.startsWith("ACC")&&accId.length()==6)
	this.accId = accId;
	else
		throw new AccountException("AccId is not valid");
	this.accType = accType;
}

//by getter and setter
public String getAccId() {
	return accId;
}
public void setAccId(String accid) throws AccountException {
	if (accid.startsWith("ACC")&&accid.length()==6)
	this.accId = accid;
	else
		
		throw new AccountException("AccId is not valid");
		
}
public String getAccType() {
	return accType;
}
public void setAccType(String accType) {
	this.accType = accType;
}
@Override
public String toString() {
	return "Account [accId=" + accId + ", accType=" + accType + "]";
}

}

