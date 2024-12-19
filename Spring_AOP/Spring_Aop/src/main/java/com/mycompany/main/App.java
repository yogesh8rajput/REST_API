package com.mycompany.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.service.PaymentService;
import com.mycompany.service.PaymentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationCon context=new ClassPathXmlApplicationContext("config.xml");    
        
        PaymentService ps=context.getBean("psi",PaymentServiceImpl.class);
        
        
        ps.makePayment();
        
        }
    }
