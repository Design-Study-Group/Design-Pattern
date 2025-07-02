class Movie implements Prototype {
    private String title;
    private String director;
    private int duration;
    private String genre;

    public Movie(String title, String director, int duration, String genre) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.genre = genre;

        System.out.println("복잡한 Movie 객체 초기화 중...");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private Movie(Movie other) {
        this.title = other.title;
        this.director = other.director;
        this.duration = other.duration;
        this.genre = other.genre;
        System.out.println("Movie 객체 복제됨");
    }

    @Override
    public Prototype clone() {
        return new Movie(this);
    }

    public void setTitle(String title) { this.title = title; }
    public void setDirector(String director) { this.director = director; }
    public void setDuration(int duration) { this.duration = duration; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public int getDuration() { return duration; }
    public String getGenre() { return genre; }

    @Override
    public String toString() {
        return String.format("Movie{title='%s', director='%s', duration=%d, genre='%s'}",
                title, director, duration, genre);
    }
}