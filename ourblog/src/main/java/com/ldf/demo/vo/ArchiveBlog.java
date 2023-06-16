package com.ldf.demo.vo;

import java.util.Date;

/**
 * @author: LGL
 * @date: 2023/6/16 15:16
 * @code: 愿世间永无Bug!
 * @description:
 */
public class ArchiveBlog {

    private Long id;
    private String title;
    private Date createTime;

    @Override
    public String toString() {
        return "ArchiveBlog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public ArchiveBlog() {
    }
}
