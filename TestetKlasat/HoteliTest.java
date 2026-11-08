public class HoteliTest {
    public static void main(String[] args) {
        try {
            // 1. Testojmë krijimin e Hotelit me Yje
            HotelimeYje hotelYje = new HotelimeYje("Swiss Diamond", "Prishtinë", 120.0, true, 5);
            System.out.println(" Hoteli me yje u krijua me sukses!");
            System.out.println("Numri i yjeve: " + hotelYje.getNumriYjeve() + " ⭐");

            System.out.println("----------------------------------------");

            // 2. Testojmë krijimin e Resortit All Inclusive
            ResortiAllInclusive resort = new ResortiAllInclusive("Maxx Royal", "Antalya", 350.0, true, true);
            System.out.println(" Resorti All Inclusive u krijua me sukses!");
            System.out.println("Ka plazh privat: " + (resort.isKaPlazhPrivat() ? "Po" : "Jo"));

        } catch (IllegalArgumentException e) {
            System.out.println(" Gabim gjatë validimit: " + e.getMessage());
        }
    }
}

