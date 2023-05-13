public class Task3 {
    public static void main(String[] args) {
        int temperature1 = 200;
        int temperature2 = 40;
        int aparat = 100;
        boolean result;// = (temperature1 < aparat > temperature2);

        if ((temperature1 >= aparat) && (temperature2 <= aparat)) result = true;

         else result = false;
        System.out.println(result);


    }
}


//if ((temperature1 <= aparat) && (temperature2 >= aparat))result= true;
     //   {
     //   System.out.println("Работает");}

     //   else result = false;
      //  {
     //   System.out.println("Не работает");}
      //  }
