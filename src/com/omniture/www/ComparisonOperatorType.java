/**
 * ComparisonOperatorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.omniture.www;

public class ComparisonOperatorType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ComparisonOperatorType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "=";
    public static final java.lang.String _value2 = "!=";
    public static final java.lang.String _value3 = ">";
    public static final java.lang.String _value4 = ">=";
    public static final java.lang.String _value5 = "<";
    public static final java.lang.String _value6 = "<=";
    public static final java.lang.String _value7 = "contains";
    public static final java.lang.String _value8 = "not-contains";
    public static final java.lang.String _value9 = "contains-all";
    public static final java.lang.String _value10 = "not-contains-all";
    public static final java.lang.String _value11 = "contains-any";
    public static final java.lang.String _value12 = "not-contains-any";
    public static final ComparisonOperatorType value1 = new ComparisonOperatorType(_value1);
    public static final ComparisonOperatorType value2 = new ComparisonOperatorType(_value2);
    public static final ComparisonOperatorType value3 = new ComparisonOperatorType(_value3);
    public static final ComparisonOperatorType value4 = new ComparisonOperatorType(_value4);
    public static final ComparisonOperatorType value5 = new ComparisonOperatorType(_value5);
    public static final ComparisonOperatorType value6 = new ComparisonOperatorType(_value6);
    public static final ComparisonOperatorType value7 = new ComparisonOperatorType(_value7);
    public static final ComparisonOperatorType value8 = new ComparisonOperatorType(_value8);
    public static final ComparisonOperatorType value9 = new ComparisonOperatorType(_value9);
    public static final ComparisonOperatorType value10 = new ComparisonOperatorType(_value10);
    public static final ComparisonOperatorType value11 = new ComparisonOperatorType(_value11);
    public static final ComparisonOperatorType value12 = new ComparisonOperatorType(_value12);
    public java.lang.String getValue() { return _value_;}
    public static ComparisonOperatorType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ComparisonOperatorType enumeration = (ComparisonOperatorType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ComparisonOperatorType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComparisonOperatorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.omniture.com/", "comparisonOperatorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
