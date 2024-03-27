public class App {
    public static void main(String[] args) {

        //IF@1
        int x=4;
        int y=0;
        if (x>3){
            y=10;
        System.out.println("Hi, World!"+y);
        }else {
            System.out.println("Vincent"+y);
        }

        //IF@2
        if (x>2){
            System.out.println("x>2");
        }else if (x>=0 && x<=2){//if~And
            System.out.println("x>=0 && x<=");
        }else {
            System.out.println("x<0");
        }

        //Example@1
        int a=3;
        int b=10;
        int max=a;
        if (b>a) {
            max=b;
        }
        System.out.println("The max number is " +max+".");

        //Example@2
        String Day="Sunday";
        if ("Sunday".equals(Day) || "Saturday".equals(Day)) {
            System.out.println("It is a Weekend.");
        } else {
            System.out.println("It is a Weekday.");
        }

        //Compare Strings
        //1. String value compares with String variable("Monday".equals(day))
        //2. String variable compares with String variable

        //Example@3
        //score>90 -> A
        //80~90 -> B
        //70~79 -> C
        //Below 70 -> F
        int score=85;
        char grade=' ';
        String Result ="passed";
        if (score>90) {
            grade='A';
        }else if (score>=80) {
            grade='B';
        }else if (score>=70) {
            grade='C';
        }else {
            grade='F'; Result="failed";
        }
        System.out.println("The grade is "+grade+" and "+Result+".");








    }
}