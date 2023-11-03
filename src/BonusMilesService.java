public class BonusMilesService {

    public int calculate(int price) {
        int countMiles = price / 20;
        return countMiles;
    }
}