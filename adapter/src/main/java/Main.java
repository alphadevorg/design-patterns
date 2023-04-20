public class Main {
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();
        swiggyStore.addItem(new FoodItem());
        swiggyStore.addItem(new FoodItem());
        //Adapter grocery which was incompatible with food
        swiggyStore.addItem(new GroceryItemAdapter(new GroceryProduct()));
    }
}
