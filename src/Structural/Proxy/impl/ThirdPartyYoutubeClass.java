package Structural.Proxy.impl;

import Structural.Proxy.ThirdPartyYouTubeLib;

import java.util.List;

public class ThirdPartyYoutubeClass implements ThirdPartyYouTubeLib {

    @Override
    public List<String> getListVideo() {
        return null;
    }

    @Override
    public String getVideoInfo(int id) {
        return null;
    }

    @Override
    public void downloadVideo(int id) {

    }
}
