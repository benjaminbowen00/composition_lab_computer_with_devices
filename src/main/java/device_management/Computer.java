package device_management;

import behaviours.IInput;
import behaviours.IOutput;

import java.util.ArrayList;

public class Computer {
    private int ram;
    private int hddSize;

    private IOutput outputDevice;
    private ArrayList<IInput> inputDevices;

    public Computer(int ram, int hddSize, IOutput outputDevice, ArrayList<IInput> inputDevices) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputDevice = outputDevice;
        this.inputDevices = inputDevices;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public IOutput getOutputDevice() {
        return this.outputDevice;
    }

    public String outputData(String data) {
        return this.outputDevice.outputData(data);
    }

    public void setOutputDevice(IOutput outputDevice) {
        this.outputDevice = outputDevice;
    }

//    public IInput getFirstInputDevice() {
//        return inputDevices.get(0);
//    }

    public String getinputDataKeyboard(String data) {
        for(IInput device : inputDevices){
            if(device instanceof Keyboard){
                return device.sendData(data);
            }
        }
        return null;
    }

    public String getinputData(String data, Class inputDevice) {
        for(IInput device : inputDevices){
            if(device.getClass() == inputDevice){
                return device.sendData(data);
            }
        }
        return null;
    }

    public void setInputDevices(ArrayList<IInput> inputDevices) {
        this.inputDevices = inputDevices;
    }
}
