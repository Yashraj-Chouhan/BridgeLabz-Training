package annotations.deprecated;
public class DeprecatedTest {

    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature(); // ⚠️ Compiler warning
        api.newFeature();
    }
}
