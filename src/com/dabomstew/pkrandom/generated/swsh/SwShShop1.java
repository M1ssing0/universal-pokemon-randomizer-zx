// automatically generated by the FlatBuffers compiler, do not modify

package com.dabomstew.pkrandom.generated.swsh;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class SwShShop1 extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SwShShop1 getRootAsSwShShop1(ByteBuffer _bb) { return getRootAsSwShShop1(_bb, new SwShShop1()); }
  public static SwShShop1 getRootAsSwShShop1(ByteBuffer _bb, SwShShop1 obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SwShShop1 __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long hash() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateHash(long hash) { int o = __offset(4); if (o != 0) { bb.putLong(o + bb_pos, hash); return true; } else { return false; } }
  public com.dabomstew.pkrandom.generated.swsh.SwShInventory inventory() { return inventory(new com.dabomstew.pkrandom.generated.swsh.SwShInventory()); }
  public com.dabomstew.pkrandom.generated.swsh.SwShInventory inventory(com.dabomstew.pkrandom.generated.swsh.SwShInventory obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createSwShShop1(FlatBufferBuilder builder,
      long hash,
      int inventoryOffset) {
    builder.startTable(2);
    SwShShop1.addHash(builder, hash);
    SwShShop1.addInventory(builder, inventoryOffset);
    return SwShShop1.endSwShShop1(builder);
  }

  public static void startSwShShop1(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addHash(FlatBufferBuilder builder, long hash) { builder.addLong(0, hash, 0L); }
  public static void addInventory(FlatBufferBuilder builder, int inventoryOffset) { builder.addOffset(1, inventoryOffset, 0); }
  public static int endSwShShop1(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SwShShop1 get(int j) { return get(new SwShShop1(), j); }
    public SwShShop1 get(SwShShop1 obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

