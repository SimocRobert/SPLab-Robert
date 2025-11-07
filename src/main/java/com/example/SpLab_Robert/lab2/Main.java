package com.example.SpLab_Robert.lab2;

public class Main {
    public static void main(String[] args) {

        // Creăm o secțiune
        Section cap1 = new Section("Capitolul 1");

        // Adăugăm paragrafe în secțiune
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);

        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);

        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);

        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);

        // Afișăm fără aliniere
        System.out.println("Printing without Alignment\n");
        cap1.print();

        // Setăm strategii diferite de aliniere
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        // Afișăm cu aliniere
        System.out.println("\nPrinting with Alignment\n");
        cap1.print();
    }
}
