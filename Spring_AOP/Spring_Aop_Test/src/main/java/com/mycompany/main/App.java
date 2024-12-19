
package com.mycompany.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.payment.PaymentService;
import com.mycompany.payment.PaymentServiceImp;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");    
        
        PaymentService ps=context.getBean("psi",PaymentServiceImp.class);
        
        
        ps.makePayment();
        
        }
    }
