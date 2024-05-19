package complexlibrary;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        VideoFile videoFile=new VideoFile(buffer.getName(), codec.getType());
        //System.out.println(buffer.getCodecType()+" testing...");
        return videoFile;
    }
}
