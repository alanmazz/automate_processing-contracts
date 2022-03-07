package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Services.ContractService;
import Services.PaypalService;
import entities.Contract;
import entities.Installment;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract cr = new Contract(number, date, totalValue);
		
		System.out.print("Enter number of installments: ");
		int amount = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		
		cs.processContract(cr, amount);
		
		System.out.println("Installments:");
		for (Installment it : cr.getInstallments()) {
			System.out.println(it);
		}

		
		sc.close();
	}

}
