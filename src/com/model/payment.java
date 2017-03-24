package com.model;

public class payment {
	long cardnumber;
	String nameoncard;
	String expirationdate;
	int cvcode;
	public long getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getNameoncard() {
		return nameoncard;
	}
	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}
	public String getExpirationdate() {
		return expirationdate;
	}
	public void setExpirationdate(String expirationdate) {
		this.expirationdate = expirationdate;
	}
	public int getCvcode() {
		return cvcode;
	}
	public void setCvcode(int cvcode) {
		this.cvcode = cvcode;
	}
}
