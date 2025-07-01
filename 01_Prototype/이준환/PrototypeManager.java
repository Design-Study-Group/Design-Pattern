import java.util.HashMap;
import java.util.Map;

class PrototypeManager {
    private static final Map<String, Prototype> prototypes = new HashMap<>();

    static {
        // 미리 정의된 프로토타입들을 등록
        prototypes.put("defaultBook", new Book("기본 도서", "작자 미상", 100, "일반"));
        prototypes.put("defaultMovie", new Movie("기본 영화", "감독 미상", 120, "드라마"));
    }

    public static Prototype getPrototype(String type) {
        Prototype prototype = prototypes.get(type);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }

    public static void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }
}