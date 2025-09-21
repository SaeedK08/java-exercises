package kindergarten_garden;

public class KindergartenGarden {
    private KindergartenGarden() {

    }

    public static Plant[] getPlants(char[] garden, String name) {
        int plantIndex = (name.toUpperCase().charAt(0) - 'A') * 2;
        int counter = 0;
        Plant[] plants = new Plant[4];

        for(int i = 0; i < garden.length; i++) {
            if (i == garden.length / 2) {
                plantIndex += garden.length/2;
            }
            if (i == plantIndex || i == plantIndex+1) {
                plants[counter++] = decodePlant(garden[i]);
            }
        }
        return plants;
    }
    
    private static Plant decodePlant(char ch) {
        switch(ch) {
            case 'G': return Plant.Grass;
            case 'C': return Plant.Clover;
            case 'R': return Plant.Radish;
            case 'V': return Plant.Violet;
            default: return null;
        }
    }
    
}


