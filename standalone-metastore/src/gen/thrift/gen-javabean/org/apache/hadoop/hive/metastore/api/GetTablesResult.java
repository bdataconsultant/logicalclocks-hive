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
public class GetTablesResult implements org.apache.thrift.TBase<GetTablesResult, GetTablesResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetTablesResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetTablesResult");

  private static final org.apache.thrift.protocol.TField TABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("tables", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetTablesResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetTablesResultTupleSchemeFactory());
  }

  private List<Table> tables; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLES((short)1, "tables");

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
        case 1: // TABLES
          return TABLES;
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
    tmpMap.put(_Fields.TABLES, new org.apache.thrift.meta_data.FieldMetaData("tables", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Table.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetTablesResult.class, metaDataMap);
  }

  public GetTablesResult() {
  }

  public GetTablesResult(
    List<Table> tables)
  {
    this();
    this.tables = tables;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetTablesResult(GetTablesResult other) {
    if (other.isSetTables()) {
      List<Table> __this__tables = new ArrayList<Table>(other.tables.size());
      for (Table other_element : other.tables) {
        __this__tables.add(new Table(other_element));
      }
      this.tables = __this__tables;
    }
  }

  public GetTablesResult deepCopy() {
    return new GetTablesResult(this);
  }

  @Override
  public void clear() {
    this.tables = null;
  }

  public int getTablesSize() {
    return (this.tables == null) ? 0 : this.tables.size();
  }

  public java.util.Iterator<Table> getTablesIterator() {
    return (this.tables == null) ? null : this.tables.iterator();
  }

  public void addToTables(Table elem) {
    if (this.tables == null) {
      this.tables = new ArrayList<Table>();
    }
    this.tables.add(elem);
  }

  public List<Table> getTables() {
    return this.tables;
  }

  public void setTables(List<Table> tables) {
    this.tables = tables;
  }

  public void unsetTables() {
    this.tables = null;
  }

  /** Returns true if field tables is set (has been assigned a value) and false otherwise */
  public boolean isSetTables() {
    return this.tables != null;
  }

  public void setTablesIsSet(boolean value) {
    if (!value) {
      this.tables = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLES:
      if (value == null) {
        unsetTables();
      } else {
        setTables((List<Table>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLES:
      return getTables();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLES:
      return isSetTables();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetTablesResult)
      return this.equals((GetTablesResult)that);
    return false;
  }

  public boolean equals(GetTablesResult that) {
    if (that == null)
      return false;

    boolean this_present_tables = true && this.isSetTables();
    boolean that_present_tables = true && that.isSetTables();
    if (this_present_tables || that_present_tables) {
      if (!(this_present_tables && that_present_tables))
        return false;
      if (!this.tables.equals(that.tables))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tables = true && (isSetTables());
    list.add(present_tables);
    if (present_tables)
      list.add(tables);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetTablesResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTables()).compareTo(other.isSetTables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tables, other.tables);
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
    StringBuilder sb = new StringBuilder("GetTablesResult(");
    boolean first = true;

    sb.append("tables:");
    if (this.tables == null) {
      sb.append("null");
    } else {
      sb.append(this.tables);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTables()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tables' is unset! Struct:" + toString());
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

  private static class GetTablesResultStandardSchemeFactory implements SchemeFactory {
    public GetTablesResultStandardScheme getScheme() {
      return new GetTablesResultStandardScheme();
    }
  }

  private static class GetTablesResultStandardScheme extends StandardScheme<GetTablesResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetTablesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list832 = iprot.readListBegin();
                struct.tables = new ArrayList<Table>(_list832.size);
                Table _elem833;
                for (int _i834 = 0; _i834 < _list832.size; ++_i834)
                {
                  _elem833 = new Table();
                  _elem833.read(iprot);
                  struct.tables.add(_elem833);
                }
                iprot.readListEnd();
              }
              struct.setTablesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetTablesResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tables != null) {
        oprot.writeFieldBegin(TABLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tables.size()));
          for (Table _iter835 : struct.tables)
          {
            _iter835.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetTablesResultTupleSchemeFactory implements SchemeFactory {
    public GetTablesResultTupleScheme getScheme() {
      return new GetTablesResultTupleScheme();
    }
  }

  private static class GetTablesResultTupleScheme extends TupleScheme<GetTablesResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetTablesResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tables.size());
        for (Table _iter836 : struct.tables)
        {
          _iter836.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetTablesResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list837 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tables = new ArrayList<Table>(_list837.size);
        Table _elem838;
        for (int _i839 = 0; _i839 < _list837.size; ++_i839)
        {
          _elem838 = new Table();
          _elem838.read(iprot);
          struct.tables.add(_elem838);
        }
      }
      struct.setTablesIsSet(true);
    }
  }

}

