package com.company;

public class Main {

    public static void main(String[] args) {

        VendingMachine machine = Main.setupMachine();
        machine.getStock();

        machine.buyItem("Coke",5);
        machine.buyItem("Apple",2);

        System.out.println("Total money: $" + machine.getMoney());

        machine.addItem("Coke",30);
        machine.addItem("Granola Bar", 10);
        machine.getStock();

    }

    public static VendingMachine setupMachine() {
        VendingMachine machine = new VendingMachine();

        Item coke = new Item("Coke", 20, 0.99f);
        Item apple = new Item("Apple", 10, 0.79f);
        Item granolaBar = new Item("Granola Bar", 15, 1.99f);

        machine.addNewItem(coke);
        machine.addNewItem(apple);
        machine.addNewItem(granolaBar);

        return machine;
    }
}
