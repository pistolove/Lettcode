package com.test;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
public class PersonPOJO {
    @Protobuf(fieldType = FieldType.STRING, order=1)
    public String name;
    @Protobuf(fieldType = FieldType.INT32, order=2)
    public int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
