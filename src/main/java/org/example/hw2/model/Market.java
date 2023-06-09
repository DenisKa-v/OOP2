package org.example.hw2.model;

public class Market implements MarketInterface {
    private Integer number;
    private GeneratorBaseNotebook baseMarket;

    public Market(Integer number) {
        this.number = number;
        this.baseMarket = new GeneratorBaseNotebook(this.number);
    }

    @Override
    public void addToMarket(Integer index, Notebook notebook) {
        baseMarket.put(index, notebook);
    }

    @Override
    public void removeFromMarket(Integer index) {
        baseMarket.remove(index);
    }

    @Override
    public String toStringMarket() {
        return "Market{" +
                "base=" + baseMarket +
                '}';
    }
}
