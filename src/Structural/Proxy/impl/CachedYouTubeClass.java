package Structural.Proxy.impl;

import Structural.Proxy.ThirdPartyYouTubeLib;

import java.util.List;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib service;
    private List<String> listCache;
    private String videoCache;
    private boolean needReset;

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public List<String> getListVideo() {
        if (listCache == null || needReset) {
            listCache = service.getListVideo();
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(int id) {
        if (videoCache == null || needReset) {
            videoCache = service.getVideoInfo(id);
        }
        return videoCache;
    }

    @Override
    public void downloadVideo(int id) {

    }
}
