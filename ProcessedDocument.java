public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf = registry.createPdf();
        pdf.open();
        System.out.println(pdf);
        System.out.println();

        Document text = registry.createText();
        text.open();
        System.out.println(text);
        System.out.println();

        Document spreadsheet = registry.createSpreadsheet();
        spreadsheet.open();
        System.out.println(spreadsheet);
        System.out.println();

        Document summaryPdf = registry.createPdfDocument("summary_report.pdf", 30);
        summaryPdf.open();
    }
}
