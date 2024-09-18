package GeoPoliticalZone;

public enum Zone {
    NORTH_CENTRAL ("Benue\nKogi\nKwara\nNasarawa\nNiger\nPlateau\nFederalCapitalTerritory (Abuja)"),
    NORTH_EAST("Adamawa\nBauchi\nBorno\nGombe\nTaraba\nYobe"),
    NORTH_WEST("Jigawa\nKaduna\nKano\nKatsina\nKebbi\nSokoto\nZamfara"),
    SOUTH_EAST("Abia\nAnambra\nEbonyi\nEnugu\nImo"),
    SOUTH_SOUTH("Akwa Ibom\nBayelsa\nCross River\nDelta\nEdo\nRivers"),
    SOUTH_WEST("Ekiti\nLagos\nOgun\nOndo\nOsun\nOyo");


    private final String state;

    Zone(String state) {
        this.state = state;
    }
    public String zones(){
        return state;
    }

}
