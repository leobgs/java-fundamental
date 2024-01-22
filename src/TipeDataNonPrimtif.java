public class TipeDataNonPrimtif {
    public static void main(String[] args) {

        Integer umur = 24;
        int age = 24;
//        kedau variabel diatas berbeda tipe data non prmitif adalaj object

//        konversi dari primtif ke non primitif
        int age1 = 34;
        Integer ageObjt = age1;
        System.out.println(ageObjt);

        int ageAgain = ageObjt; // kebalkannya

//        mengubah ke tipe data lain namun masih satu rumpun
        short shortAge = ageObjt.shortValue();
        byte byteAge = ageObjt.byteValue(); //panggil nama method nya

        System.out.println(shortAge);
        System.out.println(byteAge);



    }
}
