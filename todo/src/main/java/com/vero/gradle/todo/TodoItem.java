package com.vero.gradle.todo;

public class TodoItem {
    //代办事项名称
    private String name;

    //已完成
    private boolean hasDone;

    @Override
    public String toString() {
        return "TodoItem{" +
                "name='" + name + '\'' +
                ", hasDone=" + hasDone +
                '}';
    }

    public TodoItem(String name) {
        this.name = name;
    }

    public TodoItem(String name, boolean hasDone) {
        this.name = name;
        this.hasDone = hasDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDone() {
        return hasDone;
    }

    public void setHasDone(boolean hasDone) {
        this.hasDone = hasDone;
    }
}

