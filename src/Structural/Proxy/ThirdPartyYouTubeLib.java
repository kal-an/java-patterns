package Structural.Proxy;

import java.util.List;

public interface ThirdPartyYouTubeLib {

    List<String> getListVideo();
    String getVideoInfo(int id);
    void downloadVideo(int id);
}
