package patterns.factory_method.buttons;

public class AndroidButton implements Button {

    @Override
    public void render() {
        System.out.println("Render from Android Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! from Android button");
    }
}
