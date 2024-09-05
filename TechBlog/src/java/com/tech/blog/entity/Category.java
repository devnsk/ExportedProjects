/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.entity;

/**
 *
 * @author ASUS
 */
public class Category {

    private int cid;
    private String name;
    private String description;

    public Category() {
    }

    public Category(int cid, String name, String description) {
        this.cid = cid;
        this.description = description;
        this.name = name;
    }

    public Category(String name, String description) {

        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;

    }

}
