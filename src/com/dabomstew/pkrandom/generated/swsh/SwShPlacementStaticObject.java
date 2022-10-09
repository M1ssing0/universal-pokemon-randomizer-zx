// automatically generated by the FlatBuffers compiler, do not modify

package com.dabomstew.pkrandom.generated.swsh;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class SwShPlacementStaticObject extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SwShPlacementStaticObject getRootAsSwShPlacementStaticObject(ByteBuffer _bb) { return getRootAsSwShPlacementStaticObject(_bb, new SwShPlacementStaticObject()); }
  public static SwShPlacementStaticObject getRootAsSwShPlacementStaticObject(ByteBuffer _bb, SwShPlacementStaticObject obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SwShPlacementStaticObject __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectIdentifier identifier() { return identifier(new com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectIdentifier()); }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectIdentifier identifier(com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectIdentifier obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public long field01() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateField01(long field_01) { int o = __offset(6); if (o != 0) { bb.putInt(o + bb_pos, (int)field_01); return true; } else { return false; } }
  public long field02() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateField02(long field_02) { int o = __offset(8); if (o != 0) { bb.putInt(o + bb_pos, (int)field_02); return true; } else { return false; } }
  public long field03() { int o = __offset(10); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateField03(long field_03) { int o = __offset(10); if (o != 0) { bb.putInt(o + bb_pos, (int)field_03); return true; } else { return false; } }
  public int field04() { int o = __offset(12); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateField04(int field_04) { int o = __offset(12); if (o != 0) { bb.put(o + bb_pos, (byte)field_04); return true; } else { return false; } }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectSpawn spawns(int j) { return spawns(new com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectSpawn(), j); }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectSpawn spawns(com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectSpawn obj, int j) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int spawnsLength() { int o = __offset(14); return o != 0 ? __vector_len(o) : 0; }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectSpawn.Vector spawnsVector() { return spawnsVector(new com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectSpawn.Vector()); }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectSpawn.Vector spawnsVector(com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectSpawn.Vector obj) { int o = __offset(14); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectUnknown field06() { return field06(new com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectUnknown()); }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectUnknown field06(com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectUnknown obj) { int o = __offset(16); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectUnknown field07() { return field07(new com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectUnknown()); }
  public com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectUnknown field07(com.dabomstew.pkrandom.generated.swsh.SwShPlacementStaticObjectUnknown obj) { int o = __offset(18); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createSwShPlacementStaticObject(FlatBufferBuilder builder,
      int identifierOffset,
      long field_01,
      long field_02,
      long field_03,
      int field_04,
      int spawnsOffset,
      int field_06Offset,
      int field_07Offset) {
    builder.startTable(8);
    SwShPlacementStaticObject.addField07(builder, field_07Offset);
    SwShPlacementStaticObject.addField06(builder, field_06Offset);
    SwShPlacementStaticObject.addSpawns(builder, spawnsOffset);
    SwShPlacementStaticObject.addField03(builder, field_03);
    SwShPlacementStaticObject.addField02(builder, field_02);
    SwShPlacementStaticObject.addField01(builder, field_01);
    SwShPlacementStaticObject.addIdentifier(builder, identifierOffset);
    SwShPlacementStaticObject.addField04(builder, field_04);
    return SwShPlacementStaticObject.endSwShPlacementStaticObject(builder);
  }

  public static void startSwShPlacementStaticObject(FlatBufferBuilder builder) { builder.startTable(8); }
  public static void addIdentifier(FlatBufferBuilder builder, int identifierOffset) { builder.addOffset(0, identifierOffset, 0); }
  public static void addField01(FlatBufferBuilder builder, long field01) { builder.addInt(1, (int)field01, (int)0L); }
  public static void addField02(FlatBufferBuilder builder, long field02) { builder.addInt(2, (int)field02, (int)0L); }
  public static void addField03(FlatBufferBuilder builder, long field03) { builder.addInt(3, (int)field03, (int)0L); }
  public static void addField04(FlatBufferBuilder builder, int field04) { builder.addByte(4, (byte)field04, (byte)0); }
  public static void addSpawns(FlatBufferBuilder builder, int spawnsOffset) { builder.addOffset(5, spawnsOffset, 0); }
  public static int createSpawnsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startSpawnsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addField06(FlatBufferBuilder builder, int field06Offset) { builder.addOffset(6, field06Offset, 0); }
  public static void addField07(FlatBufferBuilder builder, int field07Offset) { builder.addOffset(7, field07Offset, 0); }
  public static int endSwShPlacementStaticObject(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SwShPlacementStaticObject get(int j) { return get(new SwShPlacementStaticObject(), j); }
    public SwShPlacementStaticObject get(SwShPlacementStaticObject obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

