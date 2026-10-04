package bridge;

public abstract class CarInformationView {
    protected final CarInformationRenderer renderer;

    protected CarInformationView(CarInformationRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract void display();
}
