import java.util.Arrays;
import java.util.Scanner;
//Arrays Recap Project
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

//LOKUM :

//public class Main{
//    public static void main(String[] args) {
//        Scanner get= new Scanner(System.in);

        //Dizi Başlatma: Java kodu yazın ve içeriğini {2, 4, 6, 8, 10} değerlerine sahip bir tamsayı dizisi ile başlatın ve içeriğini görüntüleyin.

        /*int[] dizi= {2, 4, 6, 8, 10};
        System.out.println("Dizi İçeriği:");

        for(int i=0; i<dizi.length; i++){
            System.out.println("dizi[" + i + "] = " + dizi[i]);
        }*/

        //Dizi Toplamı: Tüm tamsayılar dizisindeki tüm öğelerin toplamını hesaplayan ve görüntüleyen bir program oluşturun.

        /*int[] dizi= {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0; i< dizi.length; i++){
            sum+=dizi[i];
        }
        System.out.println("Dizideki sayıların toplamı: "+ sum);

        // dizinin kullanıcıdan alınan versiyonu

        System.out.print("Oluşturmak istediğiniz dizinin boyutunu giriniz: ");
        int length = get.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i <length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: "); // (+1) deme sebebim indeks sıfırdan başladığı için,saymaya birden başlamasını istediğim için
            arr[i] = get.nextInt();
        }
        System.out.print("Oluşturduğunuz Dizi= ");
        for(int i=0; i<length; i++){
            System.out.print(arr[i]);
            if(i<length-1){
                System.out.print(", ");
            }
        }

        int summ=0;
        for(int i=0; i<arr.length; i++){
            summ+= arr[i];
        }
        System.out.print("\nDizideki sayıların toplamı: "+ summ);*/

        // En Büyük ve En Küçük Öğe: Bir tamsayı dizisindeki en büyük ve en küçük öğeleri bulan ve bunları görüntüleyen bir Java programı yazın.

        /*System.out.print("Oluşturmak istediğiniz dizinin boyutunu giriniz: ");
        int length = get.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i <length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            arr[i] = get.nextInt();
        }
        System.out.print("Oluşturduğunuz Dizi= ");
        for(int i=0; i<length; i++){
            System.out.print(arr[i]);
            if(i<length-1){
                System.out.print(", ");
            }
        }

        int max= arr[0], min= arr[0];

        for(int i=1; i<length; i++){
            if(max < arr[i]){
                max = arr[i];
            }else if(min > arr[i]){
                min = arr[i];
            }
        }
        if((-1)* min>max){
            max = (-1)* min;
        }
        System.out.print("\nEn Büyük Öğe: "+ max);
        System.out.println("\nEn Küçük Öğe: "+ min);*/

        //Dizi Sıralama: Bir tamsayı dizisini artan sırayla sıralayan ve sıralanmış diziyi görüntüleyen bir programı uygulayın.
        //ARTAN SIRAYLA:

        /*int[] dizi= {25,32,65,66,102,147,2,3,55,1,3,5,999,33,34};
        int temp;

        for(int i=0;i< dizi.length-1; i++){
            for(int j=i+1; j< dizi.length; j++){
                if(dizi[i]>dizi[j]){
                    temp= dizi[j];
                    dizi[j]=dizi[i];
                    dizi[i]= temp;
                }
            }
        }
        for(int i=0; i< dizi.length; i++){
            System.out.println(dizi[i]);
        }

        //AZALAN SIRAYLA:

        int[] dizi= {25,32,65,66,102,147,2,3,55,1,3,5,999,33,34};
        int temp;

        for(int i=0;i< dizi.length-1; i++){
            for(int j=i+1; j< dizi.length; j++){
                if(dizi[i]>dizi[j]){
                    temp= dizi[j];
                    dizi[j]=dizi[i];
                    dizi[i]= temp;
                }
            }
        }
        for(int i= dizi.length-1; i>=0; i--){
            System.out.println(dizi[i]);
        }*/

        //Dizide Arama: Bir dizide belirli bir tamsayıyı arayan ve bulunursa dizinin indeksini veya bulunamazsa bir mesajı görüntüleyen bir program oluşturun.

        /*int[] dizi= {1,2,3,4,5,6,7,8,9,10};

        System.out.print("\nDizide aramak istediğiniz tam sayıyı giriniz: ");
        int aranan = get.nextInt();

        int index= -1;
        for(int i=0; i< dizi.length; i++){
            if(dizi[i]== aranan){
                index= i;
                break;
            }
        }
        if(index != -1){
            System.out.println("Sayı " + aranan + " dizide bulundu.Indeks no: "+ index);
        } else {
            System.out.println("Sayı bulunamadı.");
        }
        System.out.print("\nDizi= ");
        for(int i=0; i<dizi.length; i++){
            System.out.print(dizi[i]);
            if(i<dizi.length-1){
                System.out.print(", ");
            }
        }*/

        //Dizi Çoğaltma: Bir diziden yinelenen öğeleri kaldıran ve değiştirilmiş diziyi görüntüleyen bir programı uygulayın.

        /*System.out.print("Oluşturmak istediğiniz dizinin boyutunu giriniz: ");
        int length = get.nextInt();

        int[] array = new int[length];
        for (int i = 0; i <length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            array[i] = get.nextInt();
        }
        System.out.println("\nDizinin orijinal Hali: "+Arrays.toString(array));
        int[] uniqueArray = removeDuplicates(array);
        System.out.print("Yinelenen öğelerden arındırılmış dizi: "+Arrays.toString(uniqueArray));

    }

    public static int[] removeDuplicates(int[] array){
        int[] uniqueArray = new int[array.length];
        int index=0;
        boolean isDuplicate;

        for(int i=0; i<array.length;i++){
            isDuplicate=false;
            for(int j=0; j<i; j++){ //j<i yazdık çünkü bu zaten kontrol edilmiş olan öğeleri tekrar kontrol etmemizi önler ve gereksiz işlemleri engeller.
                if(array[i]== array[j]){ //bir eleman daha önceki elelmanlarla aynı mı kontrol ettik
                    isDuplicate= true; //aynı olunca true dedik
                    break;
                }
            }
            if(!isDuplicate){
                uniqueArray[index++] = array[i]; //index değişkeni, uniqueArray'ye eklenecek elemanın indeksini tutar ve her eklemeden sonra bir arttırılır.
                                                // Bu sayede uniqueArray içine elemanlar sırasıyla eklenir.Sonuç olarak,uniqueArray yinelenen elemanlar kaldırılmış olan diziyi içerir.
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }*/
//}
//Lokum devamı:
public class Main{
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);

        //İki Boyutlu Diziler: Bir 2D dizi başlatan ve içeriğini tablo biçiminde görüntüleyen bir program oluşturun.
        int[][] array={ {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} };
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){ //array[i].length yaparak herhangi bir satırdaki sütun sayısını almış olduk.
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}