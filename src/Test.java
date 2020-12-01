public class Test {
    public static void main(String arg[]) {
        DefenseInterface bomb = new Bomb();
        DefenseInterface fist = new Fist();
        DefenseInterface boneTrap = new BoneTrap();

        DefenseObject defenseObject = new DefenseObject();

        defenseObject.setDefenseObject(bomb);
        defenseObject.attack();

        defenseObject.setDefenseObject(fist);
        defenseObject.attack();

        defenseObject.setDefenseObject(boneTrap);
        defenseObject.attack();
    }
}
