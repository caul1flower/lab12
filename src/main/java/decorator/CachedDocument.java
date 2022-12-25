package decorator;

import lombok.SneakyThrows;

public class CachedDocument implements Document {
    private Document document;
    public String gcsPath;
    public CachedDocument(Document document) {
        this.document = document;
    }

    @Override
    @SneakyThrows
    public String parse() {
        DBConnection dbConnection = DBConnection.getInstance();
        String query = "SELECT text FROM document WHERE filename = '" + gcsPath + "'";
        return "";
    }
}
