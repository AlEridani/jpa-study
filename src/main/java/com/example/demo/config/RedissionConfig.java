package com.example.demo.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
public class RedissionConfig {

//    @Bean(destroyMethod="shutdown")
//    RedissonClient redisson(@Value("classpath:/redisson.yaml") Resource configFile) throws IOException {
//        Config config = Config.fromYAML(configFile.getInputStream());
//        return Redisson.create(config);
//    }
//
//    @Bean
//    CacheManager cacheManager(RedissonClient redissonClient) throws IOException {
//        return new RedissonSpringLocalCachedCacheManager(redissonClient, "classpath:/cache-config.yaml");
//    }
}
