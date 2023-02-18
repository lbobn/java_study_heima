package com.test1;

public class NameFormatException extends RuntimeException {
    //技巧：
    //NameFormat：当前异常的名字，表示姓名格式化问题
    //Exception：表示当前类是一个异常类


    //运行时：RuntimeException 核心 就表示由于参数错误而导致的问题
    //编译时：Exception 核心 提醒程序员检查本地信息

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
