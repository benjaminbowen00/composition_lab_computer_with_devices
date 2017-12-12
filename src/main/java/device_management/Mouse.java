package device_management;

import behaviours.IInput;

public class Mouse implements IInput {

    String type;
    int numberButtons;

    public Mouse(String type, int numberButtons) {
        this.type = type;
        this.numberButtons = numberButtons;
    }

    public String click(){
        return "You clicked";
    }

    public String move(){
        return "Whooosh!";
    }

    @Override
    public String sendData(String data) {
        return "You clicked and sent " + data;
    }
}
