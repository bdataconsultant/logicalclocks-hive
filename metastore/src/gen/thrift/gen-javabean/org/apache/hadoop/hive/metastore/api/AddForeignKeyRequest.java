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
public class AddForeignKeyRequest implements org.apache.thrift.TBase<AddForeignKeyRequest, AddForeignKeyRequest._Fields>, java.io.Serializable, Cloneable, Comparable<AddForeignKeyRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AddForeignKeyRequest");

  private static final org.apache.thrift.protocol.TField FOREIGN_KEY_COLS_FIELD_DESC = new org.apache.thrift.protocol.TField("foreignKeyCols", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AddForeignKeyRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AddForeignKeyRequestTupleSchemeFactory());
  }

  private List<SQLForeignKey> foreignKeyCols; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FOREIGN_KEY_COLS((short)1, "foreignKeyCols");

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
        case 1: // FOREIGN_KEY_COLS
          return FOREIGN_KEY_COLS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FOREIGN_KEY_COLS, new org.apache.thrift.meta_data.FieldMetaData("foreignKeyCols", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SQLForeignKey.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AddForeignKeyRequest.class, metaDataMap);
  }

  public AddForeignKeyRequest() {
  }

  public AddForeignKeyRequest(
    List<SQLForeignKey> foreignKeyCols)
  {
    this();
    this.foreignKeyCols = foreignKeyCols;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AddForeignKeyRequest(AddForeignKeyRequest other) {
    if (other.isSetForeignKeyCols()) {
      List<SQLForeignKey> __this__foreignKeyCols = new ArrayList<SQLForeignKey>(other.foreignKeyCols.size());
      for (SQLForeignKey other_element : other.foreignKeyCols) {
        __this__foreignKeyCols.add(new SQLForeignKey(other_element));
      }
      this.foreignKeyCols = __this__foreignKeyCols;
    }
  }

  public AddForeignKeyRequest deepCopy() {
    return new AddForeignKeyRequest(this);
  }

  @Override
  public void clear() {
    this.foreignKeyCols = null;
  }

  public int getForeignKeyColsSize() {
    return (this.foreignKeyCols == null) ? 0 : this.foreignKeyCols.size();
  }

  public java.util.Iterator<SQLForeignKey> getForeignKeyColsIterator() {
    return (this.foreignKeyCols == null) ? null : this.foreignKeyCols.iterator();
  }

  public void addToForeignKeyCols(SQLForeignKey elem) {
    if (this.foreignKeyCols == null) {
      this.foreignKeyCols = new ArrayList<SQLForeignKey>();
    }
    this.foreignKeyCols.add(elem);
  }

  public List<SQLForeignKey> getForeignKeyCols() {
    return this.foreignKeyCols;
  }

  public void setForeignKeyCols(List<SQLForeignKey> foreignKeyCols) {
    this.foreignKeyCols = foreignKeyCols;
  }

  public void unsetForeignKeyCols() {
    this.foreignKeyCols = null;
  }

  /** Returns true if field foreignKeyCols is set (has been assigned a value) and false otherwise */
  public boolean isSetForeignKeyCols() {
    return this.foreignKeyCols != null;
  }

  public void setForeignKeyColsIsSet(boolean value) {
    if (!value) {
      this.foreignKeyCols = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FOREIGN_KEY_COLS:
      if (value == null) {
        unsetForeignKeyCols();
      } else {
        setForeignKeyCols((List<SQLForeignKey>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FOREIGN_KEY_COLS:
      return getForeignKeyCols();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FOREIGN_KEY_COLS:
      return isSetForeignKeyCols();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AddForeignKeyRequest)
      return this.equals((AddForeignKeyRequest)that);
    return false;
  }

  public boolean equals(AddForeignKeyRequest that) {
    if (that == null)
      return false;

    boolean this_present_foreignKeyCols = true && this.isSetForeignKeyCols();
    boolean that_present_foreignKeyCols = true && that.isSetForeignKeyCols();
    if (this_present_foreignKeyCols || that_present_foreignKeyCols) {
      if (!(this_present_foreignKeyCols && that_present_foreignKeyCols))
        return false;
      if (!this.foreignKeyCols.equals(that.foreignKeyCols))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_foreignKeyCols = true && (isSetForeignKeyCols());
    list.add(present_foreignKeyCols);
    if (present_foreignKeyCols)
      list.add(foreignKeyCols);

    return list.hashCode();
  }

  @Override
  public int compareTo(AddForeignKeyRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetForeignKeyCols()).compareTo(other.isSetForeignKeyCols());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForeignKeyCols()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.foreignKeyCols, other.foreignKeyCols);
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
    StringBuilder sb = new StringBuilder("AddForeignKeyRequest(");
    boolean first = true;

    sb.append("foreignKeyCols:");
    if (this.foreignKeyCols == null) {
      sb.append("null");
    } else {
      sb.append(this.foreignKeyCols);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetForeignKeyCols()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'foreignKeyCols' is unset! Struct:" + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AddForeignKeyRequestStandardSchemeFactory implements SchemeFactory {
    public AddForeignKeyRequestStandardScheme getScheme() {
      return new AddForeignKeyRequestStandardScheme();
    }
  }

  private static class AddForeignKeyRequestStandardScheme extends StandardScheme<AddForeignKeyRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AddForeignKeyRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FOREIGN_KEY_COLS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list362 = iprot.readListBegin();
                struct.foreignKeyCols = new ArrayList<SQLForeignKey>(_list362.size);
                SQLForeignKey _elem363;
                for (int _i364 = 0; _i364 < _list362.size; ++_i364)
                {
                  _elem363 = new SQLForeignKey();
                  _elem363.read(iprot);
                  struct.foreignKeyCols.add(_elem363);
                }
                iprot.readListEnd();
              }
              struct.setForeignKeyColsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AddForeignKeyRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.foreignKeyCols != null) {
        oprot.writeFieldBegin(FOREIGN_KEY_COLS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.foreignKeyCols.size()));
          for (SQLForeignKey _iter365 : struct.foreignKeyCols)
          {
            _iter365.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AddForeignKeyRequestTupleSchemeFactory implements SchemeFactory {
    public AddForeignKeyRequestTupleScheme getScheme() {
      return new AddForeignKeyRequestTupleScheme();
    }
  }

  private static class AddForeignKeyRequestTupleScheme extends TupleScheme<AddForeignKeyRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AddForeignKeyRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.foreignKeyCols.size());
        for (SQLForeignKey _iter366 : struct.foreignKeyCols)
        {
          _iter366.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AddForeignKeyRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list367 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.foreignKeyCols = new ArrayList<SQLForeignKey>(_list367.size);
        SQLForeignKey _elem368;
        for (int _i369 = 0; _i369 < _list367.size; ++_i369)
        {
          _elem368 = new SQLForeignKey();
          _elem368.read(iprot);
          struct.foreignKeyCols.add(_elem368);
        }
      }
      struct.setForeignKeyColsIsSet(true);
    }
  }

}

