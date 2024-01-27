public class ConditionalStatementQuiz {
    public static void main(String[] args) {
//       Jika bilangan positif, tampilkan "Bilangan Positif", jika negatif, tampilkan "Bilangan Negatif".
//        int number = -1;
//        String message = "Bilangan ";
//        if (number <= 0) {
//            System.out.println(message + number + " " + "Negatif");
//        } else {
//            System.out.println(message + number + " " + "Positif");
//        }

////        Buat program yang menentukan nama hari berdasarkan angka 1-7.
//        int day = 8;
//        switch (day) {
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("What the day?");
//
//        }

//      Jika tahun dapat dibagi oleh 4 tetapi tidak dapat dibagi oleh 100, atau dapat dibagi oleh 400, maka tahun tersebut adalah tahun kabisat.
//        int leap = 1800;
//        if (leap % 100 != 0) {
//            if (leap % 4 == 0) {
//                System.out.println("Kabisat");
//            }
//        } else if (leap % 400 == 0) {
//            System.out.println("kabisat");
//        } else {
//            System.out.println("Bukan kabisat");
//        }

//      Tampilkan pesan "Ganjil" atau "Genap" menggunakan operator ternary.
//        Integer nilai = 19;
//        String msg = nilai % 2 == 0 ? "Bilangan Genap" : "Bilangan Ganjil";
//        System.out.println(msg);

////        Gunakan if-else if statement untuk menentukan grade A, B, C, D, atau E berdasarkan nilai tertentu.
//        int testScore = 60;
//        if (testScore >= 90) {
//            System.out.println("Grade A");
//        } else if (testScore > 79) {
//            System.out.println("Grade B");
//        } else if (testScore > 69) {
//            System.out.println("Grade C");
//        } else if (testScore > 59) {
//            System.out.println("Grade D");
//        } else {
//            System.out.println("Grade E");
//        }

//        Buat program yang menentukan apakah suatu bilangan bulat adalah bilangan positif, negatif, atau nol.
//        int number = -1;
//        String msg;
//        String noun = " Bilangan";
//        if (number > 0) {
//            msg = number + noun + " Positif";
//        } else if (number == 0) {
//            msg = number + noun + " nol";
//        } else {
//            msg = number + noun + " Negatif";
//        }
//        System.out.println(msg);

////        Buat program yang menentukan jenis bentuk geometri berdasarkan jumlah sisi.
//        int side = 4;
//        String geometry;
//        switch (side){
//            case 1:geometry="its a Line";break;
//            case 2:geometry="Its a Corner";break;
//            case 3:geometry="its a Triangle";break;
//            case 4:geometry="its a Quadangle";break;
//            default: geometry="Many shape bruh";
//        }
//        System.out.println(geometry);

//        Buat program yang menentukan apakah suatu bilangan adalah bilangan prima atau bukan.
        int number = 12;
        String isPrimeMsg = isPrime(number) ? "prima" : "bukan";
        System.out.println(isPrimeMsg);

    }

    public static boolean isPrime(int numb) {
        for (int i = 2; i <= numb; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }
}