package com.epsilon.bookshelf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext ctx;

	public static void main( String[] args )
    {
        ctx = new ClassPathXmlApplicationContext("com/epsilon/bookshelf/config.xml");
        
        Order ayush_order = (Order) ctx.getBean("order1");
        
        System.out.println(ayush_order);
    }
}
