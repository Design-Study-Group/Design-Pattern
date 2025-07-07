import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Example {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        Set<Integer> remove = new HashSet<>();
        
        // 방법 1
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);

        numbers.remove(1);
        
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        numbers.remove(4);

        // 방법 2
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);

        // 삭제 대신 값을 기록
        // numbers.remove(1);
        remove.add(numbers.get(1));

        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // 삭제 대신 값을 기록
        // numbers.remove(4);
        remove.add(numbers.get(4));

        // 출력하기 전(최대 최소 값이 필요할 때) 한번에 삭제
        for(int number : numbers){
            if (!remove.contains(number)){
                System.out.print(number + " ");
            }
        }
    }
}