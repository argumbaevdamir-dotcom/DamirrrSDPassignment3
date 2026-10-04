package bridge;

public class CarSummaryView extends CarInformationView {
    private final String model;
    private final String engine;

    public CarSummaryView(CarInformationRenderer renderer, String model, String engine) {
        super(renderer);
        this.model = model;
        this.engine = engine;
    }

    @Override
    public void display() {
        renderer.renderTitle("Car Summary");
        renderer.renderLine("Model", model);
        renderer.renderLine("Engine", engine);
    }
}
