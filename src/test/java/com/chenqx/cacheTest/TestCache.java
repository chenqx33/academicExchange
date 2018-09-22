package com.chenqx.cacheTest;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class TestCache {
    Logger logger = Logger.getLogger("cacheLog");

    @Test
    public void testCacheManager() {
        ICacheManager iCacheManager = new CacheManagerImpl();
        iCacheManager.putCache("test", "test", 10 * 1000L);
        iCacheManager.putCache("myTest", "myTest", 15 * 1000L);
        CacheListener cacheListener = new CacheListener(iCacheManager);
        cacheListener.startListen();
        logger.info("test:" + iCacheManager.getCacheByKey("test").getDatas());
        logger.info("myTest:" + iCacheManager.getCacheByKey("myTest").getDatas());
        try {
            TimeUnit.SECONDS.sleep(14);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("test:" + iCacheManager.getCacheByKey("test"));
        logger.info("myTest:" + iCacheManager.getCacheByKey("myTest"));
    }

    @Test
    public void testThreadSafe() {
        final String key = "thread";
        final ICacheManager iCacheManager = new CacheManagerImpl();
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            exec.execute(() -> {
                if (!iCacheManager.isContains(key)) {
                    System.out.println(",");
                    iCacheManager.putCache(key, 1, 0L);
                } else {
                    //因为+1和赋值操作不是原子性的，所以把它用synchronize块抱起来
                    synchronized (iCacheManager) {
                        int value = (Integer) iCacheManager.getCacheDataByKey(key) + 1;
                        iCacheManager.putCache(key, value, 0L);
                    }
                }
            });
        }
        exec.shutdown();
        try {
            exec.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        logger.info(iCacheManager.getCacheDataByKey(key).toString());
    }
}
