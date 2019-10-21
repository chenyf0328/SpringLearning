package com.chenyf.springdemo;/**
 * \file
 * \brief
 * <p>
 * <p>
 * <p>
 * \author      Yifan Chen
 */

import java.util.Random;

/** \brief
 *
 *  \param     
 *
 *  \returns        
 */

public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {"Happy1", "Happy2", "Happy3"};

    // create a random number generator
    private Random rand = new Random();

    @Override
    public String getFortune() {
        // get a random index from array of strings
        int index = rand.nextInt(data.length);

        return data[index];
    }

}
