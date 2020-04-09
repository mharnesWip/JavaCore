import Automobile.TwoWheeler.*;

public class RunVehicle {
    public static void main(String args[]){
        Hero hero_car = new Hero();
        Honda honda_car = new Honda();

        System.out.println("Hero Information:");
        System.out.println("Model - " + hero_car.modelName());
        System.out.println("Registration - " + hero_car.registrationNumber());
        System.out.println("Owners Name - " + hero_car.ownerName());
        System.out.println("Speed - " + hero_car.speed());
        hero_car.radio(96.9);
        System.out.println();
        System.out.println();
        System.out.println("Honda Information:");
        System.out.println("Model - " + honda_car.modelName());
        System.out.println("Registration - " + honda_car.registrationNumber());
        System.out.println("Owners Name - " + honda_car.ownerName());
        System.out.println("Speed - " + honda_car.speed());
        System.out.println("CD Track - " + honda_car.cdplayer(5));
    }
}
