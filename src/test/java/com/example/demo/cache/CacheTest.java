//package com.example.demo.cache;
//
//import com.example.demo.entity.Board;
//import com.example.demo.service.BoardService;
//import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;
//import org.redisson.api.RedissonReactiveClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.ReactiveStringRedisTemplate;
//import org.springframework.data.redis.core.ReactiveValueOperations;
//import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;
//import reactor.test.StepVerifier;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertSame;
//
//@SpringBootTest
//public class CacheTest {
//
//    @Autowired
//    private ReactiveStringRedisTemplate template;
//
//    @Autowired
//    private RedissonReactiveClient redissonClient;
//
//    @RepeatedTest(3)
//    void contextLoads(){
//        ReactiveValueOperations<String,String> valueOperations = this.template.opsForValue();
//
//
//        long before = System.currentTimeMillis();
//        Mono<Void> mono = Flux.range(1,500000)
//                .flatMap(i->valueOperations.increment("user:1:visit"))
//                .then();
//        StepVerifier.create(mono)
//                .verifyComplete();
//
//        long after = System.currentTimeMillis();
//
//        System.out.println((after-before) + "ms");
//    }
//
//
//    @RepeatedTest(3)
//    void redissonTest(){
//        ReactiveValueOperations<String,String> valueOperations = this.template.opsForValue();
//
//
//        long before = System.currentTimeMillis();
//        Mono<Void> mono = Flux.range(1,500000)
//                .flatMap(i->valueOperations.increment("user:1:visit"))
//                .then();
//        StepVerifier.create(mono)
//                .verifyComplete();
//
//        long after = System.currentTimeMillis();
//
//        System.out.println((after-before) + "ms");
//    }
//
//
//
//}
