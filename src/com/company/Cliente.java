package com.company;

public class Cliente extends Thread{
    @Override
    public void run() {

        try {
                if (!Main.barraDelBar.isEmpty()) {
                    for (int i = 0; i < Main.barraDelBar.size(); i++) {
                        System.out.println("Voy a beberme un " + Main.barraDelBar.get(i));
                    }
                    Main.barraDelBar.remove(0);
                    sleep(1000);

                } else {
                    System.out.println("Espero a que traigan más comida ");

                }


        } catch(InterruptedException e){
                e.printStackTrace();
        }
        }
    }

