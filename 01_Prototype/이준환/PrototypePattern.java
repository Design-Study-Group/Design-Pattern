public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {

        Rectangle rect1 = new Rectangle(100, 100);
        Rectangle rect2 = rect1.clone();

        System.out.println(rect1);
        System.out.println(rect2);



        System.out.println("=== Prototype Pattern 데모 ===\n");

        // 1. 직접 프로토타입 사용
        System.out.println("1. 원본 객체 생성:");
        Book originalBook = new Book("자바 디자인 패턴", "김개발", 500, "프로그래밍");
        System.out.println("원본: " + originalBook + "\n");

        // 2. 프로토타입으로 복제
        System.out.println("2. 프로토타입으로 복제:");
        Book clonedBook1 = (Book) originalBook.clone();
        Book clonedBook2 = (Book) originalBook.clone();

        // 복제된 객체 수정
        clonedBook1.setTitle("자바 디자인 패턴 - 응용편");
        clonedBook2.setTitle("자바 디자인 패턴 - 실전편");
        clonedBook2.setPages(600);

        System.out.println("복제본1: " + clonedBook1);
        System.out.println("복제본2: " + clonedBook2);
        System.out.println("원본: " + originalBook + "\n");

        // 3. 프로토타입 매니저 사용
        System.out.println("3. 프로토타입 매니저 사용:");
        Movie movieTemplate = (Movie) PrototypeManager.getPrototype("defaultMovie");
        if (movieTemplate != null) {
            movieTemplate.setTitle("인터스텔라");
            movieTemplate.setDirector("크리스토퍼 놀란");
            movieTemplate.setDuration(169);
            movieTemplate.setGenre("SF");
            System.out.println("매니저에서 생성된 영화: " + movieTemplate);
        }

        // 4. 새로운 프로토타입 등록 및 사용
        System.out.println("\n4. 커스텀 프로토타입 등록:");
        Book customBook = new Book("스프링 부트", "이자바", 400, "프로그래밍");
        PrototypeManager.addPrototype("springBook", customBook);

        Book newBook = (Book) PrototypeManager.getPrototype("springBook");
        if (newBook != null) {
            newBook.setTitle("스프링 부트 실전 가이드");
            System.out.println("커스텀 프로토타입에서 생성: " + newBook);
        }

        // 5. 성능 비교 (생성 vs 복제)
        System.out.println("\n5. 성능 비교:");
        long startTime, endTime;

        // 새로 생성
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            new Book("테스트 도서 " + i, "테스트 작가", 200, "테스트");
        }
        endTime = System.currentTimeMillis();
        System.out.println("10개 객체 새로 생성 시간: " + (endTime - startTime) + "ms");

        // 복제로 생성
        Book template = new Book("템플릿 도서", "템플릿 작가", 200, "템플릿");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            Book cloned = (Book) template.clone();
            cloned.setTitle("복제된 도서 " + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("10개 객체 복제 생성 시간: " + (endTime - startTime) + "ms");
    }
}
