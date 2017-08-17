package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
        ForumPost post = new ForumPost(postBody, author);
        posts.add(post);
    }

    public void addComment(ForumPost forumPost, ForumComment forumComment) {
        ForumComment comment = new ForumComment(forumPost, forumComment.getCommentBody(), forumComment.getAuthor());
        comments.add(comment);
    }

    public int getPostsQuantity() {
        return posts.size();
    }

    public int getCommentsQuantity() {
        return comments.size();
    }

    public ForumPost getPost(int postNumber) {
        ForumPost post = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            post = posts.get(postNumber);
        }
        return post;
    }

    public ForumComment getComment(int commentNumber) {
        ForumComment comment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()){
            comment = comments.get(commentNumber);
        }
        return comment;
    }

    public boolean removePost(ForumPost thePost) {
        boolean result = false;
        if (posts.contains(thePost)){
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment) {
        boolean result = false;
        if (comments.contains(theComment)){
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}