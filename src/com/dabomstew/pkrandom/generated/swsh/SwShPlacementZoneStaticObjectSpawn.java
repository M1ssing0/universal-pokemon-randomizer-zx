// automatically generated by the FlatBuffers compiler, do not modify

package com.dabomstew.pkrandom.generated.swsh;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class SwShPlacementZoneStaticObjectSpawn extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SwShPlacementZoneStaticObjectSpawn getRootAsSwShPlacementZoneStaticObjectSpawn(ByteBuffer _bb) { return getRootAsSwShPlacementZoneStaticObjectSpawn(_bb, new SwShPlacementZoneStaticObjectSpawn()); }
  public static SwShPlacementZoneStaticObjectSpawn getRootAsSwShPlacementZoneStaticObjectSpawn(ByteBuffer _bb, SwShPlacementZoneStaticObjectSpawn obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SwShPlacementZoneStaticObjectSpawn __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long spawnId() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateSpawnId(long spawn_id) { int o = __offset(4); if (o != 0) { bb.putLong(o + bb_pos, spawn_id); return true; } else { return false; } }
  public String description() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer descriptionAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer descriptionInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public long field02() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateField02(long field_02) { int o = __offset(8); if (o != 0) { bb.putLong(o + bb_pos, field_02); return true; } else { return false; } }
  public long field03() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateField03(long field_03) { int o = __offset(10); if (o != 0) { bb.putInt(o + bb_pos, (int)field_03); return true; } else { return false; } }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementZoneStaticObjectUnknown field04() { return field04(new com.dabomstew.pkrandom.generated.swsh.SwShPlacementZoneStaticObjectUnknown()); }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementZoneStaticObjectUnknown field04(com.dabomstew.pkrandom.generated.swsh.SwShPlacementZoneStaticObjectUnknown obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createSwShPlacementZoneStaticObjectSpawn(FlatBufferBuilder builder,
      long spawn_id,
      int descriptionOffset,
      long field_02,
      long field_03,
      int field_04Offset) {
    builder.startTable(5);
    SwShPlacementZoneStaticObjectSpawn.addField02(builder, field_02);
    SwShPlacementZoneStaticObjectSpawn.addSpawnId(builder, spawn_id);
    SwShPlacementZoneStaticObjectSpawn.addField04(builder, field_04Offset);
    SwShPlacementZoneStaticObjectSpawn.addField03(builder, field_03);
    SwShPlacementZoneStaticObjectSpawn.addDescription(builder, descriptionOffset);
    return SwShPlacementZoneStaticObjectSpawn.endSwShPlacementZoneStaticObjectSpawn(builder);
  }

  public static void startSwShPlacementZoneStaticObjectSpawn(FlatBufferBuilder builder) { builder.startTable(5); }
  public static void addSpawnId(FlatBufferBuilder builder, long spawnId) { builder.addLong(0, spawnId, 0L); }
  public static void addDescription(FlatBufferBuilder builder, int descriptionOffset) { builder.addOffset(1, descriptionOffset, 0); }
  public static void addField02(FlatBufferBuilder builder, long field02) { builder.addLong(2, field02, 0L); }
  public static void addField03(FlatBufferBuilder builder, long field03) { builder.addInt(3, (int)field03, (int)0L); }
  public static void addField04(FlatBufferBuilder builder, int field04Offset) { builder.addOffset(4, field04Offset, 0); }
  public static int endSwShPlacementZoneStaticObjectSpawn(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SwShPlacementZoneStaticObjectSpawn get(int j) { return get(new SwShPlacementZoneStaticObjectSpawn(), j); }
    public SwShPlacementZoneStaticObjectSpawn get(SwShPlacementZoneStaticObjectSpawn obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

