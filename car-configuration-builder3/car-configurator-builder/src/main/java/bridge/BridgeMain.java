package bridge;

public class BridgeMain {
    public static void main(String[] args) {
        CarInformationRenderer consoleRenderer = new ConsoleCarRenderer();
        CarInformationRenderer jsonRenderer = new JsonCarRenderer();

        CarInformationView summary = new CarSummaryView(
                consoleRenderer, "Toyota Camry", "2.5L Hybrid");
        CarInformationView safety = new CarSafetyView(
                consoleRenderer, "Toyota Camry", "5 stars");

        System.out.println("Console implementation:");
        summary.display();
        safety.display();

        System.out.println("\nSwitching the same abstraction to JSON implementation:");
        summary = new CarSummaryView(
                jsonRenderer, "Toyota Camry", "2.5L Hybrid");
        summary.display();
        ((JsonCarRenderer) jsonRenderer).finish();

        System.out.println("\nAnother refined abstraction with JSON implementation:");
        safety = new CarSafetyView(jsonRenderer, "Toyota Camry", "5 stars");
        safety.display();
        ((JsonCarRenderer) jsonRenderer).finish();
    }
}
