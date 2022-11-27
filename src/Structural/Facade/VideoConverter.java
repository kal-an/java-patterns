package Structural.Facade;

import java.io.File;

public class VideoConverter {

    private File file;
    private VideoFile videoFile;
    private CodecFactory sourceCodec;

    public File convert(String filename, String format) {
        videoFile = new VideoFile(filename);
        sourceCodec = new CodecFactory().extract(file);
        return null;
    }
}
