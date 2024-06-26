package edu.westminstercollege.cmpt355.minijava;

import edu.westminstercollege.cmpt355.minijava.node.Node;

public class SyntaxException extends Exception {
    private Node node;

    public SyntaxException() {
        super();
    }

    public SyntaxException(String message) {
        super(message);
    }

    public SyntaxException(String message, Throwable cause) {
        super(message, cause);
    }

    public SyntaxException(Throwable cause) {
        super(cause);
    }

    public SyntaxException(Node node){
        this.node = node;
    }

    public SyntaxException(Node node, String message){
        super(message);
        this.node = node;
    }

    public Node getNode(){
        return node;
    }

    protected SyntaxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
