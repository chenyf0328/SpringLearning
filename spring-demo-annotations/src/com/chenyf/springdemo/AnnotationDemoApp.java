package com.chenyf.springdemo;/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
//        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);        // thatSillyCoach is the bean id
        Coach theCoach = context.getBean("tennisCoach", Coach.class);        // default bean id

        // call a method pn the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
