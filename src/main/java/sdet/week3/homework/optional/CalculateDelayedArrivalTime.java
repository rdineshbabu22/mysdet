package sdet.week3.homework.optional;

import org.junit.Test;

import junit.framework.Assert;

public class CalculateDelayedArrivalTime {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int standardTime=24,findDelayedArrivalTime=0,DelayedArrivaltime=0;
        DelayedArrivaltime=arrivalTime+delayedTime;
        if(DelayedArrivaltime>=standardTime){
            findDelayedArrivalTime=DelayedArrivaltime-standardTime;
        }
        else{
            findDelayedArrivalTime=DelayedArrivaltime;
        }
        return findDelayedArrivalTime;
    }
    
    @Test
    public void calculateDelayedTimeSc1() {
    	Assert.assertEquals(20, findDelayedArrivalTime(15,5));
    }
    
    public void calculateDelayedTimeSc2() {
    	Assert.assertEquals(1, findDelayedArrivalTime(15,10));
    }


}
