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
public class WMAlterResourcePlanRequest implements org.apache.thrift.TBase<WMAlterResourcePlanRequest, WMAlterResourcePlanRequest._Fields>, java.io.Serializable, Cloneable, Comparable<WMAlterResourcePlanRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WMAlterResourcePlanRequest");

  private static final org.apache.thrift.protocol.TField RESOURCE_PLAN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("resourcePlanName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField RESOURCE_PLAN_FIELD_DESC = new org.apache.thrift.protocol.TField("resourcePlan", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField IS_ENABLE_AND_ACTIVATE_FIELD_DESC = new org.apache.thrift.protocol.TField("isEnableAndActivate", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField IS_FORCE_DEACTIVATE_FIELD_DESC = new org.apache.thrift.protocol.TField("isForceDeactivate", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WMAlterResourcePlanRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WMAlterResourcePlanRequestTupleSchemeFactory());
  }

  private String resourcePlanName; // optional
  private WMResourcePlan resourcePlan; // optional
  private boolean isEnableAndActivate; // optional
  private boolean isForceDeactivate; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESOURCE_PLAN_NAME((short)1, "resourcePlanName"),
    RESOURCE_PLAN((short)2, "resourcePlan"),
    IS_ENABLE_AND_ACTIVATE((short)3, "isEnableAndActivate"),
    IS_FORCE_DEACTIVATE((short)4, "isForceDeactivate");

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
        case 1: // RESOURCE_PLAN_NAME
          return RESOURCE_PLAN_NAME;
        case 2: // RESOURCE_PLAN
          return RESOURCE_PLAN;
        case 3: // IS_ENABLE_AND_ACTIVATE
          return IS_ENABLE_AND_ACTIVATE;
        case 4: // IS_FORCE_DEACTIVATE
          return IS_FORCE_DEACTIVATE;
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
  private static final int __ISENABLEANDACTIVATE_ISSET_ID = 0;
  private static final int __ISFORCEDEACTIVATE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RESOURCE_PLAN_NAME,_Fields.RESOURCE_PLAN,_Fields.IS_ENABLE_AND_ACTIVATE,_Fields.IS_FORCE_DEACTIVATE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESOURCE_PLAN_NAME, new org.apache.thrift.meta_data.FieldMetaData("resourcePlanName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RESOURCE_PLAN, new org.apache.thrift.meta_data.FieldMetaData("resourcePlan", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, WMResourcePlan.class)));
    tmpMap.put(_Fields.IS_ENABLE_AND_ACTIVATE, new org.apache.thrift.meta_data.FieldMetaData("isEnableAndActivate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_FORCE_DEACTIVATE, new org.apache.thrift.meta_data.FieldMetaData("isForceDeactivate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WMAlterResourcePlanRequest.class, metaDataMap);
  }

  public WMAlterResourcePlanRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WMAlterResourcePlanRequest(WMAlterResourcePlanRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetResourcePlanName()) {
      this.resourcePlanName = other.resourcePlanName;
    }
    if (other.isSetResourcePlan()) {
      this.resourcePlan = new WMResourcePlan(other.resourcePlan);
    }
    this.isEnableAndActivate = other.isEnableAndActivate;
    this.isForceDeactivate = other.isForceDeactivate;
  }

  public WMAlterResourcePlanRequest deepCopy() {
    return new WMAlterResourcePlanRequest(this);
  }

  @Override
  public void clear() {
    this.resourcePlanName = null;
    this.resourcePlan = null;
    setIsEnableAndActivateIsSet(false);
    this.isEnableAndActivate = false;
    setIsForceDeactivateIsSet(false);
    this.isForceDeactivate = false;
  }

  public String getResourcePlanName() {
    return this.resourcePlanName;
  }

  public void setResourcePlanName(String resourcePlanName) {
    this.resourcePlanName = resourcePlanName;
  }

  public void unsetResourcePlanName() {
    this.resourcePlanName = null;
  }

  /** Returns true if field resourcePlanName is set (has been assigned a value) and false otherwise */
  public boolean isSetResourcePlanName() {
    return this.resourcePlanName != null;
  }

  public void setResourcePlanNameIsSet(boolean value) {
    if (!value) {
      this.resourcePlanName = null;
    }
  }

  public WMResourcePlan getResourcePlan() {
    return this.resourcePlan;
  }

  public void setResourcePlan(WMResourcePlan resourcePlan) {
    this.resourcePlan = resourcePlan;
  }

  public void unsetResourcePlan() {
    this.resourcePlan = null;
  }

  /** Returns true if field resourcePlan is set (has been assigned a value) and false otherwise */
  public boolean isSetResourcePlan() {
    return this.resourcePlan != null;
  }

  public void setResourcePlanIsSet(boolean value) {
    if (!value) {
      this.resourcePlan = null;
    }
  }

  public boolean isIsEnableAndActivate() {
    return this.isEnableAndActivate;
  }

  public void setIsEnableAndActivate(boolean isEnableAndActivate) {
    this.isEnableAndActivate = isEnableAndActivate;
    setIsEnableAndActivateIsSet(true);
  }

  public void unsetIsEnableAndActivate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISENABLEANDACTIVATE_ISSET_ID);
  }

  /** Returns true if field isEnableAndActivate is set (has been assigned a value) and false otherwise */
  public boolean isSetIsEnableAndActivate() {
    return EncodingUtils.testBit(__isset_bitfield, __ISENABLEANDACTIVATE_ISSET_ID);
  }

  public void setIsEnableAndActivateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISENABLEANDACTIVATE_ISSET_ID, value);
  }

  public boolean isIsForceDeactivate() {
    return this.isForceDeactivate;
  }

  public void setIsForceDeactivate(boolean isForceDeactivate) {
    this.isForceDeactivate = isForceDeactivate;
    setIsForceDeactivateIsSet(true);
  }

  public void unsetIsForceDeactivate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISFORCEDEACTIVATE_ISSET_ID);
  }

  /** Returns true if field isForceDeactivate is set (has been assigned a value) and false otherwise */
  public boolean isSetIsForceDeactivate() {
    return EncodingUtils.testBit(__isset_bitfield, __ISFORCEDEACTIVATE_ISSET_ID);
  }

  public void setIsForceDeactivateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISFORCEDEACTIVATE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESOURCE_PLAN_NAME:
      if (value == null) {
        unsetResourcePlanName();
      } else {
        setResourcePlanName((String)value);
      }
      break;

    case RESOURCE_PLAN:
      if (value == null) {
        unsetResourcePlan();
      } else {
        setResourcePlan((WMResourcePlan)value);
      }
      break;

    case IS_ENABLE_AND_ACTIVATE:
      if (value == null) {
        unsetIsEnableAndActivate();
      } else {
        setIsEnableAndActivate((Boolean)value);
      }
      break;

    case IS_FORCE_DEACTIVATE:
      if (value == null) {
        unsetIsForceDeactivate();
      } else {
        setIsForceDeactivate((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESOURCE_PLAN_NAME:
      return getResourcePlanName();

    case RESOURCE_PLAN:
      return getResourcePlan();

    case IS_ENABLE_AND_ACTIVATE:
      return isIsEnableAndActivate();

    case IS_FORCE_DEACTIVATE:
      return isIsForceDeactivate();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESOURCE_PLAN_NAME:
      return isSetResourcePlanName();
    case RESOURCE_PLAN:
      return isSetResourcePlan();
    case IS_ENABLE_AND_ACTIVATE:
      return isSetIsEnableAndActivate();
    case IS_FORCE_DEACTIVATE:
      return isSetIsForceDeactivate();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WMAlterResourcePlanRequest)
      return this.equals((WMAlterResourcePlanRequest)that);
    return false;
  }

  public boolean equals(WMAlterResourcePlanRequest that) {
    if (that == null)
      return false;

    boolean this_present_resourcePlanName = true && this.isSetResourcePlanName();
    boolean that_present_resourcePlanName = true && that.isSetResourcePlanName();
    if (this_present_resourcePlanName || that_present_resourcePlanName) {
      if (!(this_present_resourcePlanName && that_present_resourcePlanName))
        return false;
      if (!this.resourcePlanName.equals(that.resourcePlanName))
        return false;
    }

    boolean this_present_resourcePlan = true && this.isSetResourcePlan();
    boolean that_present_resourcePlan = true && that.isSetResourcePlan();
    if (this_present_resourcePlan || that_present_resourcePlan) {
      if (!(this_present_resourcePlan && that_present_resourcePlan))
        return false;
      if (!this.resourcePlan.equals(that.resourcePlan))
        return false;
    }

    boolean this_present_isEnableAndActivate = true && this.isSetIsEnableAndActivate();
    boolean that_present_isEnableAndActivate = true && that.isSetIsEnableAndActivate();
    if (this_present_isEnableAndActivate || that_present_isEnableAndActivate) {
      if (!(this_present_isEnableAndActivate && that_present_isEnableAndActivate))
        return false;
      if (this.isEnableAndActivate != that.isEnableAndActivate)
        return false;
    }

    boolean this_present_isForceDeactivate = true && this.isSetIsForceDeactivate();
    boolean that_present_isForceDeactivate = true && that.isSetIsForceDeactivate();
    if (this_present_isForceDeactivate || that_present_isForceDeactivate) {
      if (!(this_present_isForceDeactivate && that_present_isForceDeactivate))
        return false;
      if (this.isForceDeactivate != that.isForceDeactivate)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resourcePlanName = true && (isSetResourcePlanName());
    list.add(present_resourcePlanName);
    if (present_resourcePlanName)
      list.add(resourcePlanName);

    boolean present_resourcePlan = true && (isSetResourcePlan());
    list.add(present_resourcePlan);
    if (present_resourcePlan)
      list.add(resourcePlan);

    boolean present_isEnableAndActivate = true && (isSetIsEnableAndActivate());
    list.add(present_isEnableAndActivate);
    if (present_isEnableAndActivate)
      list.add(isEnableAndActivate);

    boolean present_isForceDeactivate = true && (isSetIsForceDeactivate());
    list.add(present_isForceDeactivate);
    if (present_isForceDeactivate)
      list.add(isForceDeactivate);

    return list.hashCode();
  }

  @Override
  public int compareTo(WMAlterResourcePlanRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResourcePlanName()).compareTo(other.isSetResourcePlanName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourcePlanName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourcePlanName, other.resourcePlanName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResourcePlan()).compareTo(other.isSetResourcePlan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourcePlan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourcePlan, other.resourcePlan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsEnableAndActivate()).compareTo(other.isSetIsEnableAndActivate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsEnableAndActivate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isEnableAndActivate, other.isEnableAndActivate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsForceDeactivate()).compareTo(other.isSetIsForceDeactivate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsForceDeactivate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isForceDeactivate, other.isForceDeactivate);
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
    StringBuilder sb = new StringBuilder("WMAlterResourcePlanRequest(");
    boolean first = true;

    if (isSetResourcePlanName()) {
      sb.append("resourcePlanName:");
      if (this.resourcePlanName == null) {
        sb.append("null");
      } else {
        sb.append(this.resourcePlanName);
      }
      first = false;
    }
    if (isSetResourcePlan()) {
      if (!first) sb.append(", ");
      sb.append("resourcePlan:");
      if (this.resourcePlan == null) {
        sb.append("null");
      } else {
        sb.append(this.resourcePlan);
      }
      first = false;
    }
    if (isSetIsEnableAndActivate()) {
      if (!first) sb.append(", ");
      sb.append("isEnableAndActivate:");
      sb.append(this.isEnableAndActivate);
      first = false;
    }
    if (isSetIsForceDeactivate()) {
      if (!first) sb.append(", ");
      sb.append("isForceDeactivate:");
      sb.append(this.isForceDeactivate);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (resourcePlan != null) {
      resourcePlan.validate();
    }
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

  private static class WMAlterResourcePlanRequestStandardSchemeFactory implements SchemeFactory {
    public WMAlterResourcePlanRequestStandardScheme getScheme() {
      return new WMAlterResourcePlanRequestStandardScheme();
    }
  }

  private static class WMAlterResourcePlanRequestStandardScheme extends StandardScheme<WMAlterResourcePlanRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WMAlterResourcePlanRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESOURCE_PLAN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resourcePlanName = iprot.readString();
              struct.setResourcePlanNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESOURCE_PLAN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resourcePlan = new WMResourcePlan();
              struct.resourcePlan.read(iprot);
              struct.setResourcePlanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_ENABLE_AND_ACTIVATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isEnableAndActivate = iprot.readBool();
              struct.setIsEnableAndActivateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_FORCE_DEACTIVATE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isForceDeactivate = iprot.readBool();
              struct.setIsForceDeactivateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WMAlterResourcePlanRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resourcePlanName != null) {
        if (struct.isSetResourcePlanName()) {
          oprot.writeFieldBegin(RESOURCE_PLAN_NAME_FIELD_DESC);
          oprot.writeString(struct.resourcePlanName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.resourcePlan != null) {
        if (struct.isSetResourcePlan()) {
          oprot.writeFieldBegin(RESOURCE_PLAN_FIELD_DESC);
          struct.resourcePlan.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIsEnableAndActivate()) {
        oprot.writeFieldBegin(IS_ENABLE_AND_ACTIVATE_FIELD_DESC);
        oprot.writeBool(struct.isEnableAndActivate);
        oprot.writeFieldEnd();
      }
      if (struct.isSetIsForceDeactivate()) {
        oprot.writeFieldBegin(IS_FORCE_DEACTIVATE_FIELD_DESC);
        oprot.writeBool(struct.isForceDeactivate);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WMAlterResourcePlanRequestTupleSchemeFactory implements SchemeFactory {
    public WMAlterResourcePlanRequestTupleScheme getScheme() {
      return new WMAlterResourcePlanRequestTupleScheme();
    }
  }

  private static class WMAlterResourcePlanRequestTupleScheme extends TupleScheme<WMAlterResourcePlanRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WMAlterResourcePlanRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResourcePlanName()) {
        optionals.set(0);
      }
      if (struct.isSetResourcePlan()) {
        optionals.set(1);
      }
      if (struct.isSetIsEnableAndActivate()) {
        optionals.set(2);
      }
      if (struct.isSetIsForceDeactivate()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetResourcePlanName()) {
        oprot.writeString(struct.resourcePlanName);
      }
      if (struct.isSetResourcePlan()) {
        struct.resourcePlan.write(oprot);
      }
      if (struct.isSetIsEnableAndActivate()) {
        oprot.writeBool(struct.isEnableAndActivate);
      }
      if (struct.isSetIsForceDeactivate()) {
        oprot.writeBool(struct.isForceDeactivate);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WMAlterResourcePlanRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.resourcePlanName = iprot.readString();
        struct.setResourcePlanNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.resourcePlan = new WMResourcePlan();
        struct.resourcePlan.read(iprot);
        struct.setResourcePlanIsSet(true);
      }
      if (incoming.get(2)) {
        struct.isEnableAndActivate = iprot.readBool();
        struct.setIsEnableAndActivateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isForceDeactivate = iprot.readBool();
        struct.setIsForceDeactivateIsSet(true);
      }
    }
  }

}

