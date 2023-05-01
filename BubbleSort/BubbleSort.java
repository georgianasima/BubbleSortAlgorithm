package BubbleSort;

public class BubbleSort {
    public SalesRepresentative[] sort(SalesRepresentative[] representatives) {
        int n = representatives.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (representatives[j].getRevenue() < representatives[j + 1].getRevenue()) {
                    SalesRepresentative temp = representatives[j];
                     representatives[j] = representatives[j + 1];
                     representatives[j + 1] = temp;

                    // update index values after swapping
                    representatives[j].setIndex(j);
                    representatives[j + 1].setIndex(j + 1);
                }
            }
         }
        return representatives;
    }
}

