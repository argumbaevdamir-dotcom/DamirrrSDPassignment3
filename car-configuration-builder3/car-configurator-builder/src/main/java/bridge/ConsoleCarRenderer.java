package bridge;

public class ConsoleCarRenderer implements CarInformationRenderer {
    @Override
    public void renderTitle(String title) {
        System.out.println("=== " + title + " ===");
    }

    @Override
    public void renderLine(String label, String value) {
        System.out.println(label + ": " + value);
    }
}
