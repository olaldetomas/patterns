package patterns.factory_method.buttons;

public class IOSDialog extends Dialog {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
