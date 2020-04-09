package Automobile.TwoWheeler;

public class Hero extends Automobile.Vehicle {
    int speed;
    double radio_station;

    public Hero(){
        super();
        model_name = "Hero";
        reg_number = "2038gp";
        owner_name = "Juan";
        speed = 100;
        radio_station = 93.3;
    }

    public int speed(){
        return speed;
    }

    public void radio(double input){
        radio_station = input;
        System.out.println("Radio station - " + radio_station);
    }
}
