public class Order {
    private int orderNo;
    private Customer customer;
    private OrderItem[] items;
    private int itemCount;

    public Order(int orderNo, Customer customer) {
        this(orderNo, customer, 5);
    }
    public Order(int orderNo, Customer customer, int capacity) {
        this.orderNo = orderNo;
        this.customer = customer;
        this.items = new OrderItem[capacity];
        this.itemCount = 0;
    }

    public void addItem(FoodItem item, int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be positive.");
            return;
        }
        if (itemCount >= items.length) {
            System.out.println("Error: Cannot add item. Order capacity reached.");
            return;
        }

        items[itemCount] = new OrderItem(item, quantity);
        itemCount++;
    }


