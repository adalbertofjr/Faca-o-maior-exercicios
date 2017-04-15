package com.example.android.clickcounter;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

/**
 * CounterTest
 * Created by Adalberto Fernandes Júnior on 14/04/17.
 * Copyright © 2016. All rights reserved.
 */
public class CounterTest {
    private ClickCounter mCounter;

    @Before
    public void setUp() throws Exception {
        mCounter = new ClickCounter();
    }

    @Test
    public void testInitialCount() {
        Assert.assertEquals(mCounter.getCount(), 0);
    }

    @Test
    public void testIncrement() {
        int previousValue = mCounter.getCount();
        mCounter.increment();
        int postValue = mCounter.getCount();
        Assert.assertEquals(previousValue + 1 , postValue);
    }
}