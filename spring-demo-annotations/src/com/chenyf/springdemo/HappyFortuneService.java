package com.chenyf.springdemo;/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import org.springframework.stereotype.Component;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

@Component
public class HappyFortuneService implements FortuneService {

    public HappyFortuneService(){
        System.out.println(">> HappyFortuneService Constructor");
    }

    @Override
    public String getFortune() {
        return "Today is your luck day!";
    }
}
