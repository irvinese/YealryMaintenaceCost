import java.security.spec.RSAOtherPrimeInfo;

public class BooleanVar {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSunny = true;
        boolean isRainingAndSunny = isRaining || isSunny;
        System.out.println("It is raining and sunny at the same time: " + !isRainingAndSunny);

    }
}
