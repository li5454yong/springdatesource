package com.lxg.springdatesource;

public class DBContextHolder{  
    public static final String DATA_SOURCE_MASTER = "Master";  
    public static final String DATA_SOURCE_SLAVER = "Slaver";  
      
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<String>();  
      
    public static void setDBType(String dbType) {  
    	THREAD_LOCAL.set(dbType);  
    }  
      
    public static String getDBType() {  
        return THREAD_LOCAL.get();  
    }  
      
    public static void clearDBType() {  
    	THREAD_LOCAL.remove();  
    }  
}  