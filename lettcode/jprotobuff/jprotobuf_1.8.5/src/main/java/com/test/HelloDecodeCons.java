package com.test;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/4/19
 * Time: 16:38
 */
public class HelloDecodeCons implements Serializable {
    @Protobuf(fieldType = FieldType.OBJECT,required = false,order = 1)
    private List<HelloDecodeJson> helloDecode;

    public List<HelloDecodeJson> getHelloDecode() {
        return helloDecode;
    }

    public void setHelloDecode(List<HelloDecodeJson> helloDecode) {
        this.helloDecode = helloDecode;
    }
}
