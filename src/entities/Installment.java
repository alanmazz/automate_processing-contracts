package entities;

import java.util.Date;

public class Installment {
	
	protected Date dueDate;
	protected Integer amount;
	
	public Installment() {
	}

	public Installment(Date dueDate, Integer amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	

}
