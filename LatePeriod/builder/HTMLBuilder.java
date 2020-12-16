package builder;

import java.io.*;
public class HTMLBuilder implements Builder{
    private String filename;
    private PrintWriter writer;
    public void makeTitle( String title ){
        filename = title + ".html";
        try{
            writer = new PrintWriter( new FileWriter( filename ) );
        } catch( IOException e ){
            e.printStackTrace();
        }
        writer.println("<!DOCTYPE html><HTML><HEAD><meta charset=\"utf-8\"/><TITLE>" + title + "</TITLE></HEAD><BODY>");
        writer.println("<H1>『" + title + "』</H1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<h2>■"+str+"</h2>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for(String data:items) {
            writer.println("<li>"+data+"</li>");
        }
        writer.println("</ul>");

    }

    //makeTitle,makeString, makeItems 省略 自分で作ってみよう
    public void close(){
        writer.println("</BODY></HTML>");
        writer.close();
    }
    public String getResult(){
        return filename;
    }
}
