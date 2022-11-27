package Behavioral.Iterator.impl;

import Behavioral.Iterator.Profile;
import Behavioral.Iterator.ProfileIterator;

public class FacebookIterator implements ProfileIterator {

    private Facebook facebook;
    private String type;
    private int profileId;
    private int currentPosition;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, int profileId, String type) {
        this.facebook = facebook;
        this.type = type;
        this.profileId = profileId;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    @Override
    public Profile getNext() {
        if (hasMore()) {
            currentPosition++;
        }
        return cache[currentPosition];
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.length;
    }
}
