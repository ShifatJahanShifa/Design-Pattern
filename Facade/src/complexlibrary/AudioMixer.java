package complexlibrary;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){

        System.out.println("AudioMixer: fixing audio...");
        String fileName= result.getName()+"."+result.getCodecType();
        return new File(fileName);
    }
}
