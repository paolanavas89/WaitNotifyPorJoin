package com.company;

import java.util.ArrayList;

public class Main {
    public static final ArrayList<String> barraDelBar = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException{
        try {
          while (true) {
              Cliente cliente = new Cliente();
              Camarero camarero = new Camarero();
              camarero.start();
              camarero.join();
              cliente.start();
              cliente.join();

          }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
