package Ubungbeispiele_1;

import Himmelsrichtung.HimmelsrichtungEnum;

public class LabyrintTile {
    DirectionEnum direction;

    public LabyrintTile() {
    }

    public LabyrintTile(DirectionEnum direction) {
        this.direction = direction;
    }

    public DirectionEnum getRichtungTur() {
        return this.direction;
    }

    public void setRichtungTur(DirectionEnum direction) {
        this.direction = direction;
    }
}
