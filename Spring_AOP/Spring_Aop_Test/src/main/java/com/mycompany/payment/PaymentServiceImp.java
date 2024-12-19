package com.mycompany.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImp implements PaymentService{

	@Override
	public void makePayment() {
		System.out.println("Payment Debited");
		System.out.println("Payment Credited");
	}

}