package com.mycompany.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {
      
	@Before("execution(void com.mycompany.payment.PaymentServiceImp.makePayment())")
	public void logbefore()
	{
		System.out.println("Authentication start");	

	}
	
	@After("execution(void com.mycompany.payment.PaymentServiceImp.makePayment())")
	public void logafter()
	{
		System.out.println("Authentication after ");	

	}
}
