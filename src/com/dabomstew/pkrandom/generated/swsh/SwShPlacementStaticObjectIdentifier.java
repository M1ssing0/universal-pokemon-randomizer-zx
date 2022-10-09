// automatically generated by the FlatBuffers compiler, do not modify

package com.dabomstew.pkrandom.generated.swsh;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class SwShPlacementStaticObjectIdentifier extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SwShPlacementStaticObjectIdentifier getRootAsSwShPlacementStaticObjectIdentifier(ByteBuffer _bb) { return getRootAsSwShPlacementStaticObjectIdentifier(_bb, new SwShPlacementStaticObjectIdentifier()); }
  public static SwShPlacementStaticObjectIdentifier getRootAsSwShPlacementStaticObjectIdentifier(ByteBuffer _bb, SwShPlacementStaticObjectIdentifier obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SwShPlacementStaticObjectIdentifier __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public float locationX() { int o = __offset(4); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public boolean mutateLocationX(float location_x) { int o = __offset(4); if (o != 0) { bb.putFloat(o + bb_pos, location_x); return true; } else { return false; } }
  public float locationY() { int o = __offset(6); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public boolean mutateLocationY(float location_y) { int o = __offset(6); if (o != 0) { bb.putFloat(o + bb_pos, location_y); return true; } else { return false; } }
  public float locationZ() { int o = __offset(8); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public boolean mutateLocationZ(float location_z) { int o = __offset(8); if (o != 0) { bb.putFloat(o + bb_pos, location_z); return true; } else { return false; } }
  public long field3() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateField3(long field_3) { int o = __offset(10); if (o != 0) { bb.putInt(o + bb_pos, (int)field_3); return true; } else { return false; } }
  public long field4() { int o = __offset(12); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateField4(long field_4) { int o = __offset(12); if (o != 0) { bb.putInt(o + bb_pos, (int)field_4); return true; } else { return false; } }
  public long field5() { int o = __offset(14); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateField5(long field_5) { int o = __offset(14); if (o != 0) { bb.putInt(o + bb_pos, (int)field_5); return true; } else { return false; } }
  public float field6() { int o = __offset(16); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public boolean mutateField6(float field_6) { int o = __offset(16); if (o != 0) { bb.putFloat(o + bb_pos, field_6); return true; } else { return false; } }
  public float field7() { int o = __offset(18); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public boolean mutateField7(float field_7) { int o = __offset(18); if (o != 0) { bb.putFloat(o + bb_pos, field_7); return true; } else { return false; } }
  public float field8() { int o = __offset(20); return o != 0 ? bb.getFloat(o + bb_pos) : 0.0f; }
  public boolean mutateField8(float field_8) { int o = __offset(20); if (o != 0) { bb.putFloat(o + bb_pos, field_8); return true; } else { return false; } }
  public long spawnerId() { int o = __offset(22); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateSpawnerId(long spawner_id) { int o = __offset(22); if (o != 0) { bb.putLong(o + bb_pos, spawner_id); return true; } else { return false; } }
  public long fieldA() { int o = __offset(24); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateFieldA(long field_a) { int o = __offset(24); if (o != 0) { bb.putLong(o + bb_pos, field_a); return true; } else { return false; } }
  public long fieldB() { int o = __offset(26); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateFieldB(long field_b) { int o = __offset(26); if (o != 0) { bb.putLong(o + bb_pos, field_b); return true; } else { return false; } }

  public static int createSwShPlacementStaticObjectIdentifier(FlatBufferBuilder builder,
      float location_x,
      float location_y,
      float location_z,
      long field_3,
      long field_4,
      long field_5,
      float field_6,
      float field_7,
      float field_8,
      long spawner_id,
      long field_a,
      long field_b) {
    builder.startTable(12);
    SwShPlacementStaticObjectIdentifier.addFieldB(builder, field_b);
    SwShPlacementStaticObjectIdentifier.addFieldA(builder, field_a);
    SwShPlacementStaticObjectIdentifier.addSpawnerId(builder, spawner_id);
    SwShPlacementStaticObjectIdentifier.addField8(builder, field_8);
    SwShPlacementStaticObjectIdentifier.addField7(builder, field_7);
    SwShPlacementStaticObjectIdentifier.addField6(builder, field_6);
    SwShPlacementStaticObjectIdentifier.addField5(builder, field_5);
    SwShPlacementStaticObjectIdentifier.addField4(builder, field_4);
    SwShPlacementStaticObjectIdentifier.addField3(builder, field_3);
    SwShPlacementStaticObjectIdentifier.addLocationZ(builder, location_z);
    SwShPlacementStaticObjectIdentifier.addLocationY(builder, location_y);
    SwShPlacementStaticObjectIdentifier.addLocationX(builder, location_x);
    return SwShPlacementStaticObjectIdentifier.endSwShPlacementStaticObjectIdentifier(builder);
  }

  public static void startSwShPlacementStaticObjectIdentifier(FlatBufferBuilder builder) { builder.startTable(12); }
  public static void addLocationX(FlatBufferBuilder builder, float locationX) { builder.addFloat(0, locationX, 0.0f); }
  public static void addLocationY(FlatBufferBuilder builder, float locationY) { builder.addFloat(1, locationY, 0.0f); }
  public static void addLocationZ(FlatBufferBuilder builder, float locationZ) { builder.addFloat(2, locationZ, 0.0f); }
  public static void addField3(FlatBufferBuilder builder, long field3) { builder.addInt(3, (int)field3, (int)0L); }
  public static void addField4(FlatBufferBuilder builder, long field4) { builder.addInt(4, (int)field4, (int)0L); }
  public static void addField5(FlatBufferBuilder builder, long field5) { builder.addInt(5, (int)field5, (int)0L); }
  public static void addField6(FlatBufferBuilder builder, float field6) { builder.addFloat(6, field6, 0.0f); }
  public static void addField7(FlatBufferBuilder builder, float field7) { builder.addFloat(7, field7, 0.0f); }
  public static void addField8(FlatBufferBuilder builder, float field8) { builder.addFloat(8, field8, 0.0f); }
  public static void addSpawnerId(FlatBufferBuilder builder, long spawnerId) { builder.addLong(9, spawnerId, 0L); }
  public static void addFieldA(FlatBufferBuilder builder, long fieldA) { builder.addLong(10, fieldA, 0L); }
  public static void addFieldB(FlatBufferBuilder builder, long fieldB) { builder.addLong(11, fieldB, 0L); }
  public static int endSwShPlacementStaticObjectIdentifier(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SwShPlacementStaticObjectIdentifier get(int j) { return get(new SwShPlacementStaticObjectIdentifier(), j); }
    public SwShPlacementStaticObjectIdentifier get(SwShPlacementStaticObjectIdentifier obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

