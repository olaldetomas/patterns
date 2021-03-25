package patterns.factory_method.buttons;

public class AndroidDialog extends Dialog {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
