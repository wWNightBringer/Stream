package HomeWork1.classes;

import HomeWork1.Decision;
import HomeWork1.Employee;
import HomeWork1.ReadFromFile;

import java.io.IOException;

public class EarnMan implements Decision {
    public ReadFromFile streamApi;

    public EarnMan() throws IOException {
        streamApi = new ReadFromFile();
    }

    @Override
    public void decide() {
        long a = streamApi.getListEmployee().stream()
                .filter(e -> e.getEarn() > 10000)
                .count();
        System.out.println("Earn more then 10000: " + a);
    }
}
