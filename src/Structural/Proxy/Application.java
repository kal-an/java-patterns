package Structural.Proxy;

import Structural.Proxy.impl.CachedYouTubeClass;
import Structural.Proxy.impl.ThirdPartyYoutubeClass;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.init();
    }

    private void init() {
        ThirdPartyYoutubeClass youTubeService = new ThirdPartyYoutubeClass();
        CachedYouTubeClass youTubeProxy = new CachedYouTubeClass(youTubeService);
        YouTubeManager manager = new YouTubeManager(youTubeProxy);
        manager.reactOnUserInput(1);
    }
}
