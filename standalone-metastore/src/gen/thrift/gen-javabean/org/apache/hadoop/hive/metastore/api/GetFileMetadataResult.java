/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class GetFileMetadataResult implements org.apache.thrift.TBase<GetFileMetadataResult, GetFileMetadataResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetFileMetadataResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetFileMetadataResult");

  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField IS_SUPPORTED_FIELD_DESC = new org.apache.thrift.protocol.TField("isSupported", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetFileMetadataResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetFileMetadataResultTupleSchemeFactory());
  }

  private Map<Long,ByteBuffer> metadata; // required
  private boolean isSupported; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METADATA((short)1, "metadata"),
    IS_SUPPORTED((short)2, "isSupported");

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
        case 1: // METADATA
          return METADATA;
        case 2: // IS_SUPPORTED
          return IS_SUPPORTED;
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
  private static final int __ISSUPPORTED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , true))));
    tmpMap.put(_Fields.IS_SUPPORTED, new org.apache.thrift.meta_data.FieldMetaData("isSupported", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetFileMetadataResult.class, metaDataMap);
  }

  public GetFileMetadataResult() {
  }

  public GetFileMetadataResult(
    Map<Long,ByteBuffer> metadata,
    boolean isSupported)
  {
    this();
    this.metadata = metadata;
    this.isSupported = isSupported;
    setIsSupportedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetFileMetadataResult(GetFileMetadataResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMetadata()) {
      Map<Long,ByteBuffer> __this__metadata = new HashMap<Long,ByteBuffer>(other.metadata);
      this.metadata = __this__metadata;
    }
    this.isSupported = other.isSupported;
  }

  public GetFileMetadataResult deepCopy() {
    return new GetFileMetadataResult(this);
  }

  @Override
  public void clear() {
    this.metadata = null;
    setIsSupportedIsSet(false);
    this.isSupported = false;
  }

  public int getMetadataSize() {
    return (this.metadata == null) ? 0 : this.metadata.size();
  }

  public void putToMetadata(long key, ByteBuffer val) {
    if (this.metadata == null) {
      this.metadata = new HashMap<Long,ByteBuffer>();
    }
    this.metadata.put(key, val);
  }

  public Map<Long,ByteBuffer> getMetadata() {
    return this.metadata;
  }

  public void setMetadata(Map<Long,ByteBuffer> metadata) {
    this.metadata = metadata;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public boolean isIsSupported() {
    return this.isSupported;
  }

  public void setIsSupported(boolean isSupported) {
    this.isSupported = isSupported;
    setIsSupportedIsSet(true);
  }

  public void unsetIsSupported() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISSUPPORTED_ISSET_ID);
  }

  /** Returns true if field isSupported is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSupported() {
    return EncodingUtils.testBit(__isset_bitfield, __ISSUPPORTED_ISSET_ID);
  }

  public void setIsSupportedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISSUPPORTED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((Map<Long,ByteBuffer>)value);
      }
      break;

    case IS_SUPPORTED:
      if (value == null) {
        unsetIsSupported();
      } else {
        setIsSupported((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA:
      return getMetadata();

    case IS_SUPPORTED:
      return isIsSupported();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METADATA:
      return isSetMetadata();
    case IS_SUPPORTED:
      return isSetIsSupported();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetFileMetadataResult)
      return this.equals((GetFileMetadataResult)that);
    return false;
  }

  public boolean equals(GetFileMetadataResult that) {
    if (that == null)
      return false;

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_isSupported = true;
    boolean that_present_isSupported = true;
    if (this_present_isSupported || that_present_isSupported) {
      if (!(this_present_isSupported && that_present_isSupported))
        return false;
      if (this.isSupported != that.isSupported)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    boolean present_isSupported = true;
    list.add(present_isSupported);
    if (present_isSupported)
      list.add(isSupported);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetFileMetadataResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsSupported()).compareTo(other.isSetIsSupported());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSupported()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isSupported, other.isSupported);
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
    StringBuilder sb = new StringBuilder("GetFileMetadataResult(");
    boolean first = true;

    sb.append("metadata:");
    if (this.metadata == null) {
      sb.append("null");
    } else {
      sb.append(this.metadata);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isSupported:");
    sb.append(this.isSupported);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetMetadata()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metadata' is unset! Struct:" + toString());
    }

    if (!isSetIsSupported()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'isSupported' is unset! Struct:" + toString());
    }

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

  private static class GetFileMetadataResultStandardSchemeFactory implements SchemeFactory {
    public GetFileMetadataResultStandardScheme getScheme() {
      return new GetFileMetadataResultStandardScheme();
    }
  }

  private static class GetFileMetadataResultStandardScheme extends StandardScheme<GetFileMetadataResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetFileMetadataResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map728 = iprot.readMapBegin();
                struct.metadata = new HashMap<Long,ByteBuffer>(2*_map728.size);
                long _key729;
                ByteBuffer _val730;
                for (int _i731 = 0; _i731 < _map728.size; ++_i731)
                {
                  _key729 = iprot.readI64();
                  _val730 = iprot.readBinary();
                  struct.metadata.put(_key729, _val730);
                }
                iprot.readMapEnd();
              }
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_SUPPORTED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isSupported = iprot.readBool();
              struct.setIsSupportedIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetFileMetadataResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadata != null) {
        oprot.writeFieldBegin(METADATA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRING, struct.metadata.size()));
          for (Map.Entry<Long, ByteBuffer> _iter732 : struct.metadata.entrySet())
          {
            oprot.writeI64(_iter732.getKey());
            oprot.writeBinary(_iter732.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_SUPPORTED_FIELD_DESC);
      oprot.writeBool(struct.isSupported);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetFileMetadataResultTupleSchemeFactory implements SchemeFactory {
    public GetFileMetadataResultTupleScheme getScheme() {
      return new GetFileMetadataResultTupleScheme();
    }
  }

  private static class GetFileMetadataResultTupleScheme extends TupleScheme<GetFileMetadataResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetFileMetadataResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.metadata.size());
        for (Map.Entry<Long, ByteBuffer> _iter733 : struct.metadata.entrySet())
        {
          oprot.writeI64(_iter733.getKey());
          oprot.writeBinary(_iter733.getValue());
        }
      }
      oprot.writeBool(struct.isSupported);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetFileMetadataResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map734 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I64, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.metadata = new HashMap<Long,ByteBuffer>(2*_map734.size);
        long _key735;
        ByteBuffer _val736;
        for (int _i737 = 0; _i737 < _map734.size; ++_i737)
        {
          _key735 = iprot.readI64();
          _val736 = iprot.readBinary();
          struct.metadata.put(_key735, _val736);
        }
      }
      struct.setMetadataIsSet(true);
      struct.isSupported = iprot.readBool();
      struct.setIsSupportedIsSet(true);
    }
  }

}

