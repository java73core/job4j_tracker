package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        JSONReport report1 = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        String text1 = report1.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println(text1);
    }
}