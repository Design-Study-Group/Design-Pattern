public class StockDisplay implements Observer{
    private String displayName;

    public StockDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(String message) {
        System.out.println("[" + displayName + "] " + message);
    }
}
