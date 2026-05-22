import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GuildSystem {

    public static void main(String[] args) {

        // =========================
        // SET (Pencegah ID Dobel)
        // =========================
        HashSet<String> registeredID = new HashSet<>();

        registeredID.add("A01");
        registeredID.add("A02");
        registeredID.add("A01"); // otomatis ditolak karena duplicate

        // =========================
        // LIST (History Login)
        // =========================
        ArrayList<String> loginHistory = new ArrayList<>();

        loginHistory.add("A01 logged in");
        loginHistory.add("A02 logged in");

        // =========================
        // MAP (Database Cepat)
        // =========================
        HashMap<String, String> memberJob = new HashMap<>();

        memberJob.put("A01", "Sniper");
        memberJob.put("A02", "Healer");

        // =========================
        // OUTPUT
        // =========================

        // Menampilkan jumlah ID
        System.out.println("Jumlah Registered ID: " + registeredID.size());

        // Menampilkan isi login history
        System.out.println("\nLogin History:");

        for (String history : loginHistory) {
            System.out.println(history);
        }

        // Method get() digunakan untuk mengambil value berdasarkan key tertentu secara cepat
        String job = memberJob.get("A02");

        System.out.println("\nJob A02: " + job);
    }
}