/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-25")
public class UTR_data implements org.apache.thrift.TBase<UTR_data, UTR_data._Fields>, java.io.Serializable, Cloneable, Comparable<UTR_data> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UTR_data");

  private static final org.apache.thrift.protocol.TField UTR_LOCATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("utr_locations", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField UTR_DNA_SEQUENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("utr_dna_sequence", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UTR_dataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UTR_dataTupleSchemeFactory());
  }

  public List<Region> utr_locations; // required
  public String utr_dna_sequence; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UTR_LOCATIONS((short)1, "utr_locations"),
    UTR_DNA_SEQUENCE((short)2, "utr_dna_sequence");

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
        case 1: // UTR_LOCATIONS
          return UTR_LOCATIONS;
        case 2: // UTR_DNA_SEQUENCE
          return UTR_DNA_SEQUENCE;
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
    tmpMap.put(_Fields.UTR_LOCATIONS, new org.apache.thrift.meta_data.FieldMetaData("utr_locations", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Region.class))));
    tmpMap.put(_Fields.UTR_DNA_SEQUENCE, new org.apache.thrift.meta_data.FieldMetaData("utr_dna_sequence", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UTR_data.class, metaDataMap);
  }

  public UTR_data() {
  }

  public UTR_data(
    List<Region> utr_locations,
    String utr_dna_sequence)
  {
    this();
    this.utr_locations = utr_locations;
    this.utr_dna_sequence = utr_dna_sequence;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UTR_data(UTR_data other) {
    if (other.isSetUtr_locations()) {
      List<Region> __this__utr_locations = new ArrayList<Region>(other.utr_locations.size());
      for (Region other_element : other.utr_locations) {
        __this__utr_locations.add(new Region(other_element));
      }
      this.utr_locations = __this__utr_locations;
    }
    if (other.isSetUtr_dna_sequence()) {
      this.utr_dna_sequence = other.utr_dna_sequence;
    }
  }

  public UTR_data deepCopy() {
    return new UTR_data(this);
  }

  @Override
  public void clear() {
    this.utr_locations = null;
    this.utr_dna_sequence = null;
  }

  public int getUtr_locationsSize() {
    return (this.utr_locations == null) ? 0 : this.utr_locations.size();
  }

  public java.util.Iterator<Region> getUtr_locationsIterator() {
    return (this.utr_locations == null) ? null : this.utr_locations.iterator();
  }

  public void addToUtr_locations(Region elem) {
    if (this.utr_locations == null) {
      this.utr_locations = new ArrayList<Region>();
    }
    this.utr_locations.add(elem);
  }

  public List<Region> getUtr_locations() {
    return this.utr_locations;
  }

  public UTR_data setUtr_locations(List<Region> utr_locations) {
    this.utr_locations = utr_locations;
    return this;
  }

  public void unsetUtr_locations() {
    this.utr_locations = null;
  }

  /** Returns true if field utr_locations is set (has been assigned a value) and false otherwise */
  public boolean isSetUtr_locations() {
    return this.utr_locations != null;
  }

  public void setUtr_locationsIsSet(boolean value) {
    if (!value) {
      this.utr_locations = null;
    }
  }

  public String getUtr_dna_sequence() {
    return this.utr_dna_sequence;
  }

  public UTR_data setUtr_dna_sequence(String utr_dna_sequence) {
    this.utr_dna_sequence = utr_dna_sequence;
    return this;
  }

  public void unsetUtr_dna_sequence() {
    this.utr_dna_sequence = null;
  }

  /** Returns true if field utr_dna_sequence is set (has been assigned a value) and false otherwise */
  public boolean isSetUtr_dna_sequence() {
    return this.utr_dna_sequence != null;
  }

  public void setUtr_dna_sequenceIsSet(boolean value) {
    if (!value) {
      this.utr_dna_sequence = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UTR_LOCATIONS:
      if (value == null) {
        unsetUtr_locations();
      } else {
        setUtr_locations((List<Region>)value);
      }
      break;

    case UTR_DNA_SEQUENCE:
      if (value == null) {
        unsetUtr_dna_sequence();
      } else {
        setUtr_dna_sequence((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UTR_LOCATIONS:
      return getUtr_locations();

    case UTR_DNA_SEQUENCE:
      return getUtr_dna_sequence();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UTR_LOCATIONS:
      return isSetUtr_locations();
    case UTR_DNA_SEQUENCE:
      return isSetUtr_dna_sequence();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UTR_data)
      return this.equals((UTR_data)that);
    return false;
  }

  public boolean equals(UTR_data that) {
    if (that == null)
      return false;

    boolean this_present_utr_locations = true && this.isSetUtr_locations();
    boolean that_present_utr_locations = true && that.isSetUtr_locations();
    if (this_present_utr_locations || that_present_utr_locations) {
      if (!(this_present_utr_locations && that_present_utr_locations))
        return false;
      if (!this.utr_locations.equals(that.utr_locations))
        return false;
    }

    boolean this_present_utr_dna_sequence = true && this.isSetUtr_dna_sequence();
    boolean that_present_utr_dna_sequence = true && that.isSetUtr_dna_sequence();
    if (this_present_utr_dna_sequence || that_present_utr_dna_sequence) {
      if (!(this_present_utr_dna_sequence && that_present_utr_dna_sequence))
        return false;
      if (!this.utr_dna_sequence.equals(that.utr_dna_sequence))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_utr_locations = true && (isSetUtr_locations());
    list.add(present_utr_locations);
    if (present_utr_locations)
      list.add(utr_locations);

    boolean present_utr_dna_sequence = true && (isSetUtr_dna_sequence());
    list.add(present_utr_dna_sequence);
    if (present_utr_dna_sequence)
      list.add(utr_dna_sequence);

    return list.hashCode();
  }

  @Override
  public int compareTo(UTR_data other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUtr_locations()).compareTo(other.isSetUtr_locations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUtr_locations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.utr_locations, other.utr_locations);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUtr_dna_sequence()).compareTo(other.isSetUtr_dna_sequence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUtr_dna_sequence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.utr_dna_sequence, other.utr_dna_sequence);
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
    StringBuilder sb = new StringBuilder("UTR_data(");
    boolean first = true;

    sb.append("utr_locations:");
    if (this.utr_locations == null) {
      sb.append("null");
    } else {
      sb.append(this.utr_locations);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("utr_dna_sequence:");
    if (this.utr_dna_sequence == null) {
      sb.append("null");
    } else {
      sb.append(this.utr_dna_sequence);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class UTR_dataStandardSchemeFactory implements SchemeFactory {
    public UTR_dataStandardScheme getScheme() {
      return new UTR_dataStandardScheme();
    }
  }

  private static class UTR_dataStandardScheme extends StandardScheme<UTR_data> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UTR_data struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UTR_LOCATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list216 = iprot.readListBegin();
                struct.utr_locations = new ArrayList<Region>(_list216.size);
                Region _elem217;
                for (int _i218 = 0; _i218 < _list216.size; ++_i218)
                {
                  _elem217 = new Region();
                  _elem217.read(iprot);
                  struct.utr_locations.add(_elem217);
                }
                iprot.readListEnd();
              }
              struct.setUtr_locationsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UTR_DNA_SEQUENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.utr_dna_sequence = iprot.readString();
              struct.setUtr_dna_sequenceIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UTR_data struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.utr_locations != null) {
        oprot.writeFieldBegin(UTR_LOCATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.utr_locations.size()));
          for (Region _iter219 : struct.utr_locations)
          {
            _iter219.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.utr_dna_sequence != null) {
        oprot.writeFieldBegin(UTR_DNA_SEQUENCE_FIELD_DESC);
        oprot.writeString(struct.utr_dna_sequence);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UTR_dataTupleSchemeFactory implements SchemeFactory {
    public UTR_dataTupleScheme getScheme() {
      return new UTR_dataTupleScheme();
    }
  }

  private static class UTR_dataTupleScheme extends TupleScheme<UTR_data> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UTR_data struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUtr_locations()) {
        optionals.set(0);
      }
      if (struct.isSetUtr_dna_sequence()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUtr_locations()) {
        {
          oprot.writeI32(struct.utr_locations.size());
          for (Region _iter220 : struct.utr_locations)
          {
            _iter220.write(oprot);
          }
        }
      }
      if (struct.isSetUtr_dna_sequence()) {
        oprot.writeString(struct.utr_dna_sequence);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UTR_data struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list221 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.utr_locations = new ArrayList<Region>(_list221.size);
          Region _elem222;
          for (int _i223 = 0; _i223 < _list221.size; ++_i223)
          {
            _elem222 = new Region();
            _elem222.read(iprot);
            struct.utr_locations.add(_elem222);
          }
        }
        struct.setUtr_locationsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.utr_dna_sequence = iprot.readString();
        struct.setUtr_dna_sequenceIsSet(true);
      }
    }
  }

}
