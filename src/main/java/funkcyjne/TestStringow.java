package funkcyjne;

public class TestStringow {
    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor();
        String tekst = "jestem super developerem";
        System.out.println(stringProcessor.process(tekst));

        StringOperation duzeLitery = String::toUpperCase;  //input -> input.toUpperCase()
        StringOperation maleLitery = String::toLowerCase;  // input -> input.toLowerCase()
        StringOperation trzyPierwszeLitery = input -> input.substring(0,3);

        stringProcessor.setStringOperation(trzyPierwszeLitery);
        System.out.println(stringProcessor.process(tekst));
    }
}
