package school.cesar.unit;

public class Factorial {
//545454
    public int calculate(int number){
        if (number <= 1) {
            return  number;
        }
        return number * calculate(number -1);
    }
}
