package com.example.websiteapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "priority")
    private int priority;

    @Column(name = "title")
    private String title;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @Column(name = "detail")
    private String detail;

    @Column(name = "lang_id")
    private int langId;

    @Column(name = "is_team_work")
    private int isTeamWork;

    @Column(name = "url")
    private String url;

    @Column(name = "other_detail")
    private String otherDetail;

    public Project() {}

    public Project(int id, int priority, String title, String name, String image, String detail, int langId, int isTeamWork, String url, String otherDetail) {
        this.id = id;
        this.priority = priority;
        this.title = title;
        this.name = name;
        this.image = image;
        this.detail = detail;
        this.langId = langId;
        this.isTeamWork = isTeamWork;
        this.url = url;
        this.otherDetail = otherDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getLangId() {
        return langId;
    }

    public void setLangId(int langId) {
        this.langId = langId;
    }

    public int getIsTeamWork() {
        return isTeamWork;
    }

    public void setIsTeamWork(int isTeamWork) {
        this.isTeamWork = isTeamWork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOtherDetail() {
        return otherDetail;
    }

    public void setOtherDetail(String otherDetail) {
        this.otherDetail = otherDetail;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", priority=" + priority +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", detail='" + detail + '\'' +
                ", langId=" + langId +
                ", isTeamWork=" + isTeamWork +
                ", url='" + url + '\'' +
                ", otherDetail='" + otherDetail + '\'' +
                '}';
    }
}
