package complexlibrary;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") + 1);
    }

    public VideoFile(String name,String codecType)
    {
        this.name=name.substring(0,name.indexOf("."));
        this.codecType=codecType;
    }
    public String getCodecType() {
        return codecType;
    }

    public String getName() {
        return name;
    }
}
