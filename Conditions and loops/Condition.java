public class Condition{
    public static void main(String[] args) {
        /*
        Syntax of if statements:
        if(boolean expreesion T or F){
            //do
        }else{
            //do
        }
         */
        int sal = 25400;
        // if(sal>15000){
        //     sal = sal + 2000;
        // }else{
        //     sal = sal + 1000;
        // }

        //multiple if statements
        if(sal>15000){
            sal = sal + 2000;
        }
        else if(sal>20000){
            sal = sal + 3000;
        }else{
            sal = sal + 1000;
        }
        System.out.println(sal);
    }
}