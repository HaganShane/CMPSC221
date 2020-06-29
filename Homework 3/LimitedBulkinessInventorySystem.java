package edu.psu.cmpsc221.model;

public class LimitedBulkinessInventorySystem extends InventorySystem {
		protected LimitedBulkinessInventorySystem(int maxBulkiness) {
		    super();
		    this.maxBulkiness = maxBulkiness;
		} /* end protected LimitedBulkinessInventorySystem */
		
    protected boolean canAddItem(Item item) {
        int CurrentBulkiness = 0;
        for (Item i : list) {
            CurrentBulkiness += i.getBulkiness();
        } /* end for loop */

        return (CurrentBulkiness + item.getBulkiness <= this.maxBulkiness);
    } /* end canAddItem */

    protected String getInventoryFullMessage() {
        return "This item will make you over the maximum bulkiness capacity.";
    } /* end getInventoryFullMessage */
    
    private int maxBulkiness;
} /* end LimitedBulkinessInventorySystem (code referened from stack overflow & chegg https://stackoverflow.com/questions/3767365/super-in-java/3767421) */
