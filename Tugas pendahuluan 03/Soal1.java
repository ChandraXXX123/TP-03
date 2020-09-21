import java.util.Scanner;

class Soal1{
    public static void main (String[] args){
        long nominalUang;
        int hari;
        long totalTabungan;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan jumlah nominal uang tabungan anda = ");
        nominalUang = userInput.nextLong();
        System.out.print("Masukan jumlah hari = ");
        hari = userInput.nextInt();
        totalTabungan = nominalUang * hari;
        System.out.println("Total tabungan anda selama " + hari + " hari sebesar = " +  totalTabungan);

    }

}