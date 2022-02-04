package visitor.two;

import java.util.ArrayList;
import java.util.List;

//object structure
public class Person implements Asset {
    private List<Asset> assets = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
        for (Asset asset : assets) {
            asset.accept(visitor);
        }
    }

    public List<Asset> getAssets() {
        return assets;
    }
}
