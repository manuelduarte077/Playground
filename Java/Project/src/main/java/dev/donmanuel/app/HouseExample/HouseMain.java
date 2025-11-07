package dev.donmanuel.app.HouseExample;

public class HouseMain {
    public static void main(String[] args) {

        House house = new House();
        house.setDoors(2);
        house.setWindows(6);
        house.setSize(16);

        House myHouse = new House(3, 6, 12);

        System.out.println("La cantidad de Puertas: " + myHouse.getDoors());
        myHouse.openDoor();

        double area = myHouse.calculateArea();
        System.out.println("El area de la casa es: " + area);

    }
}
