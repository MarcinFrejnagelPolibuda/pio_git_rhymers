package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        defaultCountingOutRhymer.countIn(testValue);

        int result = defaultCountingOutRhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();
        boolean result = defaultCountingOutRhymer.callCheck();
        Assert.assertEquals(true, result);

        defaultCountingOutRhymer.countIn(888);

        result = defaultCountingOutRhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = defaultCountingOutRhymer.isFull();
            Assert.assertEquals(false, result);
            defaultCountingOutRhymer.countIn(888);
        }

        boolean result = defaultCountingOutRhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = defaultCountingOutRhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        defaultCountingOutRhymer.countIn(testValue);

        result = defaultCountingOutRhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = defaultCountingOutRhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = defaultCountingOutRhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        defaultCountingOutRhymer.countIn(testValue);

        result = defaultCountingOutRhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = defaultCountingOutRhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

}