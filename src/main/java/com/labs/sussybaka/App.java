package com.labs.sussybaka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App 
{
    private final static Logger logger=LoggerFactory.getLogger(App.class);


    public static void main( String[] args )
    {
        logger.info("starting application");
        int result=add(5,10);
        logger.info("answer of a + b is {}",result);
    }

    public static int add(int a,int b){
        return a+b;
    }
}
