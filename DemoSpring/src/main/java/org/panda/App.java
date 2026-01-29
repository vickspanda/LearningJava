package org.panda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        Dev obj1 = context.getBean(Dev.class);
        obj1.build();
//        obj1.tell("My age is "+(obj1.getAge())+" years ... !!!");
//        Dev obj2 = (Dev) context.getBean("obj2");
//        obj2.tell("My age is "+(obj2.getAge())+" years ... !!!");


    }
}
