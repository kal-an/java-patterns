package Behavioral.Iterator.impl;

import Behavioral.Iterator.Profile;
import Behavioral.Iterator.ProfileIterator;

public class LinkedInIterator implements ProfileIterator {

    private LinkedIn linkedIn;
    private String type;
    private int profileId;
    private int currentPosition;
    private Profile[] cache;

    public LinkedInIterator(LinkedIn linkedIn, int profileId, String type) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.profileId = profileId;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = linkedIn.socialGraphRequest(profileId, type);
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
