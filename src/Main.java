/**
 * Created by Andriy on 1/19/2017.
 */
public class Main {
    public static void main(String [ ] args){
        double arr[] = {-1.0};
        TemperatureSeriesAnalysis tempA = new TemperatureSeriesAnalysis(arr);
        System.out.println(tempA.average());
    }
}
