package com.test;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/1/25
 * Time: 下午12:02
 */
public class HelloCons implements Serializable{

    @Protobuf(fieldType = FieldType.OBJECT,required = false,order = 1)
    private List<HelloJson> hello;

    public List<HelloJson> getHello() {
        return hello;
    }

    public void setHello(List<HelloJson> hello) {
        this.hello = hello;
    }

}
