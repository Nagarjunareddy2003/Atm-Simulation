package Atm_simulation;

import java.util.LinkedHashMap;

public class Atmintefaceclass implements atmInterface {
	amt atm = new amt();
	LinkedHashMap<Long, String> ministmt = new LinkedHashMap<>();
long id=0;
	@Override
	public void viewbalance() {
		System.out.println("the Avaliable balance is " + atm.getBalance());

	}

	@Override
	public void withdraw(double withdraw) {
		if(withdraw%500==0) {
			if (withdraw <= atm.getBalance()) {
				ministmt.put(++id,withdraw+ " amout with drawn");
				System.out.println("after the withdraw amount is");

				atm.setBalance(atm.getBalance() - withdraw);
				viewbalance();
			} else {
				System.out.println("Insufficient Balace");
			}
		}
		else {
			System.out.println("enter the amount in multiple of 500");
		}
	

	}

	@Override
	public void deposite(double deposite) {
		ministmt.put(++id,deposite+ " amout has been deposite");
		System.out.println("after the depoisted amount is");
		atm.setBalance(atm.getBalance() + deposite);
		viewbalance();

	}

	@Override
	public void viewMinistatement() {
		for(long res:ministmt.keySet()) {
			System.out.println(res+" "+ministmt.get(res));
		}

	}

}
