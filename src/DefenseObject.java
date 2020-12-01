public class DefenseObject {

    private DefenseInterface defenseObject;

    public void setDefenseObject(DefenseInterface defenseObject) {
        this.defenseObject = defenseObject;
    }

    public void attack() {
        this.defenseObject.attack();
    }

}
