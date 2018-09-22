package com.chenqx.cacheTest;

import java.util.logging.Logger;

public class CacheListener {
    Logger logger = Logger.getLogger("cacheLog");
    private ICacheManager iCacheManager;

    public CacheListener(ICacheManager iCacheManager) {
        this.iCacheManager = iCacheManager;
    }

    public void startListen() {
        new Thread(() -> {
            while (true) {
                for (String key : iCacheManager.getAllKeys()) {
                    if (iCacheManager.isTimeOut(key)) {
                        iCacheManager.clearByKey(key);
                        logger.info(key + "缓存被清除");
                    }
                }
            }
        }).start();
    }


}
