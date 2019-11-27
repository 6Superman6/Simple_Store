package demo.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerResponse2<T> implements Serializable {
    private int code;
    private String message = "";
    private T result;
    private List<T> list;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public ServerResponse2() {

    }

    public ServerResponse2(int code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public ServerResponse2(int code, String message, List<T> list) {
        this.code = code;
        this.message = message;
        this.list = list;
    }

    public ServerResponse2(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static <T> ServerResponse2<T> setMessage2(int code, String message) {
        return new ServerResponse2<>(code, message);
    }
    public static <T> ServerResponse2<T> setMessage3(int code, String message, T result) {
        return new ServerResponse2<>(code, message,result);
    }
    public static <T> ServerResponse2<T> setMessage4(int code, String message, List<T> list) {
        return new ServerResponse2<>(code, message,list);
    }


    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ServerResponse2{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                ", list=" + list +
                '}';
    }
}
