package Tema4.Boletin5_2_3;

public class MusicApp {
    public void startMusic(MusicPlayer[] players) {
        for (int i = 0; i < players.length; i++) {
            players[i].play();
            players[i].stop();
        }
    }

    public static void main(String[] args) {
        MusicPlayer[] players = new MusicPlayer[]{new Spotify(), new ITunes(), new MP3Player()};
        MusicApp app = new MusicApp();
        app.startMusic(players);
    }
}
