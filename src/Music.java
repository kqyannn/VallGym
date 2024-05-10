public class Music {
    static MusicPlayer bgMusic;
    static SFX soundFX;

    public static void bgMusic() {
        try {
            bgMusic = new MusicPlayer("/assets/music.wav");
            bgMusic.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void sfx() {
        try {
            soundFX = new SFX("/assets/click.wav");
            soundFX.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}