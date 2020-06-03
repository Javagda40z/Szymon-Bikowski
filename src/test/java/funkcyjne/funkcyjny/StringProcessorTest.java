package funkcyjne.funkcyjny;

import funkcyjne.StringProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    public void testWhenDefaultStringProcessorIsProcessingInputThenReturnNotModifiedInput(){
        String tekst = "tekst";
        assertEquals(tekst,stringProcessor.process(tekst));
    }

    @Test
    public void testWhenUpperCaseStringProcessorIsProcessingInputThenReturnUpperCaseInput(){
        String tekst = "tekst";
        String upperCasedTekst = "TEKST";
        stringProcessor.setStringOperation(String::toUpperCase);
        assertEquals(tekst.toUpperCase(),stringProcessor.process(tekst));
    }
}