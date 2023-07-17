class HomeAutomationDemo {

    public static void main(String[] args) {

        Controller controller = new Controller();
        Light light = new Light();

        Command2 lightsOn = new LightOnCommand(light);
        Command2 lightsOff = new LightOffCommand(light);

        controller.setCommand(lightsOn);
        controller.executeCommand();

        controller.setCommand(lightsOff);
        controller.executeCommand();
    }
}


/*
* Command (abstract)
* */
interface Command {
    void execute();
}

/*
 * Concrete command
 * */
class LightOnCommand implements Command2 {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}

/*
* Concrete command
* */
class LightOffCommand implements Command2 {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}

/*
* Receiver
* */
class Light {

    public void lightOn() {
        System.out.println("Turn on Light");
    }

    public void lightOff() {
        System.out.println("Turn off Light");
    }
}

/*
* Controller
* */
class Controller {

    private Command2 command;

    public void setCommand(Command2 command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}