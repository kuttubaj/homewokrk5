import java.sql.SQLOutput;

//...
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamaage(150);
        boss.setHealth(600);
        boss.setBarrier("Золотая броня");
        System.out.println("жизнь босса: " + boss.getHealth());
        System.out.println("урон босса: " + boss.getDamaage());
        System.out.println("Тип защиты босса: " + boss.getBarrier());
    }
}
