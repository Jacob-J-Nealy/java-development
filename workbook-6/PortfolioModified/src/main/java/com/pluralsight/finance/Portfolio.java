package com.pluralsight.finance;

import java.util.List;

public class Portfolio {

    // Attributes
    private String name;
    private String owner;
    private List<Valuable> assets;

    // Constructor
    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    private void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double totalValue = 0;
        for (Valuable valuable : assets) {
            totalValue += valuable.getValue();
        }
        return totalValue;
    }

    public Valuable getMostValuable() {

        // Returns null if have no assets
        if (assets.isEmpty()) {
            return null;
        }

        Valuable mostValuableAsset = assets.get(0);
        double highestValue = mostValuableAsset.getValue();

        for (Valuable asset : assets) {
            double assetValue = asset.getValue();
            if (assetValue > highestValue) {
                highestValue = assetValue;
                mostValuableAsset = asset;
            }
        }
        return mostValuableAsset;

    }

}
