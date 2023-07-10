package inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        JsonReport jsonReport = new JsonReport();
        System.out.println( jsonReport.generate("name", "body"));
    }
}
