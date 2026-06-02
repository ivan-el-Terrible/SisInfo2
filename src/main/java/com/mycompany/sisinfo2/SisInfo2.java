package com.mycompany.sisinfo2;

import interfaces.PantallaPrincipal;

public class SisInfo2 {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> {
            new PantallaPrincipal();
        });
    }
}