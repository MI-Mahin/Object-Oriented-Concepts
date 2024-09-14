package org.example;
@DevelopmentHistory
public class Course {
    private final String code;
    private final String name;
    private final int credit;
    private final String type;

    @DevelopmentHistoryWithReviewer
    public Course(String code, String name, int credit, String type) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getType() {
        return type;
    }
}