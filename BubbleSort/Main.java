package BubbleSort;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative[] representatives = new SalesRepresentative[]{
                new SalesRepresentative(10, 500),
                new SalesRepresentative(7, 800),
                new SalesRepresentative(5, 1000),
                new SalesRepresentative(15, 400)
        };
        BubbleSort bubbleSort = new BubbleSort();
         SalesRepresentative[] sortedRepresentatives = bubbleSort.sort(representatives);

        System.out.println("Sorted Representatives:");
        for (int i = 0; i < sortedRepresentatives.length; i++) {
            SalesRepresentative representative = sortedRepresentatives[i];
            System.out.println((i + 1) + ": " + representative);
        }
         int totalRevenue = 0;
        for (SalesRepresentative representative : sortedRepresentatives) {
            totalRevenue += representative.getRevenue();
        }

        System.out.println("Total revenue generated: $" + totalRevenue);
    }
}