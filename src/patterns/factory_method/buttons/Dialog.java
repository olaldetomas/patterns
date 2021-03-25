package patterns.factory_method.buttons;

public abstract class Dialog {

    public void renderWindowsDialog() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
