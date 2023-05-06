public class Dynasty {
    public static void main (String[] args){
        int liWarrior = 13;
        int liArcher = 24;
        int liRider = 46;

        int minWarrior = 9;
        int minArcher = 35;
        int minRider = 12;

        int liPower = (liWarrior+liArcher+liRider)*860;
        int minPower = (int) (liPower*1.5);
        System.out.println("Li's power is "+liPower+", Min's power is "+minPower);
    }
}
