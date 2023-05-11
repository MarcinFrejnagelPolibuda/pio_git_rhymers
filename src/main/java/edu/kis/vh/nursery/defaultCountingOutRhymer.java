package edu.kis.vh.nursery;

/**
 * Class representing a nursery rhyme with counting elements.
 */
public class defaultCountingOutRhymer {

    public static final int NUMBERS_QUANTITY = 12;
    public static final int RHYMER_EMPTY_INDICATOR = -1;
    public static final int RHYMER_FULL_INDICATOR = NUMBERS_QUANTITY - 1;
    public static final int RETURN_VALUE_RHYMER_EMPTY = -1;

    private final int[] NUMBERS = new int[NUMBERS_QUANTITY];

    public int total = RHYMER_EMPTY_INDICATOR;

    /**
     * Adds an element to the rhyme.
     *
     * @param in element to add
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Returns the number of elements in the rhyme.
     *
     * @return the number of elements in the rhyme
     */
    public int getTotal() {
        return total;
    }

    /**
     * Checks if the rhyme is empty.
     *
     * @return true if the rhyme is empty; false otherwise
     */
    boolean callCheck() {
        return total == -1;
    }

    /**
     * Checks if the rhyme is full.
     *
     * @return true if the rhyme is full; false otherwise
     */
    boolean isFull() {
        return total == 11;
    }

    /**
     * Returns the last added element of the rhyme.
     *
     * @return the last added element of the rhyme or -1 if the rhyme is empty
     */
    protected int peekaboo() {
        if (callCheck())
            return RETURN_VALUE_RHYMER_EMPTY;
        return NUMBERS[total];
    }

    /**
     * Removes and returns the last added element of the rhyme.
     *
     * @return the last added element of the rhyme or -1 if the rhyme is empty
     */
    int countOut() {
        if (callCheck())
            return RETURN_VALUE_RHYMER_EMPTY;
        return NUMBERS[total--];
    }
}
