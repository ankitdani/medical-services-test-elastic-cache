package com.cloudcomputing.medicalservices;

import redis.clients.jedis.Jedis;

public class CheckRedisData {
    public static void main(String[] args) {
        String redisHost = "your-redis-endpoint"; // Replace with your Redis endpoint
        int redisPort = 6379; // Default Redis port, change if yours is different
        Jedis jedis = new Jedis(redisHost, redisPort);

        // Example: Checking data for medicalService with id 1
        String locationLat = jedis.get("medicalService:1:locationLat");
        String locationLong = jedis.get("medicalService:1:locationLong");

        System.out.println("Location Latitude: " + locationLat);
        System.out.println("Location Longitude: " + locationLong);

        jedis.close();
    }
}

