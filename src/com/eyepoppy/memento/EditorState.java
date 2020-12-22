package com.eyepoppy.memento;

public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    } //constructor

    public String getContent() {//getter method?
        return content;
    }
}
