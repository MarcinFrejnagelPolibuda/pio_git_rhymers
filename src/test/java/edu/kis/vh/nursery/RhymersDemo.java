package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static void main(String[] args) {
        Rhymersfactory rhymersfactory = new DefaultRhymersFactory();

        DefaultCountingOutRhymer[] defaultCountingOutRhymers = { rhymersfactory.GetStandardRhymer(), rhymersfactory.GetFalseRhymer(),
                rhymersfactory.GetFIFORhymer(), rhymersfactory.GetHanoiRhymer()};

        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                defaultCountingOutRhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            defaultCountingOutRhymers[3].countIn(rn.nextInt(20));

        for (int i = 0; i < defaultCountingOutRhymers.length; i++) {
            while (!defaultCountingOutRhymers[i].callCheck())
                System.out.print(defaultCountingOutRhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) defaultCountingOutRhymers[3]).reportRejected());

    }

}