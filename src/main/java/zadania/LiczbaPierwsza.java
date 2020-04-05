package zadania;

public class LiczbaPierwsza {
    public static void main(String[] args) {
//        System.out.println(MathUtilitis.czyPierwsza(2));
//        System.out.println(MathUtilitis.czyPierwsza(3));
//        System.out.println(MathUtilitis.czyPierwsza(9));
//        System.out.println(MathUtilitis.czyPierwsza(10));

        int[] tablicaLiczbPierwszych = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        SprawdzatorLiczbPierwszych sprawdzatorLiczbPierwszych = new SprawdzatorLiczbPierwszych(tablicaLiczbPierwszych);
        System.out.println(sprawdzatorLiczbPierwszych.czyPierwsza(20));

    }
}
