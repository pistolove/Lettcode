/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.compare.thriftfile;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.EncodingUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-4-19")
public class HelloTestDecode implements org.apache.thrift.TBase<HelloTestDecode, HelloTestDecode._Fields>, java.io.Serializable, Cloneable, Comparable<HelloTestDecode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HelloTestDecode");

  private static final org.apache.thrift.protocol.TField IDDECODE_FIELD_DESC = new org.apache.thrift.protocol.TField("iddecode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAMEDECODE_FIELD_DESC = new org.apache.thrift.protocol.TField("namedecode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SPEAKDECODE_FIELD_DESC = new org.apache.thrift.protocol.TField("speakdecode", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PHONEDECODE_FIELD_DESC = new org.apache.thrift.protocol.TField("phonedecode", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HelloTestDecodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HelloTestDecodeTupleSchemeFactory());
  }

  public int iddecode; // required
  public String namedecode; // optional
  public String speakdecode; // optional
  public List<String> phonedecode; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IDDECODE((short)1, "iddecode"),
    NAMEDECODE((short)2, "namedecode"),
    SPEAKDECODE((short)3, "speakdecode"),
    PHONEDECODE((short)4, "phonedecode");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // IDDECODE
          return IDDECODE;
        case 2: // NAMEDECODE
          return NAMEDECODE;
        case 3: // SPEAKDECODE
          return SPEAKDECODE;
        case 4: // PHONEDECODE
          return PHONEDECODE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __IDDECODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NAMEDECODE,_Fields.SPEAKDECODE,_Fields.PHONEDECODE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IDDECODE, new org.apache.thrift.meta_data.FieldMetaData("iddecode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAMEDECODE, new org.apache.thrift.meta_data.FieldMetaData("namedecode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SPEAKDECODE, new org.apache.thrift.meta_data.FieldMetaData("speakdecode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PHONEDECODE, new org.apache.thrift.meta_data.FieldMetaData("phonedecode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HelloTestDecode.class, metaDataMap);
  }

  public HelloTestDecode() {
    this.namedecode = "default";

  }

  public HelloTestDecode(
    int iddecode)
  {
    this();
    this.iddecode = iddecode;
    setIddecodeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HelloTestDecode(HelloTestDecode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.iddecode = other.iddecode;
    if (other.isSetNamedecode()) {
      this.namedecode = other.namedecode;
    }
    if (other.isSetSpeakdecode()) {
      this.speakdecode = other.speakdecode;
    }
    if (other.isSetPhonedecode()) {
      List<String> __this__phonedecode = new ArrayList<String>(other.phonedecode);
      this.phonedecode = __this__phonedecode;
    }
  }

  public HelloTestDecode deepCopy() {
    return new HelloTestDecode(this);
  }

  @Override
  public void clear() {
    setIddecodeIsSet(false);
    this.iddecode = 0;
    this.namedecode = "default";

    this.speakdecode = null;
    this.phonedecode = null;
  }

  public int getIddecode() {
    return this.iddecode;
  }

  public HelloTestDecode setIddecode(int iddecode) {
    this.iddecode = iddecode;
    setIddecodeIsSet(true);
    return this;
  }

  public void unsetIddecode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IDDECODE_ISSET_ID);
  }

  /** Returns true if field iddecode is set (has been assigned a value) and false otherwise */
  public boolean isSetIddecode() {
    return EncodingUtils.testBit(__isset_bitfield, __IDDECODE_ISSET_ID);
  }

  public void setIddecodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IDDECODE_ISSET_ID, value);
  }

  public String getNamedecode() {
    return this.namedecode;
  }

  public HelloTestDecode setNamedecode(String namedecode) {
    this.namedecode = namedecode;
    return this;
  }

  public void unsetNamedecode() {
    this.namedecode = null;
  }

  /** Returns true if field namedecode is set (has been assigned a value) and false otherwise */
  public boolean isSetNamedecode() {
    return this.namedecode != null;
  }

  public void setNamedecodeIsSet(boolean value) {
    if (!value) {
      this.namedecode = null;
    }
  }

  public String getSpeakdecode() {
    return this.speakdecode;
  }

  public HelloTestDecode setSpeakdecode(String speakdecode) {
    this.speakdecode = speakdecode;
    return this;
  }

  public void unsetSpeakdecode() {
    this.speakdecode = null;
  }

  /** Returns true if field speakdecode is set (has been assigned a value) and false otherwise */
  public boolean isSetSpeakdecode() {
    return this.speakdecode != null;
  }

  public void setSpeakdecodeIsSet(boolean value) {
    if (!value) {
      this.speakdecode = null;
    }
  }

  public int getPhonedecodeSize() {
    return (this.phonedecode == null) ? 0 : this.phonedecode.size();
  }

  public java.util.Iterator<String> getPhonedecodeIterator() {
    return (this.phonedecode == null) ? null : this.phonedecode.iterator();
  }

  public void addToPhonedecode(String elem) {
    if (this.phonedecode == null) {
      this.phonedecode = new ArrayList<String>();
    }
    this.phonedecode.add(elem);
  }

  public List<String> getPhonedecode() {
    return this.phonedecode;
  }

  public HelloTestDecode setPhonedecode(List<String> phonedecode) {
    this.phonedecode = phonedecode;
    return this;
  }

  public void unsetPhonedecode() {
    this.phonedecode = null;
  }

  /** Returns true if field phonedecode is set (has been assigned a value) and false otherwise */
  public boolean isSetPhonedecode() {
    return this.phonedecode != null;
  }

  public void setPhonedecodeIsSet(boolean value) {
    if (!value) {
      this.phonedecode = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IDDECODE:
      if (value == null) {
        unsetIddecode();
      } else {
        setIddecode((Integer)value);
      }
      break;

    case NAMEDECODE:
      if (value == null) {
        unsetNamedecode();
      } else {
        setNamedecode((String)value);
      }
      break;

    case SPEAKDECODE:
      if (value == null) {
        unsetSpeakdecode();
      } else {
        setSpeakdecode((String)value);
      }
      break;

    case PHONEDECODE:
      if (value == null) {
        unsetPhonedecode();
      } else {
        setPhonedecode((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IDDECODE:
      return Integer.valueOf(getIddecode());

    case NAMEDECODE:
      return getNamedecode();

    case SPEAKDECODE:
      return getSpeakdecode();

    case PHONEDECODE:
      return getPhonedecode();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IDDECODE:
      return isSetIddecode();
    case NAMEDECODE:
      return isSetNamedecode();
    case SPEAKDECODE:
      return isSetSpeakdecode();
    case PHONEDECODE:
      return isSetPhonedecode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HelloTestDecode)
      return this.equals((HelloTestDecode)that);
    return false;
  }

  public boolean equals(HelloTestDecode that) {
    if (that == null)
      return false;

    boolean this_present_iddecode = true;
    boolean that_present_iddecode = true;
    if (this_present_iddecode || that_present_iddecode) {
      if (!(this_present_iddecode && that_present_iddecode))
        return false;
      if (this.iddecode != that.iddecode)
        return false;
    }

    boolean this_present_namedecode = true && this.isSetNamedecode();
    boolean that_present_namedecode = true && that.isSetNamedecode();
    if (this_present_namedecode || that_present_namedecode) {
      if (!(this_present_namedecode && that_present_namedecode))
        return false;
      if (!this.namedecode.equals(that.namedecode))
        return false;
    }

    boolean this_present_speakdecode = true && this.isSetSpeakdecode();
    boolean that_present_speakdecode = true && that.isSetSpeakdecode();
    if (this_present_speakdecode || that_present_speakdecode) {
      if (!(this_present_speakdecode && that_present_speakdecode))
        return false;
      if (!this.speakdecode.equals(that.speakdecode))
        return false;
    }

    boolean this_present_phonedecode = true && this.isSetPhonedecode();
    boolean that_present_phonedecode = true && that.isSetPhonedecode();
    if (this_present_phonedecode || that_present_phonedecode) {
      if (!(this_present_phonedecode && that_present_phonedecode))
        return false;
      if (!this.phonedecode.equals(that.phonedecode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_iddecode = true;
    list.add(present_iddecode);
    if (present_iddecode)
      list.add(iddecode);

    boolean present_namedecode = true && (isSetNamedecode());
    list.add(present_namedecode);
    if (present_namedecode)
      list.add(namedecode);

    boolean present_speakdecode = true && (isSetSpeakdecode());
    list.add(present_speakdecode);
    if (present_speakdecode)
      list.add(speakdecode);

    boolean present_phonedecode = true && (isSetPhonedecode());
    list.add(present_phonedecode);
    if (present_phonedecode)
      list.add(phonedecode);

    return list.hashCode();
  }

  @Override
  public int compareTo(HelloTestDecode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIddecode()).compareTo(other.isSetIddecode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIddecode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iddecode, other.iddecode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNamedecode()).compareTo(other.isSetNamedecode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNamedecode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.namedecode, other.namedecode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpeakdecode()).compareTo(other.isSetSpeakdecode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpeakdecode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.speakdecode, other.speakdecode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPhonedecode()).compareTo(other.isSetPhonedecode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhonedecode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phonedecode, other.phonedecode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HelloTestDecode(");
    boolean first = true;

    sb.append("iddecode:");
    sb.append(this.iddecode);
    first = false;
    if (isSetNamedecode()) {
      if (!first) sb.append(", ");
      sb.append("namedecode:");
      if (this.namedecode == null) {
        sb.append("null");
      } else {
        sb.append(this.namedecode);
      }
      first = false;
    }
    if (isSetSpeakdecode()) {
      if (!first) sb.append(", ");
      sb.append("speakdecode:");
      if (this.speakdecode == null) {
        sb.append("null");
      } else {
        sb.append(this.speakdecode);
      }
      first = false;
    }
    if (isSetPhonedecode()) {
      if (!first) sb.append(", ");
      sb.append("phonedecode:");
      if (this.phonedecode == null) {
        sb.append("null");
      } else {
        sb.append(this.phonedecode);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'iddecode' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HelloTestDecodeStandardSchemeFactory implements SchemeFactory {
    public HelloTestDecodeStandardScheme getScheme() {
      return new HelloTestDecodeStandardScheme();
    }
  }

  private static class HelloTestDecodeStandardScheme extends StandardScheme<HelloTestDecode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HelloTestDecode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IDDECODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.iddecode = iprot.readI32();
              struct.setIddecodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAMEDECODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.namedecode = iprot.readString();
              struct.setNamedecodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SPEAKDECODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.speakdecode = iprot.readString();
              struct.setSpeakdecodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PHONEDECODE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.phonedecode = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.phonedecode.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setPhonedecodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetIddecode()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'iddecode' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HelloTestDecode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IDDECODE_FIELD_DESC);
      oprot.writeI32(struct.iddecode);
      oprot.writeFieldEnd();
      if (struct.namedecode != null) {
        if (struct.isSetNamedecode()) {
          oprot.writeFieldBegin(NAMEDECODE_FIELD_DESC);
          oprot.writeString(struct.namedecode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.speakdecode != null) {
        if (struct.isSetSpeakdecode()) {
          oprot.writeFieldBegin(SPEAKDECODE_FIELD_DESC);
          oprot.writeString(struct.speakdecode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.phonedecode != null) {
        if (struct.isSetPhonedecode()) {
          oprot.writeFieldBegin(PHONEDECODE_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.phonedecode.size()));
            for (String _iter3 : struct.phonedecode)
            {
              oprot.writeString(_iter3);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HelloTestDecodeTupleSchemeFactory implements SchemeFactory {
    public HelloTestDecodeTupleScheme getScheme() {
      return new HelloTestDecodeTupleScheme();
    }
  }

  private static class HelloTestDecodeTupleScheme extends TupleScheme<HelloTestDecode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HelloTestDecode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.iddecode);
      BitSet optionals = new BitSet();
      if (struct.isSetNamedecode()) {
        optionals.set(0);
      }
      if (struct.isSetSpeakdecode()) {
        optionals.set(1);
      }
      if (struct.isSetPhonedecode()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetNamedecode()) {
        oprot.writeString(struct.namedecode);
      }
      if (struct.isSetSpeakdecode()) {
        oprot.writeString(struct.speakdecode);
      }
      if (struct.isSetPhonedecode()) {
        {
          oprot.writeI32(struct.phonedecode.size());
          for (String _iter4 : struct.phonedecode)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HelloTestDecode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.iddecode = iprot.readI32();
      struct.setIddecodeIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.namedecode = iprot.readString();
        struct.setNamedecodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.speakdecode = iprot.readString();
        struct.setSpeakdecodeIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.phonedecode = new ArrayList<String>(_list5.size);
          String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.phonedecode.add(_elem6);
          }
        }
        struct.setPhonedecodeIsSet(true);
      }
    }
  }

}

