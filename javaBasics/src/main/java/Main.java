import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        LeapYearTask task1 = new LeapYearTask();
        GradeTask task2 = new GradeTask();
        MaxElementTask task3 = new MaxElementTask();
        TrianglePatternTask task4 = new TrianglePatternTask();
        TwoValuesTask task5 = new TwoValuesTask();
        CircleAreaTask task6 = new CircleAreaTask();

        //change task number to execute
        task6.execute();
    }

}
