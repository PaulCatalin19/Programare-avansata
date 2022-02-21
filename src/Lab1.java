public class Lab1 {
    public static void main(String[] args){
        System.out.println("Hello World!");
        String[] languages =  {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        System.out.println(languages[2]);
        int n = (int) (Math.random() * 1000000);
        System.out.println(n);
        n *= 3;
        n += 0b10101;   //21
        n += 0xFF;      //255
        n *= 6;
        System.out.println(n);
        int sum = 0;
        do {
            if(n==0)
                n = sum;
            sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
        }while (sum>10);
        System.out.println( "Willy-nilly, this semester I will learn " + languages[sum]);

    }
}
