package com.crazy.java006;

import java.util.HashMap;
import java.util.Map;

public class CacheImmutale {
    /**
     * name
     */
    private final String name;

    private static CacheImmutale[] cache = new CacheImmutale[10];
    private static Map<String, CacheImmutale> cacheMap = new HashMap<>();

    private static int pos = 0;

    public CacheImmutale(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    /**
     * cache method
     * this is a very good method
     */
    public static CacheImmutale valueOf(String name) {
        for (int i=0; i<10; i++) {
            if (cache[i] != null && cache[i].getName().equals(name)) {
                return cache[i];
            }
        }
        if (10 == pos) {
            cache[0] = new CacheImmutale(name);
            pos = 1;
            return cache[0];
        } else {
            cache[pos++] = new CacheImmutale(name);
            return cache[pos-1];
        }
    }

    /**
     * cache method
     * this is a very good method
     */
    public static CacheImmutale getVal(String name) {
        if (null != cacheMap.get(name)) {
            return cacheMap.get(name);
        }
        CacheImmutale cacheImmutale = new CacheImmutale(name);
        cacheMap.put(name, cacheImmutale);
        return cacheImmutale;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CacheImmutale) {
            CacheImmutale ci = (CacheImmutale) obj;
            if (name.equals(ci.getName())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return name.hashCode();
    }

    public static void main(String[] args) {
        CacheImmutale c1 = CacheImmutale.valueOf("hello");
        CacheImmutale c2 = CacheImmutale.valueOf("hello");
        System.out.println(c1 == c2);

        CacheImmutale c3 = CacheImmutale.getVal("hello");
        CacheImmutale c4 = CacheImmutale.getVal("hello");
        System.out.println(c3 == c4);
    }
}
