package edu.kis.vh.nursery;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FIFORhymerUnitTest {
    @Test
    public void testFIFORhymerCountOut() {
        FIFORhymer rhymer = new FIFORhymer();
        rhymer.countIn(1);
        rhymer.countIn(2);
        rhymer.countIn(3);

        int result = rhymer.countOut();
        assertEquals(1, result);


        rhymer.countIn(4);
        rhymer.countIn(5);

        result = rhymer.countOut();
        assertEquals(2, result);
    }
}