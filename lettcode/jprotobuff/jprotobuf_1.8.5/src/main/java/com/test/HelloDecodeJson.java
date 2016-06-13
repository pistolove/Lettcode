package com.test;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xuli
 * Date：16/4/19
 * Time: 16:40
 */
public class HelloDecodeJson implements Serializable {
    @Protobuf(fieldType = FieldType.INT32,required = false,order = 1)
    private Integer iddecode;
    @Protobuf(fieldType = FieldType.STRING,required = false,order = 2)
    private String namedecode;
    @Protobuf(fieldType = FieldType.STRING,required = false,order = 3)
    private String speakdecode;
    @Protobuf(fieldType = FieldType.STRING,required = false,order = 4)
    private List<String> phonedecode;

    public Integer getIddecode() {
        return iddecode;
    }

    public void setIddecode(Integer iddecode) {
        this.iddecode = iddecode;
    }

    public String getNamedecode() {
        return namedecode;
    }

    public void setNamedecode(String namedecode) {
        this.namedecode = namedecode;
    }

    public String getSpeakdecode() {
        return speakdecode;
    }

    public void setSpeakdecode(String speakdecode) {
        this.speakdecode = speakdecode;
    }

    public List<String> getPhonedecode() {
        return phonedecode;
    }

    public void setPhonedecode(List<String> phonedecode) {
        this.phonedecode = phonedecode;
    }
}
