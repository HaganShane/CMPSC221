package edu.psu.cmpsc221.model;

public class FiniteInventorySystem extends InventorySystem {
    protected FiniteInventorySystem(int capacity) {
        super();
        this.capacity = capacity;
    } /* end protected FiniteInventorySystem  */

    protected boolean canAddItem(Item item) {
        int NumOfItems = 0;
        for (Item i : list) {
            NumOfItems++;
        } /* end for loop */

        return (NumOfItems < this.capacity);
    } /* end canAddItem */

    protected String getInventoryFullMessage() {
        return "You cannot hold any more items.";
    } /* end getInventoryFullMessage */

    private int capacity;
} /* end FiniteInventorySystem (code referened from stack overflow & chegg https://stackoverflow.com/questions/3767365/super-in-java/3767421) */
