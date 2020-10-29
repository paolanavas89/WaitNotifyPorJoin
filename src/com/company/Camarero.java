package com.company;

public class Camarero extends Thread {
    @Override
    public void run() {

        try {
                String cocacola = "Coca-Cola";
                Main.barraDelBar.add(cocacola);
                System.out.println("Soy el camarero y Voy a añadir una " + cocacola);

                String fanta = "Fanta";
                Main.barraDelBar.add(fanta);
                System.out.println("Soy el camarero y Voy a añadir una " + fanta);

                String vino = "Vino";
                Main.barraDelBar.add(vino);
                System.out.println("Soy el camarero y Voy a añadir una " + vino);
                sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}