package practice_01_26_2022.inheritance;

public class AppObject {
    public static void main(String[] args) {
     Instagram instagram = new Instagram("5.6") ;
        System.out.println("Instagram "+instagram);
        instagram.useTheApp(10);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Discord discord =new Discord("7.6");

        discord.useTheApp(100);
        System.out.println("Discord "+discord);













    }
}
