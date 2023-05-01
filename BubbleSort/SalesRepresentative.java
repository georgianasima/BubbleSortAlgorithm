package BubbleSort;
public class SalesRepresentative {
    private int sales;
    private int quota;
    private int index;
    public SalesRepresentative(int sales, int quota) {
        this.sales = sales;
        this.quota = quota;
    }
    public int getSales() {
        return sales;
    }
    public void setSales(int sales) {
        this.sales = sales;
    }
    public int getQuota() {
        return quota;
    }
    public void setQuota(int quota) {
        this.quota = quota;
    }
    public int getRevenue() {
        return sales * quota;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    @Override
    public String toString() {
        return "Sales guy " + (index + 1) + " - Sales: " + sales + ", Quota: $" + quota + ", Revenue: $" + getRevenue();
    }
}

