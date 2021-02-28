import java.util.Scanner;

public class gorev {


        public static void main(String[] args)
        {



            Scanner tara = new Scanner(System.in);




            System.out.println("sayi1'i giriniz");

            int sayi1 = tara.nextInt();
            tara.nextLine();
            System.out.println("sayi2'yi giriniz");

           int sayi2 = tara.nextInt();
            tara.nextLine();

            System.out.println("TOPLAMA ISLEMI ICIN 't'" +
                    "CIKARMA ISLEMI ICIN 'c' " +
                    "CARPMA ISLEMI ICIN 'x'" +
                    "BOLME ISLEMI ICIN 'b'");

            System.out.println("lutfen bir harf seciniz");
            String harf = tara.nextLine();

            if (harf.equals("t"))
            {
                int sonuc = sayi1 + sayi2;


                System.out.println("toplama islemi : "+ sonuc);


            }
            else if (harf.equals("c")){

                int sonuc = sayi1 - sayi2;

                System.out.println("cikarma islemi : "+ sonuc);
            }

            else if (harf.equals("b")){

                int sonuc = sayi1/sayi2;
                System.out.println("bolme islemi : "+ sonuc);
            }

            else if (harf.equals("x")) {

                int sonuc = sayi1 * sayi2;
                System.out.println("carpma islemi : " + sonuc);
            }


                else{
                    System.out.println("yanlis bir harf sectiniz ");

                }
            }





        }



