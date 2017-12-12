package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

    String type;
    int numberButtons;

    public Keyboard(String type, int numberButtons) {
        this.type = type;
        this.numberButtons = numberButtons;
    }

    public String type(String input){
        return "You typed: " + input;
    }

    @Override
    public String sendData(String data) {
        return "You typed and sent " + data;
    }
}
