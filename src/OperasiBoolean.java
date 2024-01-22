public class OperasiBoolean {
    public static void main(String[] args) {
//        operasi boolean && hasil harus bernilai true jika salah satu false hasil akan false

//        syarat membuat sim adalah 18 tahun jika kedua nilai test min 70

//        Integer ahmadAge = 25;
//        Integer ahmadScore = 80;
//
        Integer slametAge = 20;
        Integer slametScore = 65;

        Boolean passAge = slametAge >= 18;
        Boolean passScore = slametScore >= 70;

//        Boolean finalResult = passAge && passScore;
//        Boolean finalResult = passScore || passAge; // OR || jika salah satu nilai true hasil true
        Boolean finalResult = !(passScore || passAge);// NOT ! membalikan keadaan jika hasil true maka akan jadi false
        System.out.println(finalResult);


    }
}
