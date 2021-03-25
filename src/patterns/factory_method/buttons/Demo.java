package patterns.factory_method.buttons;

public class Demo {
    public static Dialog dialog;

    public static void main(String[] args) {
        configure();
    }

    static void configure() {
        boolean IOS = true;
        if(IOS) {
            dialog = new AndroidDialog();
        } else {
            dialog = new IOSDialog();
        }
    }

    static void runProgram() {
        dialog.renderWindowsDialog();
    }

}
