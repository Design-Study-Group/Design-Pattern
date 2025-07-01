class Book implements Prototype {
    private String title;
    private String author;
    private int pages;
    private String category;

    public Book(String title, String author, int pages, String category) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.category = category;

        // 복잡한 초기화 작업을 시뮬레이션
        System.out.println("복잡한 Book 객체 초기화 중...");
        try {
            Thread.sleep(100); // 초기화 시간 시뮬레이션
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // 복사 생성자
    private Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.pages = other.pages;
        this.category = other.category;
        System.out.println("Book 객체 복제됨");
    }

    @Override
    public Prototype clone() {
        return new Book(this);
    }

    // Getter/Setter 메서드들
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', pages=%d, category='%s'}",
                title, author, pages, category);
    }
}
