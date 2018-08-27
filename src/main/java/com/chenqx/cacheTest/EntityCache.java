package com.chenqx.cacheTest;

public class EntityCache {

    /**
     * 保存的数据
     */
    private Object datas;

    /**
     * 设置数据失效时间，为0表示永不失效
     */
    private long timeout;

    /**
     * 最后刷新时间
     */
    private long lastRefeshTime;

    public EntityCache(Object datas, long timeout, long lastRefeshTime) {
        this.datas = datas;
        this.timeout = timeout;
        this.lastRefeshTime = lastRefeshTime;
    }

    public Object getDatas() {
        return datas;
    }

    public void setDatas(Object datas) {
        this.datas = datas;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public long getLastRefeshTime() {
        return lastRefeshTime;
    }

    public void setLastRefeshTime(long lastRefeshTime) {
        this.lastRefeshTime = lastRefeshTime;
    }
}
