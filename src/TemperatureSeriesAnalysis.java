/**
 * Created by Andriy on 1/19/2017.
 */
public class TemperatureSeriesAnalysis {
    public double tempArr[];

    public TemperatureSeriesAnalysis(double[] temperatureSeries) {
        this.tempArr = temperatureSeries;
    }

    public double average() {
        if(tempArr.length == 0){
            throw new IllegalArgumentException("temprature array is empty");
        }
        if(tempArr.length == 1){
            return tempArr[0];
        }
        double average = 0;
        for(double i : tempArr){
            average += i;
        }
        average = average/tempArr.length;
        System.out.println("avarage: "+average);
        return average;
    }

    public double deviation() {
        return 0;
    }

    public double min() {
        if(tempArr.length == 0){
            throw new IllegalArgumentException("temprature array is empty");
        }
        double min = tempArr[0];
        for(double i: tempArr){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public double max() {
        if(tempArr.length == 0){
            throw new IllegalArgumentException("temprature array is empty");
        }
        double max = tempArr[0];
        for(double i: tempArr){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public double findTempClosestToZero() {
        double closest = tempArr[0];
        for(double i: tempArr){
            if(i < closest && i > 0){
                closest = i;
            }
        }
        return closest;
    }

    public double findTempClosestToValue(double tempValue) {
        double closest = tempArr[0];
        for(double i: tempArr){
            if(closest - tempValue >= 0) {
                if (i - tempValue > 0 && i - tempValue < closest - tempValue){
                    closest = i;
                }
                if(i - tempValue < 0 && tempValue - i < closest - tempValue){
                    closest = i;
                }
            }else if(closest - tempValue < 0){
                if (i - tempValue > 0 && tempValue - i < closest - tempValue){
                    closest = i;
                }
            }
        }
        return closest;
    }

    public double[] findTempsLessThen(double tempValue) {
        int count = 0;
        for(double i: tempArr){
            if(i < tempValue){
                count += 1;
            }
        }
        double resArr[] = new double[count];
        count = 0;
        for(double i: tempArr){
            if(i < tempValue){
                resArr[count] = i;
                count += 1;
            }
        }
        return resArr;
    }

    public double[] findTempsGreaterThen(double tempValue) {
        int count = 0;
        for(double i: tempArr){
            if(i > tempValue){
                count += 1;
            }
        }
        double resArr[] = new double[count];
        count = 0;
        for(double i: tempArr){
            if(i > tempValue){
                resArr[count] = i;
                count += 1;
            }
        }
        return resArr;
    }

    public int addTemps(double... temps) {
        double arr[] = new double[tempArr.length + temps.length];
        int count = 0;
        for(double i : tempArr){
            arr[count] = i;
            count ++;
        }
        for(double i : temps){
            arr[count] = i;
            count++;
        }
        tempArr = arr;
        return tempArr.length;
    }
}
