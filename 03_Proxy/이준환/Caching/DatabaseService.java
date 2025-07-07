package Caching;

public class DatabaseService implements DataService {

    @Override
    public String getData(String key) {
        System.out.println("Fetching data from database for key...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Data for " + key;
    }
}
