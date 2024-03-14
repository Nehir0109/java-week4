import java.sql.SQLOutput;
import java.util.Scanner;
/*public class Main {
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        String[] students = {"Burak", "Ahmet", "Nazlı", "Zehra"};
        String[] subjects = {"Matematik", "Fizik", "Kimya", "Biyoloji"};
        int[][] grades= new int[students.length][subjects.length];

        System.out.println("Puan Hesaplama Sistemine Hoşgeldiniz!\n");

        for(int i=0; i< students.length; i++){
            for(int j=0; j< subjects.length; j++){
                System.out.print(students[i]+ " için "+ subjects[j]+ " notunu giriniz: ");
                grades[i][j]= get.nextInt();
            }
        }

        System.out.println("\nNot Ortalamaları: \n");

        for(int i=0; i< students.length; i++){
            int sum=0;
            for(int j=0; j< subjects.length; j++){
                sum+= grades[i][j];
            }
            double avarage = (double) sum/ subjects.length;
            System.out.println(students[i]+ ": "+ avarage);
        }

        System.out.println("\nDers için Sınıf Ortalaması: \n");
        for(int i=0; i< subjects.length; i++){
            int sum =0;
            for(int j=0; j< students.length; j++){
                sum+= grades[j][i];
            }
            double avarage = (double) sum/ subjects.length;
            System.out.println(students[i]+ ": "+ avarage);
        }


        int classSum= 0;
        for(int i=0; i< students.length; i++){
            for(int j=0; j< subjects.length; j++){
                classSum += grades[i][j];
            }
        }
        double classAverage = (double) classSum/ (students.length * subjects.length);
        System.out.println("\nSınıf Ortalaması: "+ classAverage);
    }
}*/

public class Main{
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        //Dizi Başlatma: Java kodu yazın ve içeriğini {2, 4, 6, 8, 10} değerlerine sahip bir tamsayı dizisi ile başlatın ve içeriğini görüntüleyin.

        int[] dizi= {2, 4, 6, 8, 10};
        System.out.println("Dizi İçeriği:");

        for(int i=0; i<dizi.length; i++){
            System.out.println("dizi[" + i + "] = " + dizi[i]);
        }
    }
}