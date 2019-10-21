package com.chenyf.springdemo;
/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach{

//    @Autowired
//    @Qualifier("randomFortuneService")
//    private FortuneService fortuneService;

    @Autowired
    @Qualifier("RESTFortuneService")
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define a setter method
    /*
    @Autowired
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println(">> TennisCoach: inside setFortuneService() constructor");
        fortuneService = theFortuneService;
    }
    */

    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    */

    @Override
    public String getDailyWorkout(){
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    /*
    @Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService){
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() constructor");
        fortuneService = theFortuneService;
    }
     */
}
