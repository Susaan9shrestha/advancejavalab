package javaproject;

public class BookIssue {
    private int studentId;
    private int bookId;
    private String issueDate;
    private String dueDate;

    public BookIssue(int studentId, int bookId, String issueDate, String dueDate) {
        this.studentId = studentId;
        this.bookId = bookId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
}
}