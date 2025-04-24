public class TextDocument implements Document {
    int filePath;
    String encoding;
    int wordCount;

    public TextDocument(int filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }

    @Override
    public Document clone() {
        return new TextDocument(filePath, encoding, wordCount);
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
    }

    @Override
    public String getType() {
        return "Text";
    }
}