import facade.VideoConversionFacade;

import java.io.File;

public class Client {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade=new VideoConversionFacade();
        File video=videoConversionFacade.convertVideo("youtube.mp4","ogg");
        System.out.println(video.getName());
    }
}
