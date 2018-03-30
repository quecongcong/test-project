package com.hongjiuxin.smartapartment.web;

import com.google.common.collect.Maps;
import java.util.Map;

public class Result<T> {
	private boolean success = false;
	private Map<String,T> data = null;
	private String msg = "";
	private String code = "500";
	
	public static <T> Result<T> success(T data) {
	    Result<T> r = new Result<T>();
	    r.setData(data);
	    r.setSuccess(true);
	    r.setCode("200");
	    r.setMsg("success");
	    return r;
	}
	
	public static <T> Result<T> fail(String code, String msg) {
	    Result<T> r = new Result<T>();
	    r.setSuccess(false);
	    r.setCode(code);
	    r.setMsg(msg);
	    return r;
	}
	
	public boolean isSuccess() {
		return success;
	}
	
	public Result<T> setSuccess(boolean success) {
		this.success = success;
		return this;
	}
	
	public T getData() {
	    if(data == null || data.isEmpty()){
	        return null;
	    }
	    for(String key: data.keySet()){
	        return data.get(key);
	    }
	    return null;
	}
	
	public T getData(String key) {
        if(data == null || data.isEmpty()){
            return null;
        }
        return data.get(key);
    }
	
	public Result<T> setData(T data) {
	    Map<String,T> map = Maps.newHashMap();
	    map.put("result", data);
		this.data = map;
		return this;
	}
	
	public Result<T> setData(String key, T data){
	    Map<String,T> map = Maps.newHashMap();
        map.put(key, data);
        this.data = map;
        return this;
	}
	
	public String getMsg() {
		return msg;
	}
	public Result<T> setMsg(String msg) {
		this.msg = msg;
		return this;
	}
    public String getCode() {
        return code;
    }
    public Result<T> setCode(String code) {
        this.code = code;
        return this;
    }
}
