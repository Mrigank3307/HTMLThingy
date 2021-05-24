public class Weather {
    double temp;
    boolean rain;
    public Weather (double temperature, boolean raining) {
        temp = temperature;
        rain = raining;
        System.out.println(checkApparel());
    }

    public String checkApparel () {
        if (temp < 25) {
            if (rain) {
                return "It's cold and raining, Take a jacket and a raincoat";
            }
            else {
                return "It's cold, Take a jacket";
            }
        }
        else {
            if (rain) {
                return "Take a raincoat";
            }
            else {
                return "It's warm, take something comfortable";
            }
        }
    }
    public static void main(String[] args) {
        Weather first = new Weather (34,true);
        Weather second = new Weather (22, false);

       /* System.out.println(first.checkApparel());
        System.out.println(second.checkApparel()); */

    }
}
