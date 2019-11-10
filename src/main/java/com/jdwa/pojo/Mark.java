package com.jdwa.pojo;

public class Mark {
    private Integer id;

    private Integer uid;

    private String tm;

    private String examName;

    private Integer chinese;

    private Integer math;

    private Integer politics;

    private Integer history;

    private Integer geography;

    private Integer physic;

    private Integer chemistry;

    private Integer biology;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm == null ? null : tm.trim();
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    public Integer getChinese() {
        return chinese;
    }

    public void setChinese(Integer chinese) {
        this.chinese = chinese;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getPolitics() {
        return politics;
    }

    public void setPolitics(Integer politics) {
        this.politics = politics;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Integer getGeography() {
        return geography;
    }

    public void setGeography(Integer geography) {
        this.geography = geography;
    }

    public Integer getPhysic() {
        return physic;
    }

    public void setPhysic(Integer physic) {
        this.physic = physic;
    }

    public Integer getChemistry() {
        return chemistry;
    }

    public void setChemistry(Integer chemistry) {
        this.chemistry = chemistry;
    }

    public Integer getBiology() {
        return biology;
    }

    public void setBiology(Integer biology) {
        this.biology = biology;
    }
}