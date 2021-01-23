package com.hasanli.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Contents {
    private Integer id;
    private String contentHeader;
    private String contentBody;
    private String contentPic;
    private Timestamp postedTime;
    private Admins adminsByContentCreator;
    private Categories categoriesByContentCategory;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content_header")
    public String getContentHeader() {
        return contentHeader;
    }

    public void setContentHeader(String contentHeader) {
        this.contentHeader = contentHeader;
    }

    @Basic
    @Column(name = "content_body")
    public String getContentBody() {
        return contentBody;
    }

    public void setContentBody(String contentBody) {
        this.contentBody = contentBody;
    }

    @Basic
    @Column(name = "content_pic")
    public String getContentPic() {
        return contentPic;
    }

    public void setContentPic(String contentPic) {
        this.contentPic = contentPic;
    }

    @Basic
    @Column(name = "posted_time")
    public Timestamp getPostedTime() {
        return postedTime;
    }

    public void setPostedTime(Timestamp postedTime) {
        this.postedTime = postedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contents contents = (Contents) o;
        return Objects.equals(id, contents.id) &&
                Objects.equals(contentHeader, contents.contentHeader) &&
                Objects.equals(contentBody, contents.contentBody) &&
                Objects.equals(contentPic, contents.contentPic) &&
                Objects.equals(postedTime, contents.postedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contentHeader, contentBody, contentPic, postedTime);
    }

    @ManyToOne
    @JoinColumn(name = "content_creator", referencedColumnName = "id", nullable = false)
    public Admins getAdminsByContentCreator() {
        return adminsByContentCreator;
    }

    public void setAdminsByContentCreator(Admins adminsByContentCreator) {
        this.adminsByContentCreator = adminsByContentCreator;
    }

    @ManyToOne
    @JoinColumn(name = "content_category", referencedColumnName = "id", nullable = false)
    public Categories getCategoriesByContentCategory() {
        return categoriesByContentCategory;
    }

    public void setCategoriesByContentCategory(Categories categoriesByContentCategory) {
        this.categoriesByContentCategory = categoriesByContentCategory;
    }
}
