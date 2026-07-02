package sorting;

public class Main {

    public static void main(String[] args) {

        Order[] orders = {
                new Order(101, "Rohith", 3500),
                new Order(102, "Rahul", 1200),
                new Order(103, "Akhil", 7800),
                new Order(104, "Kiran", 2500)
        };

        System.out.println("===== Bubble Sort =====");

        SortingOrders.bubbleSort(orders);
        SortingOrders.display(orders);

        Order[] orders2 = {
                new Order(101, "Rohith", 3500),
                new Order(102, "Rahul", 1200),
                new Order(103, "Akhil", 7800),
                new Order(104, "Kiran", 2500)
        };

        System.out.println("\n===== Quick Sort =====");

        SortingOrders.quickSort(orders2, 0, orders2.length - 1);
        SortingOrders.display(orders2);
    }
}
