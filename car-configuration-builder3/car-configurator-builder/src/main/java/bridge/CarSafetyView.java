package bridge;

public class CarSafetyView extends CarInformationView {
    private final String model;
    private final String safetyRating;

    public CarSafetyView(CarInformationRenderer renderer, String model, String safetyRating) {
        super(renderer);
        this.model = model;
        this.safetyRating = safetyRating;
    }

    @Override
    public void display() {
        renderer.renderTitle("Car Safety");
        renderer.renderLine("Model", model);
        renderer.renderLine("Safety rating", safetyRating);
    }
}
