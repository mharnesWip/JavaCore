package Automobile;

public abstract class Vehicle {
    protected String model_name, reg_number, owner_name;

    public Vehicle(){
        model_name = "NA";
        reg_number = "NA";
        owner_name = "NA";
    }

    public String modelName(){
        return model_name;
    }
    public String registrationNumber(){
        return reg_number;
    }
    public String ownerName(){
        return owner_name;
    }
}
