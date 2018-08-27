package com.chenqx.cacheTest;

import java.util.Map;
import java.util.Set;

public interface ICacheManager {
    /**
     * 将数据存入缓存
     * @param key
     * @param cache
     */
    void putCache(String key,EntityCache cache);

    /**
     * 将数据存入缓存
     * @param key
     * @param datas
     * @param timeOut
     */
    void putCache(String key,Object datas,Long timeOut);

    /**
     * 获取对应的缓存
     * @param key
     */
    EntityCache getCacheByKey(String key);

    /**
     * 获取对应缓存
     * @param key
     * @return
     */
    Object getCacheDataByKey(String key);

    /**
     * 获取所有缓存
     * @return
     */
    Map<String ,EntityCache> getCacheAll();

    /**
     * 判断是否在缓存中
     * @param key
     * @return
     */
    Boolean isContains(String key);

    /**
     * 清楚所有缓存
     */
    void clearAll();

    /**
     * 清除对应的缓存
     * @param key
     */
    void clearByKey(String key);

    /**
     * 缓存是否超时失效
     * @param key
     * @return
     */
    Boolean isTimeOut(String key);

    /**
     * 获取所有key
     * @return
     */
    Set<String> getAllKeys();

}
