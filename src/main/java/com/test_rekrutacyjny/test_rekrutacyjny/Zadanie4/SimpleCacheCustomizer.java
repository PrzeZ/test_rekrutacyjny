package com.test_rekrutacyjny.test_rekrutacyjny.Zadanie4;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.stereotype.Component;

@Component
public class SimpleCacheCustomizer 
  implements CacheManagerCustomizer<ConcurrentMapCacheManager> {

    @Override
    public void customize(ConcurrentMapCacheManager cacheManager) {
        ArrayList<String> cacheNames = new ArrayList<String>();

        cacheNames.add("users");
        cacheNames.add("transactions");

        cacheManager.setCacheNames(cacheNames);
    }
}
