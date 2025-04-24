public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf = registry.getPdfPrototype();
        pdf.open();
        System.out.println("Type: " + pdf.getType() + ", File: annual_report_2024.pdf, Author: Acme Corp, Pages: 150\n");

        Document text = registry.getTextDocumentPrototype();
        text.open();
        System.out.println("Type: " + text.getType() + ", Path: meeting_notes.txt, Encoding: UTF-8, Words: 250\n");

        Document spreadsheet = registry.getSpreadsheetPrototype();
        spreadsheet.open();
        System.out.println("Type: " + spreadsheet.getType() + ", Name: sales_data_q1.xlsx, Rows: 1000, Columns: 20\n");

        Document summaryPdf = registry.createPdfCopy("summary_report.pdf", 30);
        summaryPdf.open();
    }
}