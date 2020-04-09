public class RunInstruments extends Instrument{

    public void play() {
        System.out.println("Run Class");
    }

    public String checkInstance(Instrument x){
        String result;

        if(x instanceof Piano){
            result = "Piano";
        }else if(x instanceof Flute){
            result = "Flute";
        }else{
            result = "Guitar";
        }

        return result;
    }

    public static void main(String args[]){
        RunInstruments obj = new RunInstruments();

        Instrument[] arr = new Instrument[10];
        String instanceType;

        for(int i = 0; i < arr.length; i++){
            if(i == 0 || i == 3 || i == 6 || i == 9){
                arr[i] = new Piano();
            }else if(i == 1 || i == 4 || i == 7){
                arr[i] = new Flute();
            }else{
                arr[i] = new Guitar();
            }
        }

        for(int i = 0; i < arr.length; i++){
            instanceType = obj.checkInstance(arr[i]);
            System.out.println("Element " + i + " is of type: " + instanceType);
            arr[i].play();
        }
    }
}

class Piano extends Instrument {
    public void play(){
        System.out.println("Piano is playing tan tan tan tan");
    }
}

class Flute extends Instrument {
    public void play(){
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument {
    public void play(){
        System.out.println("Guitar is playing tin tin tin");
    }
}