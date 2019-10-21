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

public class HelloSpringApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
//        Coach trackCoach = context.getBean("myTrackCoach", Coach.class);
        Coach trackCoach = context.getBean("myRandomTrackCoach", Coach.class);
        Coach baseballCoach = context.getBean("myBaseballCoach", Coach.class);

        // call method on the bean
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyWorkout());

        // let's call our new method for fortunes
        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(trackCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
