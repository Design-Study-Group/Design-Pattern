package prototype.soyeon;

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee(1001
                , "김철수"
                , "사원"
                , new Department(1, "개발팀", "본사 3층")
        );

        Employee emp2 = emp1.clone();

        //emp2는 emp1의 내용만 복사한 새로운 객체
        System.out.println("emp1 : " + emp1);
        System.out.println("emp2 : " + emp2);

        emp2.setName("이영희");
        emp2.setPosition("대리");
        emp2.getDepartment().setLocation("서울지사");

        //emp2의 department 속성을 변경해도 emp1의 department 속성에 영향을 주지 않음
        System.out.println("emp1 : " + emp1);
        System.out.println("emp2 : " + emp2);
    }
}