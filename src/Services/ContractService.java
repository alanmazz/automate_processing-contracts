package Services;

import entities.Contract;

public class ContractService {
	
	private OnlinePaymentService onlinePayment;
	
	public ContractService(OnlinePaymentService onlinePayment) {
		this.onlinePayment = onlinePayment;
	}
	
	public void processContract(Contract contract, int months) {
		for (int i=1; i<=months; i++) {
			onlinePayment.interest(contract.getPartialPayment(), i);
			onlinePayment.paymentFee(contract.getPartialPayment());
		}
	}

}
