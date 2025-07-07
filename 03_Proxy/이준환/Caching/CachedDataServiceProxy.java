package Caching;

import java.util.HashMap;
import java.util.Map;

public class CachedDataServiceProxy implements DataService {
    private DataService dataService;
    private Map<String, String> cache;

    public CachedDataServiceProxy() {
        this.dataService = dataService = new DatabaseService();
        this.cache = new HashMap<>();
    }

    @Override
    public String getData(String key) {
        // 캐시에서 먼저 확인
        if (cache.containsKey(key)) {
            System.out.println("Cache Hit! for key: " + key);
            return cache.get(key);
        }

        String data = dataService.getData(key);
        cache.put(key, data);
        return data;
    }
}
