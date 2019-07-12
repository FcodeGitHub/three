package com.qfedu.ssm.pojo;

public class Area {

    private int id;
    private int code;
    private int right;
    private int left;
    private String name;
    private Integer parent_id;
    private int level;

    public Area() {
    }

    public Area(int id, int code, int right, int left, String name, Integer parent_id, int level) {
        this.id = id;
        this.code = code;
        this.right = right;
        this.left = left;
        this.name = name;
        this.parent_id = parent_id;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", code=" + code +
                ", right=" + right +
                ", left=" + left +
                ", name='" + name + '\'' +
                ", parent_id=" + parent_id +
                ", level=" + level +
                '}';
    }
}
