package edu.psu.cmpsc221.model;

public class Item {
    public Item(String name, String lookDescription, int weight, int bulkiness) {
        this.lookDescription = lookDescription;
        this.name = name;
        this.bulkiness = bulkiness;
        this.weight = weight;
    } /* end Item */

    public String getLookDescription() {
        return lookDescription;
    } /* end getLookDescription */

    public String getName() {
        return name;
    } /* end getName */
    
    public int getWeight() {
        return weight;
    } /* end getWeight */

    public int getBulkiness() {
        return bulkiness;
    } /* end getBulkiness */

    private String lookDescription;
    private String name;
    private int bulkiness;
    private int weight;
} /* end Item (code from class adventure) */