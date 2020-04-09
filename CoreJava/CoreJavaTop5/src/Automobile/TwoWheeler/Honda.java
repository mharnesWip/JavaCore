package Automobile.TwoWheeler;

public class Honda extends Automobile.Vehicle {
    int speed, cd_player;

    public Honda(){
        super();
        model_name = "Honda";
        reg_number = "2355gp";
        owner_name = "Ronda";
        speed = 70;
        cd_player = 1;
    }

    public int speed(){
        return speed;
    }

    public int cdplayer(int input){
        cd_player = input;
        return cd_player;
    }
}
