package Structural.Proxy;

public class YouTubeManager {

    protected ThirdPartyYouTubeLib service;

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(int id) {
        service.getVideoInfo(id);
    }

    public void renderListPanel() {
        service.getListVideo();
    }

    public void reactOnUserInput(int id) {
        renderVideoPage(id);
        renderListPanel();
    }
}
