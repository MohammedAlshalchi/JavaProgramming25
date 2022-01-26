package practice_01_26_2022.inheritance;

public class Instagram extends MobileApp{
    public Instagram(String version) {
        super("Instagram", version);// should be first
        System.out.println("something");
    }

  public void postPhoto (){
      System.out.println("Posting Photo");
  }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        System.out.println("Using Instagram");
        postPhoto();// to call object NO need to put first

    }
}
