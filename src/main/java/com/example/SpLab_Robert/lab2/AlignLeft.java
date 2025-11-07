package com.example.SpLab_Robert.lab2;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(String paragraphText) {
        System.out.println("<< " + paragraphText);
    }
}
