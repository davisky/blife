package com.blife.repository;/*
package com.jlife.base.dao;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.jlife.base.util.StringUtils;

import org.beetl.ext.fn.Json;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
*/
/**
 * Created by chen on 2017/4/12.
 * <p>
 * Email 122741482@qq.com
 * <p>
 * Describe:
 *//*



public abstract class Chain {
    public Chain() {
    }

    public static Chain make(String name, Object value) {
        return new Chain.DefaultChain(name, value);
    }

    public abstract int size();

    public abstract Chain name(String var1);

    public abstract Chain value(Object var1);


    public abstract Chain add(String var1, Object var2);

    public abstract String name();

    public abstract Object value();

    public abstract Chain next();

    public abstract Chain head();



    public abstract <T> T toObject(Class<T> var1);

    public abstract Map<String, Object> toMap();

    public abstract boolean isSpecial();

    public abstract boolean special();

    public Map<String, Object> toEntityMap(String tableName) {
        Map map = this.toMap();
        map.put(".table", tableName);
        return map;
    }



    public static Chain from(Object obj, FieldMatcher fm) {
        if(null == obj) {
            return null;
        } else {
            Chain c = null;
            if(obj instanceof Map) {
                Iterator Reflections = ((Map)obj).entrySet().iterator();

                while(true) {
                    String name;
                    Object f;
                    while(true) {
                        java.util.Map.Entry en;
                        do {
                            Object key;
                            do {
                                if(!Reflections.hasNext()) {
                                    return c;
                                }

                                en = (java.util.Map.Entry)Reflections.next();
                                key = en.getKey();
                            } while(null == key);

                            name = key.toString();
                        } while(null != fm && !fm.match(name));

                        f = en.getValue();
                        if(null == fm) {
                            break;
                        }

                        if(null == f) {
                            if(fm.isIgnoreNull()) {
                                continue;
                            }
                            break;
                        } else if(!fm.isIgnoreBlankStr() || !(f instanceof String) || !StringUtils.isBlank((String)f)) {
                            break;
                        }
                    }

                    if(c == null) {
                        c = make(name, f);
                    } else {
                        c = c.add(name, f);
                    }
                }
            } else {
                Reflections var9 = Reflections.me(obj.getClass());
                Field[] var10 = var9.getFields();
                int var11 = var10.length;

                for(int var12 = 0; var12 < var11; ++var12) {
                    Field var13 = var10[var12];
                    if(null == fm || fm.match(var13.getName())) {
                        Object v = var9.getValue(obj, var13.getName());
                        if(null == v) {
                            if(fm != null && fm.isIgnoreNull()) {
                                continue;
                            }
                        } else if(fm != null && fm.isIgnoreBlankStr() && v instanceof String && StringUtils.isBlank((String)v)) {
                            continue;
                        }

                        if(c == null) {
                            c = make(var13.getName(), v);
                        } else {
                            c = c.add(var13.getName(), v);
                        }
                    }
                }

                return c;
            }
        }
    }

    public static Chain from(Object obj) {
        return from(obj, (FieldMatcher)null);
    }


    public abstract Chain addSpecial(String var1, Object var2);

    public static Chain makeSpecial(String name, Object value) {
        Chain.DefaultChain chain = new Chain.DefaultChain(name, value);
        chain.head.special = true;
        return chain;
    }

    public static class Entry {
        protected String name;
        Object value;
        boolean special;
        Chain.Entry next;

        public Entry(String name, Object value) {
            this.name = name;
            this.value = value;
        }
    }

    public static class DefaultChain extends Chain {
        private Chain.Entry head;
        private Chain.Entry current;
        private Chain.Entry tail;
        private int size;

        public DefaultChain(String name, Object value) {
            this.head = new Chain.Entry(name, value);
            this.current = this.head;
            this.tail = this.head;
            this.size = 1;
        }

        public int size() {
            return this.size;
        }

        public Chain name(String name) {
            this.current.name = name;
            return this;
        }

        public Chain value(Object value) {
            this.current.value = value;
            return this;
        }



        public Chain add(String name, Object value) {
            this.tail.next = new Chain.Entry(name, value);
            this.tail = this.tail.next;
            ++this.size;
            return this;
        }

        public String name() {
            return this.current.name;
        }

        public Object value() {
            return this.current.value;
        }

        public Chain next() {
            this.current = this.current.next;
            return this.current == null?null:this;
        }

        public Chain head() {
            this.current = this.head;
            return this;
        }

        @Override
        public <T> T toObject(Class<T> var1) {
            return null;
        }

        public Chain addSpecial(String name, Object value) {
            this.add(name, value);
            this.tail.special = true;
            return this;
        }

        public boolean special() {
            return this.current.special;
        }

        public boolean isSpecial() {
            Chain.Entry entry = this.head;

            while(!entry.special) {
                if((entry = entry.next) == null) {
                    return false;
                }
            }

            return true;
        }

        public Map<String, Object> toMap() {
            LinkedHashMap map = new LinkedHashMap();

            for(Chain.Entry current = this.head; current != null; current = current.next) {
                map.put(current.name, current.value);
            }

            return map;
        }



    }
}

*/
