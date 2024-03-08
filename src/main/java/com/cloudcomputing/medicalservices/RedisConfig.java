package com.cloudcomputing.medicalservices;

import redis.clients.jedis.Jedis;

public class RedisConfig {

    private static final String REDIS_HOST = "redis-test.vgeqdj.ng.0001.usw1.cache.amazonaws.com";
    private static final int REDIS_PORT = 6379; // Default Redis port

    public static Jedis jedis() {
        return new Jedis(REDIS_HOST, REDIS_PORT);
    }
}

