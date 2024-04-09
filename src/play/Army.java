package play;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Knight> knights;
    private List<Infantry> infantry;

    public Army() {
        this.knights = new ArrayList<>();
        this.infantry = new ArrayList<>();
    }

    public void addKnight(Knight knight) {
        knights.add(knight);
    }

    public void addInfantry(Infantry infantry) {
        this.infantry.add(infantry);
    }

    public List<Knight> getKnights() {
        return knights;
    }

    public List<Infantry> getInfantry() {
        return infantry;
    }
}
