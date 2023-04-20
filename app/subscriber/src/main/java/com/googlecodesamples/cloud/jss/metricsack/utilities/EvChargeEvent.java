/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.googlecodesamples.cloud.jss.metricsack.utilities;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class EvChargeEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7423986406024657921L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EvChargeEvent\",\"namespace\":\"com.googlecodesamples.cloud.jss.metricsack.utilities\",\"fields\":[{\"name\":\"session_id\",\"type\":\"string\"},{\"name\":\"station_id\",\"type\":\"int\"},{\"name\":\"location\",\"type\":\"string\"},{\"name\":\"session_start_time\",\"type\":\"string\"},{\"name\":\"session_end_time\",\"type\":\"string\"},{\"name\":\"avg_charge_rate_kw\",\"type\":\"float\"},{\"name\":\"battery_capacity_kwh\",\"type\":\"float\"},{\"name\":\"battery_level_start\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EvChargeEvent> ENCODER =
      new BinaryMessageEncoder<EvChargeEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EvChargeEvent> DECODER =
      new BinaryMessageDecoder<EvChargeEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EvChargeEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EvChargeEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EvChargeEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<EvChargeEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EvChargeEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EvChargeEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EvChargeEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EvChargeEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence session_id;
  private int station_id;
  private java.lang.CharSequence location;
  private java.lang.CharSequence session_start_time;
  private java.lang.CharSequence session_end_time;
  private float avg_charge_rate_kw;
  private float battery_capacity_kwh;
  private float battery_level_start;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EvChargeEvent() {}

  /**
   * All-args constructor.
   * @param session_id The new value for session_id
   * @param station_id The new value for station_id
   * @param location The new value for location
   * @param session_start_time The new value for session_start_time
   * @param session_end_time The new value for session_end_time
   * @param avg_charge_rate_kw The new value for avg_charge_rate_kw
   * @param battery_capacity_kwh The new value for battery_capacity_kwh
   * @param battery_level_start The new value for battery_level_start
   */
  public EvChargeEvent(java.lang.CharSequence session_id, java.lang.Integer station_id, java.lang.CharSequence location, java.lang.CharSequence session_start_time, java.lang.CharSequence session_end_time, java.lang.Float avg_charge_rate_kw, java.lang.Float battery_capacity_kwh, java.lang.Float battery_level_start) {
    this.session_id = session_id;
    this.station_id = station_id;
    this.location = location;
    this.session_start_time = session_start_time;
    this.session_end_time = session_end_time;
    this.avg_charge_rate_kw = avg_charge_rate_kw;
    this.battery_capacity_kwh = battery_capacity_kwh;
    this.battery_level_start = battery_level_start;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return session_id;
    case 1: return station_id;
    case 2: return location;
    case 3: return session_start_time;
    case 4: return session_end_time;
    case 5: return avg_charge_rate_kw;
    case 6: return battery_capacity_kwh;
    case 7: return battery_level_start;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: session_id = (java.lang.CharSequence)value$; break;
    case 1: station_id = (java.lang.Integer)value$; break;
    case 2: location = (java.lang.CharSequence)value$; break;
    case 3: session_start_time = (java.lang.CharSequence)value$; break;
    case 4: session_end_time = (java.lang.CharSequence)value$; break;
    case 5: avg_charge_rate_kw = (java.lang.Float)value$; break;
    case 6: battery_capacity_kwh = (java.lang.Float)value$; break;
    case 7: battery_level_start = (java.lang.Float)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'session_id' field.
   * @return The value of the 'session_id' field.
   */
  public java.lang.CharSequence getSessionId() {
    return session_id;
  }


  /**
   * Sets the value of the 'session_id' field.
   * @param value the value to set.
   */
  public void setSessionId(java.lang.CharSequence value) {
    this.session_id = value;
  }

  /**
   * Gets the value of the 'station_id' field.
   * @return The value of the 'station_id' field.
   */
  public int getStationId() {
    return station_id;
  }


  /**
   * Sets the value of the 'station_id' field.
   * @param value the value to set.
   */
  public void setStationId(int value) {
    this.station_id = value;
  }

  /**
   * Gets the value of the 'location' field.
   * @return The value of the 'location' field.
   */
  public java.lang.CharSequence getLocation() {
    return location;
  }


  /**
   * Sets the value of the 'location' field.
   * @param value the value to set.
   */
  public void setLocation(java.lang.CharSequence value) {
    this.location = value;
  }

  /**
   * Gets the value of the 'session_start_time' field.
   * @return The value of the 'session_start_time' field.
   */
  public java.lang.CharSequence getSessionStartTime() {
    return session_start_time;
  }


  /**
   * Sets the value of the 'session_start_time' field.
   * @param value the value to set.
   */
  public void setSessionStartTime(java.lang.CharSequence value) {
    this.session_start_time = value;
  }

  /**
   * Gets the value of the 'session_end_time' field.
   * @return The value of the 'session_end_time' field.
   */
  public java.lang.CharSequence getSessionEndTime() {
    return session_end_time;
  }


  /**
   * Sets the value of the 'session_end_time' field.
   * @param value the value to set.
   */
  public void setSessionEndTime(java.lang.CharSequence value) {
    this.session_end_time = value;
  }

  /**
   * Gets the value of the 'avg_charge_rate_kw' field.
   * @return The value of the 'avg_charge_rate_kw' field.
   */
  public float getAvgChargeRateKw() {
    return avg_charge_rate_kw;
  }


  /**
   * Sets the value of the 'avg_charge_rate_kw' field.
   * @param value the value to set.
   */
  public void setAvgChargeRateKw(float value) {
    this.avg_charge_rate_kw = value;
  }

  /**
   * Gets the value of the 'battery_capacity_kwh' field.
   * @return The value of the 'battery_capacity_kwh' field.
   */
  public float getBatteryCapacityKwh() {
    return battery_capacity_kwh;
  }


  /**
   * Sets the value of the 'battery_capacity_kwh' field.
   * @param value the value to set.
   */
  public void setBatteryCapacityKwh(float value) {
    this.battery_capacity_kwh = value;
  }

  /**
   * Gets the value of the 'battery_level_start' field.
   * @return The value of the 'battery_level_start' field.
   */
  public float getBatteryLevelStart() {
    return battery_level_start;
  }


  /**
   * Sets the value of the 'battery_level_start' field.
   * @param value the value to set.
   */
  public void setBatteryLevelStart(float value) {
    this.battery_level_start = value;
  }

  /**
   * Creates a new EvChargeEvent RecordBuilder.
   * @return A new EvChargeEvent RecordBuilder
   */
  public static com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder newBuilder() {
    return new com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder();
  }

  /**
   * Creates a new EvChargeEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EvChargeEvent RecordBuilder
   */
  public static com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder newBuilder(com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder other) {
    if (other == null) {
      return new com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder();
    } else {
      return new com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder(other);
    }
  }

  /**
   * Creates a new EvChargeEvent RecordBuilder by copying an existing EvChargeEvent instance.
   * @param other The existing instance to copy.
   * @return A new EvChargeEvent RecordBuilder
   */
  public static com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder newBuilder(com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent other) {
    if (other == null) {
      return new com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder();
    } else {
      return new com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for EvChargeEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EvChargeEvent>
    implements org.apache.avro.data.RecordBuilder<EvChargeEvent> {

    private java.lang.CharSequence session_id;
    private int station_id;
    private java.lang.CharSequence location;
    private java.lang.CharSequence session_start_time;
    private java.lang.CharSequence session_end_time;
    private float avg_charge_rate_kw;
    private float battery_capacity_kwh;
    private float battery_level_start;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.session_id)) {
        this.session_id = data().deepCopy(fields()[0].schema(), other.session_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.station_id)) {
        this.station_id = data().deepCopy(fields()[1].schema(), other.station_id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.location)) {
        this.location = data().deepCopy(fields()[2].schema(), other.location);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.session_start_time)) {
        this.session_start_time = data().deepCopy(fields()[3].schema(), other.session_start_time);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.session_end_time)) {
        this.session_end_time = data().deepCopy(fields()[4].schema(), other.session_end_time);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.avg_charge_rate_kw)) {
        this.avg_charge_rate_kw = data().deepCopy(fields()[5].schema(), other.avg_charge_rate_kw);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.battery_capacity_kwh)) {
        this.battery_capacity_kwh = data().deepCopy(fields()[6].schema(), other.battery_capacity_kwh);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.battery_level_start)) {
        this.battery_level_start = data().deepCopy(fields()[7].schema(), other.battery_level_start);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing EvChargeEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.session_id)) {
        this.session_id = data().deepCopy(fields()[0].schema(), other.session_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.station_id)) {
        this.station_id = data().deepCopy(fields()[1].schema(), other.station_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.location)) {
        this.location = data().deepCopy(fields()[2].schema(), other.location);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.session_start_time)) {
        this.session_start_time = data().deepCopy(fields()[3].schema(), other.session_start_time);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.session_end_time)) {
        this.session_end_time = data().deepCopy(fields()[4].schema(), other.session_end_time);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.avg_charge_rate_kw)) {
        this.avg_charge_rate_kw = data().deepCopy(fields()[5].schema(), other.avg_charge_rate_kw);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.battery_capacity_kwh)) {
        this.battery_capacity_kwh = data().deepCopy(fields()[6].schema(), other.battery_capacity_kwh);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.battery_level_start)) {
        this.battery_level_start = data().deepCopy(fields()[7].schema(), other.battery_level_start);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'session_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getSessionId() {
      return session_id;
    }


    /**
      * Sets the value of the 'session_id' field.
      * @param value The value of 'session_id'.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder setSessionId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.session_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'session_id' field has been set.
      * @return True if the 'session_id' field has been set, false otherwise.
      */
    public boolean hasSessionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'session_id' field.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder clearSessionId() {
      session_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'station_id' field.
      * @return The value.
      */
    public int getStationId() {
      return station_id;
    }


    /**
      * Sets the value of the 'station_id' field.
      * @param value The value of 'station_id'.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder setStationId(int value) {
      validate(fields()[1], value);
      this.station_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'station_id' field has been set.
      * @return True if the 'station_id' field has been set, false otherwise.
      */
    public boolean hasStationId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'station_id' field.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder clearStationId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * @return The value.
      */
    public java.lang.CharSequence getLocation() {
      return location;
    }


    /**
      * Sets the value of the 'location' field.
      * @param value The value of 'location'.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder setLocation(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.location = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'location' field.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder clearLocation() {
      location = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'session_start_time' field.
      * @return The value.
      */
    public java.lang.CharSequence getSessionStartTime() {
      return session_start_time;
    }


    /**
      * Sets the value of the 'session_start_time' field.
      * @param value The value of 'session_start_time'.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder setSessionStartTime(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.session_start_time = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'session_start_time' field has been set.
      * @return True if the 'session_start_time' field has been set, false otherwise.
      */
    public boolean hasSessionStartTime() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'session_start_time' field.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder clearSessionStartTime() {
      session_start_time = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'session_end_time' field.
      * @return The value.
      */
    public java.lang.CharSequence getSessionEndTime() {
      return session_end_time;
    }


    /**
      * Sets the value of the 'session_end_time' field.
      * @param value The value of 'session_end_time'.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder setSessionEndTime(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.session_end_time = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'session_end_time' field has been set.
      * @return True if the 'session_end_time' field has been set, false otherwise.
      */
    public boolean hasSessionEndTime() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'session_end_time' field.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder clearSessionEndTime() {
      session_end_time = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'avg_charge_rate_kw' field.
      * @return The value.
      */
    public float getAvgChargeRateKw() {
      return avg_charge_rate_kw;
    }


    /**
      * Sets the value of the 'avg_charge_rate_kw' field.
      * @param value The value of 'avg_charge_rate_kw'.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder setAvgChargeRateKw(float value) {
      validate(fields()[5], value);
      this.avg_charge_rate_kw = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'avg_charge_rate_kw' field has been set.
      * @return True if the 'avg_charge_rate_kw' field has been set, false otherwise.
      */
    public boolean hasAvgChargeRateKw() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'avg_charge_rate_kw' field.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder clearAvgChargeRateKw() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'battery_capacity_kwh' field.
      * @return The value.
      */
    public float getBatteryCapacityKwh() {
      return battery_capacity_kwh;
    }


    /**
      * Sets the value of the 'battery_capacity_kwh' field.
      * @param value The value of 'battery_capacity_kwh'.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder setBatteryCapacityKwh(float value) {
      validate(fields()[6], value);
      this.battery_capacity_kwh = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'battery_capacity_kwh' field has been set.
      * @return True if the 'battery_capacity_kwh' field has been set, false otherwise.
      */
    public boolean hasBatteryCapacityKwh() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'battery_capacity_kwh' field.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder clearBatteryCapacityKwh() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'battery_level_start' field.
      * @return The value.
      */
    public float getBatteryLevelStart() {
      return battery_level_start;
    }


    /**
      * Sets the value of the 'battery_level_start' field.
      * @param value The value of 'battery_level_start'.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder setBatteryLevelStart(float value) {
      validate(fields()[7], value);
      this.battery_level_start = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'battery_level_start' field has been set.
      * @return True if the 'battery_level_start' field has been set, false otherwise.
      */
    public boolean hasBatteryLevelStart() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'battery_level_start' field.
      * @return This builder.
      */
    public com.googlecodesamples.cloud.jss.metricsack.utilities.EvChargeEvent.Builder clearBatteryLevelStart() {
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EvChargeEvent build() {
      try {
        EvChargeEvent record = new EvChargeEvent();
        record.session_id = fieldSetFlags()[0] ? this.session_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.station_id = fieldSetFlags()[1] ? this.station_id : (java.lang.Integer) defaultValue(fields()[1]);
        record.location = fieldSetFlags()[2] ? this.location : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.session_start_time = fieldSetFlags()[3] ? this.session_start_time : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.session_end_time = fieldSetFlags()[4] ? this.session_end_time : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.avg_charge_rate_kw = fieldSetFlags()[5] ? this.avg_charge_rate_kw : (java.lang.Float) defaultValue(fields()[5]);
        record.battery_capacity_kwh = fieldSetFlags()[6] ? this.battery_capacity_kwh : (java.lang.Float) defaultValue(fields()[6]);
        record.battery_level_start = fieldSetFlags()[7] ? this.battery_level_start : (java.lang.Float) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EvChargeEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<EvChargeEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EvChargeEvent>
    READER$ = (org.apache.avro.io.DatumReader<EvChargeEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.session_id);

    out.writeInt(this.station_id);

    out.writeString(this.location);

    out.writeString(this.session_start_time);

    out.writeString(this.session_end_time);

    out.writeFloat(this.avg_charge_rate_kw);

    out.writeFloat(this.battery_capacity_kwh);

    out.writeFloat(this.battery_level_start);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.session_id = in.readString(this.session_id instanceof Utf8 ? (Utf8)this.session_id : null);

      this.station_id = in.readInt();

      this.location = in.readString(this.location instanceof Utf8 ? (Utf8)this.location : null);

      this.session_start_time = in.readString(this.session_start_time instanceof Utf8 ? (Utf8)this.session_start_time : null);

      this.session_end_time = in.readString(this.session_end_time instanceof Utf8 ? (Utf8)this.session_end_time : null);

      this.avg_charge_rate_kw = in.readFloat();

      this.battery_capacity_kwh = in.readFloat();

      this.battery_level_start = in.readFloat();

    } else {
      for (int i = 0; i < 8; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.session_id = in.readString(this.session_id instanceof Utf8 ? (Utf8)this.session_id : null);
          break;

        case 1:
          this.station_id = in.readInt();
          break;

        case 2:
          this.location = in.readString(this.location instanceof Utf8 ? (Utf8)this.location : null);
          break;

        case 3:
          this.session_start_time = in.readString(this.session_start_time instanceof Utf8 ? (Utf8)this.session_start_time : null);
          break;

        case 4:
          this.session_end_time = in.readString(this.session_end_time instanceof Utf8 ? (Utf8)this.session_end_time : null);
          break;

        case 5:
          this.avg_charge_rate_kw = in.readFloat();
          break;

        case 6:
          this.battery_capacity_kwh = in.readFloat();
          break;

        case 7:
          this.battery_level_start = in.readFloat();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









