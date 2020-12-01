public class DefenseObject implements DefenseObjectInterface{

    private DefenseInterface defenseObject;

    public void setDefenseObject(DefenseInterface defenseObject) {
        this.defenseObject = defenseObject;
    }

    @java.lang.Override
    public void attack() {
        this.defenseObject.attack();
    }

}
