package Sriza.designPattern.classActivity5;

// Existing class that plays only MP3 files
public class MP3Player implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + fileName);
        } else {
            System.out.println("Invalid media format! MP3 player only supports MP3 files.");
        }
    }
}
