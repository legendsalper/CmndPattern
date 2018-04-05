import java.util.ArrayList;
import java.util.List;


public class PlayWithRemote {

    public static void main(String[] args) {

        ElectronicDevice newDevice = TVRemote.getDevice();
        System.out.println("TV ON BUTTON PRESSED");
        TurnTVOn onCommand = new TurnTVOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        // -----------------------

        System.out.println("TV OFF BUTTON PRESSED");
        TurnTVOff offCommand = new TurnTVOff(newDevice);

        DeviceButton offPressed = new DeviceButton(offCommand);

        offPressed.press();

        //-------------------------

        TurnTVUp volupCommand = new TurnTVUp(newDevice);

        onPressed = new DeviceButton(volupCommand);
        System.out.println("VOLUME UP IS PRESSED 3 TIMES!!!");
        onPressed.press();
        onPressed.press();
        onPressed.press();

        //-------------------------

        Television theTV = new Television();

        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(theTV);
        allDevices.add(theRadio);

        System.out.println("TURN ALL DEVICES OFF BUTTON PRESSED");
        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();

        //-------------------------
        System.out.println("UNDO BUTTON PRESSED");
        turnThemOff.pressUndo();

    }

}
