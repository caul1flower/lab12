package decorator;

public class TimedDocument implements Document{
    private Document document;
    public String gcsPath;

    public TimedDocument(Document document) {
        this.document = document;
    }

    @Override
    public String parse() {
        long start = System.currentTimeMillis();
        String docParsed = document.parse();
        long end = System.currentTimeMillis();
        return ("Parsing time in ms: " + (end - start));
    }
}
