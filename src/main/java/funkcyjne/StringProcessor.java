package funkcyjne;

public class StringProcessor {

    public StringProcessor() {
        stringOperation = input -> input;
    }

    private StringOperation stringOperation;

    public String process(String input) {
        return stringOperation.operation(input);
    }

    public void setStringOperation(StringOperation stringOperation) {
        this.stringOperation = stringOperation;
    }
}
