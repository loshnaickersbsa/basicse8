package com.acme.domain;

public class ProcessOrderService {

    int test = 1 ;

    public String chooseContainer(Good productIn)
    {
        return test +  ( productIn.getContainerType().toString() );
    }

    @Override
    public String toString() {
        return "ProcessOrderService{" +
                "test=" + test +
                '}';
    }

}
