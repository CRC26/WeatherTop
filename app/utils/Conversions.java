package utils;

public class Conversions {

    public static String weatherCodeToStr(int code) {
        String codeString;
        switch (code) {
            case 100:
                codeString = "Clear";
                break;
            case 200:
                codeString = "Partial Cloud";
                break;
            case 300:
                codeString = "Cloudy";
                break;
            case 400:
                codeString = "Light Showers";
                break;
            case 500:
                codeString = "Heavy Showers";
                break;
            case 600:
                codeString = "Rain";
                break;
            case 700:
                codeString = "Snow";
                break;
            case 800:
                codeString = "Thunder";
                break;
            default:
                codeString = "Invalid code";
                break;
        }
        return codeString;
    }
    public static float celsiusToFahrenheit(double temp){
         float Fahrenheit, Celsius;
            Celsius= 13;
            Fahrenheit =((Celsius*9)/5)+32;
            return Fahrenheit;

        }
//pow() is used to calculate a number raise to the power of some other number. This function accepts two parameters
// and returns the value of first parameter raised to the second parameter.
//The return type of pow() method is double.

    public static double windChill(double temp, double windSpeed){
       double windChill;
           windChill = 13.12 + 0.6215 * temp - 11.37 * Math.pow(windSpeed,0.16) + 0.3965 * temp * Math.pow(windSpeed, 0.16);
           return windChill;

    }

    public static String kmhToBeaufort(double windSpeed){
        String kmhToBeaufort;

        if (windSpeed >= 117) {
            kmhToBeaufort = "11";
        } else if (windSpeed >= 102) {
            kmhToBeaufort = "10";
        } else if (windSpeed >= 88) {
            kmhToBeaufort = "9";
        } else if (windSpeed >= 74) {
            kmhToBeaufort = "8";
        } else if (windSpeed >= 61) {
            kmhToBeaufort = "7";
        } else if (windSpeed >= 49) {
            kmhToBeaufort = "6";
        } else if (windSpeed >= 38) {
            kmhToBeaufort = "5";
        } else if (windSpeed >= 28) {
            kmhToBeaufort = "4";
        } else if (windSpeed >= 19) {
            kmhToBeaufort = "3";
        } else if (windSpeed >= 11) {
            kmhToBeaufort = "2";
        } else {
            kmhToBeaufort= "1";
        }
        return (kmhToBeaufort);
    }

    public static String kmhToLabel(double windSpeed){
        String kmhToLabel;

        if (windSpeed >= 117) {
            kmhToLabel = "Violent storm";
        } else if (windSpeed >= 102) {
            kmhToLabel = "Strong Storm";
        } else if (windSpeed >= 88) {
            kmhToLabel = "Severe Gale";
        } else if (windSpeed >= 74) {
            kmhToLabel = "Gale";
        } else if (windSpeed >= 61) {
            kmhToLabel = "Near Gale";
        } else if (windSpeed >= 49) {
            kmhToLabel = "Strong Breeze";
        } else if (windSpeed >= 38) {
            kmhToLabel = "Fresh Breeze";
        } else if (windSpeed >= 28) {
            kmhToLabel = "Moderate Breeze";
        } else if (windSpeed >= 19) {
            kmhToLabel = "Gentle Breeze";
        } else if (windSpeed >= 11) {
            kmhToLabel = "Light Air";
        } else {
            kmhToLabel= "calm";
        }
        return (kmhToLabel);
    }
    public static String compassToDegree(int windDirection) {
        String compassToDegree;
        if (windDirection >= 326.25) {
            compassToDegree = "North North West";
        } else if (windDirection >= 303.75) {
            compassToDegree = "North West";
        } else if (windDirection >= 281.25) {
            compassToDegree = "West North West";
        } else if (windDirection >= 258.75) {
            compassToDegree = "West";
        } else if (windDirection >= 236.25) {
            compassToDegree = "West South West";
        } else if (windDirection >= 213.75) {
            compassToDegree = "South West";
        } else if (windDirection >= 191.25) {
            compassToDegree = "South South West";
        } else if (windDirection >= 168.75) {
            compassToDegree = "South";
        } else if (windDirection >= 146.25) {
            compassToDegree = "South South East";
        } else if (windDirection >= 123.75) {
            compassToDegree = "South East";
        } else if (windDirection >= 101.25) {
            compassToDegree = "East South East";
        } else if (windDirection >= 78.75) {
            compassToDegree = "East";
        } else if (windDirection >= 56.25) {
            compassToDegree = "East North East";
        } else if (windDirection >= 33.75) {
            compassToDegree = "North East";
        } else if (windDirection >= 11.25) {
            compassToDegree = "North North East";
        } else {
            compassToDegree = "North";
        }
        return compassToDegree;
    }

}
