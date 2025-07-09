public class SortContext {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSort(int[] array) {
        if (strategy == null) {
            throw new IllegalStateException("정렬 전략이 설정되지 않았습니다.");
        }
        strategy.sort(array);
    }
}
