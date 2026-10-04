package bridge;

public class JsonCarRenderer implements CarInformationRenderer {
    private boolean firstLine = true;

    @Override
    public void renderTitle(String title) {
        System.out.println("{");
        System.out.println("  \"title\": \"" + escape(title) + "\",");
        System.out.println("  \"information\": {");
        firstLine = true;
    }

    @Override
    public void renderLine(String label, String value) {
        if (!firstLine) {
            System.out.println(",");
        }
        System.out.print("    \"" + escape(label) + "\": \"" + escape(value) + "\"");
        firstLine = false;
    }

    public void finish() {
        System.out.println();
        System.out.println("  }");
        System.out.println("}");
    }

    private String escape(String value) {
        return value.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
