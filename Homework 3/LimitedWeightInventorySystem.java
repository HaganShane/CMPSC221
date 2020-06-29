package edu.psu.cmpsc221.model;

public class LimitedWeightInventorySystem extends InventorySystem {
		protected LimitedWeightInventorySystem(int maxWeight) {
		    super();
		    this.maxWeight = maxWeight;
		} /* end protected LimitedWeightInventorySystem */
		
    protected boolean canAddItem(Item item) {
        int currentWeight = 0;
        for (Item i : list) {
            currentWeight += i.getWeight();
        } /* end for loop */

        return (currentWeight + item.getWeight <= this.maxWeight);
    } /* end canAddItem */

    protected String getInventoryFullMessage() {
        return "This item will make you over the maximum weight capacity.";
    } /* end getInventoryFullMessage */
    
    private int maxWeight;
} /* end LimitedWeightInventorySystem (code referened from stack overflow & chegg https://stackoverflow.com/questions/3767365/super-in-java/3767421) */
