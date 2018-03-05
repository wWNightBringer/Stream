package HomeWork1.classes;

import HomeWork1.Decision;
import HomeWork1.Employee;
import HomeWork1.ReadFromFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class IntemidiateEarnWomen implements Decision {
    public ReadFromFile streamApi;

    public IntemidiateEarnWomen() throws IOException {
        streamApi = new ReadFromFile();
    }

    @Override
    public void decide() {
        double a = streamApi.getListEmployee().stream()
                .filter(e -> (LocalDate.now().getYear() - e.getBirthday().getYear()) > 40)
                .mapToInt(e -> e.getEarn()).average().getAsDouble();
        System.out.println("Average earn all women who oldest then 40 years: " + a);
    }
}
