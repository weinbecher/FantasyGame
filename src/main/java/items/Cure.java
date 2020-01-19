package items;

import behaivours.IEquip;

public class Cure implements IEquip {

    CureType  cureType;
    public Cure(CureType cureType) {
        this.cureType = cureType;
    }


}
