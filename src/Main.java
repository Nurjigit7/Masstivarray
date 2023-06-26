import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /**
         * Массивди 0-100 чейинки 20 кокус(рандом)
         * сан менен толтурунуз.
         * 50дон чон элементтердин орточо
         * арифметикалык маанисин консолго
         * чыгарыныз.
         */
//        int[] array ={5,23,-5,34343434,6};
//        boolean [] boo ={true,false,false,true,true};
//        String[]strings={};
//
//          int [] arr =new int[10];
//          int [] arr2= new int[]{3,325, 35,32};
//


//          int [] arra = new int[5];
//          arra[0] = 32;
//          arra[1] =54;
//          arra[2] =74;
//          arra[4] =78;
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(arra[i]);
//
//        }
//       String[] strings = new String[2];
//        strings[0] ="nurjigit";
//        int[] array = new int[10];
//        Random random = new Random();
//        int summa = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(100);
//            summa+=array[i];
//        }
//        System.out.println("sum "+summa);
//        System.out.println("count: "+array.length);
//        System.out.println("Arif: "+summa/(double) array.length);
//      Random random =new Random();
//       int [] mas = new  int [10];
//       int san =1, san2=0;
//        for (int i = 0; i < mas.length; i++) {
//           mas [i] = random.nextInt(20);
//             System.out.println("random san "+san2+") ("+mas[i]+"]");
//            san+=mas[i];
//
//
//        }
//        System.out.println("arif san :" +san+" / "+san2+" = "+(double)san/ mas.length);

        Random random = new Random();
        int[] array = new int[20];
        int san1 = 0;
        int counter = 0;
        int san2 = 0;
        int counter1 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
            if (array[i] >50) {
                san1 += array[i];
                counter++;
            } else {
                san2 += array[i];
                counter1++;
            }
        }
        System.out.println(" 50 дон Чон сандар");
        System.out.println((double) san1 / counter);
        System.out.println(" 50  кичине сандар ");
        System.out.println( (double) san2 / counter1);

    }
}