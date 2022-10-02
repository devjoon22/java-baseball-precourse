package baseball;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Fitch {

    List<Integer> fitches;


    public Fitch() {
        fitches = new ArrayList<>();

        while (fitches.size() != 3) {
            fitchAdd();
        }
    }

    private void fitchAdd() {
        int fitch = pickNumberInRange(1, 9);

        if (!fitches.contains(fitch)) {
            fitches.add(fitch);
        }
    }

    public List<Integer> getFitches() {
        return fitches;
    }
}
