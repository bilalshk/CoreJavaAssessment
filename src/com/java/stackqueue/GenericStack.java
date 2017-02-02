package com.java.stackqueue;

/**
 * Created by bilalshaikh on 2/2/17.
 */
public class GenericStack {
    private int id;
    private String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static GenericStack obj(int id, String data) {
        GenericStack gs = new GenericStack();
        gs.setId(id);
        gs.setData(data);
        return gs;
    }
}
