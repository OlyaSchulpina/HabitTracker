package model;

class Habit{
    int id;
    String name;
    boolean status;
    int track;

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}