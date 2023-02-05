package vishal_fw20_0280.unit_4.sprint_1.day_2.assignments.javaClass1;

public class factorial {
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        for(int i=num;i>0;i--){
            fact*=i;
        }
        System.out.println(fact);
    }
}
