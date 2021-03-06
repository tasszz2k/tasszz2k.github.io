/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tasszz2k.model;

/**
 *
 * @author TASS
 */
public class CommentModel extends AbstractModel<CommentModel> {

    private Long id;
    private String content;
    private Long userId;
    private Long newsId;

    public CommentModel() {
    }

    public CommentModel(Long id, String content, Long userId, Long newsId) {
        this.id = id;
        this.content = content;
        this.userId = userId;
        this.newsId = newsId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

}
