

//import java.util.Arrays;

class TheCodingDuo 
{
     public static void main(String[] args) {
    
    //    int age = 20;
    //     int physics = 97;
    //     int maths = 85;
    //     int chemistry = 95;

    //     int[] marks = new int[3];
    //     marks[0] = 97;
    //     marks[1] = 85;
    //     marks[2] = 95;

    //      //length
    //    // System.out.println(marks.length);

    //     //sort
    //     System.out.println(marks[2] );
    //     Arrays.sort(marks);
    //     System.out.println(marks[2]);

    //1d and 2d arrays
    //    int[] marks = {97,85,95};
    //    int[][] finalmarks = {{97,85,95},{97,95,85}};
    //    System.out.println(finalmarks[1][2]);
             
           //casting
           double price = 200.00;
           double finalprice = price+16.78;   // java allows implicit type casting by default

           System.out.println(finalprice);
           
            
           //implicit type casting (or) widening type casting
           int p = 56;
           int fp = p+(int)87.99;   //longest to shortest

           System.out.println(fp);

      
           //explicit type casting (or) narrow type casting
            double p = 100;
            double fp = p+(double)18;  //shortest to longest

            System.out.println(fp);
    }
}           