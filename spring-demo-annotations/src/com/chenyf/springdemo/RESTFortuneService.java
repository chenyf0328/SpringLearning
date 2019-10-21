package com.chenyf.springdemo;/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

@Component
public class RESTFortuneService implements FortuneService {

    private String[] fortunes;

    @Value("${fortune.first}")
    private String fortunes1;

    @Value("${fortune.second}")
    private String fortunes2;

    @Value("${fortune.third}")
    private String fortunes3;

    public RESTFortuneService(){
        fortunes = new String[3];

        // cannot assign here, because the general process of Spring creating beans
//        fortunes[0] = fortunes1;
//        fortunes[1] = fortunes2;
//        fortunes[2] = fortunes3;
    }

    @Override
    public String getFortune() {
        // way 1:
//        fortunes[0] = fortunes1;
//        fortunes[1] = fortunes2;
//        fortunes[2] = fortunes3;

        Random random = new Random();
        int index = random.nextInt(fortunes.length);
        return fortunes[index];
    }

    @PostConstruct
    public void setupMyFortune(){
        fortunes[0] = fortunes1;
        fortunes[1] = fortunes2;
        fortunes[2] = fortunes3;
    }
}
