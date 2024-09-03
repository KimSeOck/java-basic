package day4.exam4;

public class Test {
    public int printEven(int value){
        for(int i = 1; i <= value; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
            else{
                System.out.println();
            }
        }
        return value;
    }

}
