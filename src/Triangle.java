public class Triangle {

    int a;
    int b;
    int c;

    public void area (){

        int s = (a + b + c) / 2;

        System.out.println((Math.sqrt (s*(s - a) * (s - b) * (s - c))));
    }
}
