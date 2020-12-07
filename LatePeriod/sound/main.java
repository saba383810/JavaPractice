package sound;

public class main {
    public static void main(String[] args) throws Exception {
        PlayClip playClip = new PlayClip("bgm1.wav");
        playClip.play();
        try{Thread.sleep(10000);}catch (Exception e){}
    }
}
