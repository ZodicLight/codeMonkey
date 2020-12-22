package com.eyepoppy.memento;

public class Editor {
    private String content;

    public EditorState createState(){
        return new EditorState(content);// reference or composition?
    }

    public void restore(EditorState state){
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }//no use?
}
