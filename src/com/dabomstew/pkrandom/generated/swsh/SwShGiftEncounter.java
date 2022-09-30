// automatically generated by the FlatBuffers compiler, do not modify

package com.dabomstew.pkrandom.generated.swsh;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class SwShGiftEncounter extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SwShGiftEncounter getRootAsSwShGiftEncounter(ByteBuffer _bb) { return getRootAsSwShGiftEncounter(_bb, new SwShGiftEncounter()); }
  public static SwShGiftEncounter getRootAsSwShGiftEncounter(ByteBuffer _bb, SwShGiftEncounter obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SwShGiftEncounter __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public int isEgg() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateIsEgg(int is_egg) { int o = __offset(4); if (o != 0) { bb.putInt(o + bb_pos, is_egg); return true; } else { return false; } }
  public int form() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateForm(int form) { int o = __offset(6); if (o != 0) { bb.put(o + bb_pos, (byte)form); return true; } else { return false; } }
  public int dynamaxLevel() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateDynamaxLevel(int dynamax_level) { int o = __offset(8); if (o != 0) { bb.put(o + bb_pos, (byte)dynamax_level); return true; } else { return false; } }
  public int ballItemId() { int o = __offset(10); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateBallItemId(int ball_item_id) { int o = __offset(10); if (o != 0) { bb.putInt(o + bb_pos, ball_item_id); return true; } else { return false; } }
  public int field04() { int o = __offset(12); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateField04(int field_04) { int o = __offset(12); if (o != 0) { bb.put(o + bb_pos, (byte)field_04); return true; } else { return false; } }
  public long hash1() { int o = __offset(14); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateHash1(long hash1) { int o = __offset(14); if (o != 0) { bb.putLong(o + bb_pos, hash1); return true; } else { return false; } }
  public boolean gmaxFactor() { int o = __offset(16); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateGmaxFactor(boolean gmax_factor) { int o = __offset(16); if (o != 0) { bb.put(o + bb_pos, (byte)(gmax_factor ? 1 : 0)); return true; } else { return false; } }
  public int heldItem() { int o = __offset(18); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateHeldItem(int held_item) { int o = __offset(18); if (o != 0) { bb.putInt(o + bb_pos, held_item); return true; } else { return false; } }
  public int level() { int o = __offset(20); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateLevel(int level) { int o = __offset(20); if (o != 0) { bb.put(o + bb_pos, (byte)level); return true; } else { return false; } }
  public int species() { int o = __offset(22); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateSpecies(int species) { int o = __offset(22); if (o != 0) { bb.putInt(o + bb_pos, species); return true; } else { return false; } }
  public int field0a() { int o = __offset(24); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateField0a(int field_0a) { int o = __offset(24); if (o != 0) { bb.put(o + bb_pos, (byte)field_0a); return true; } else { return false; } }
  public int memoryCode() { int o = __offset(26); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateMemoryCode(int memory_code) { int o = __offset(26); if (o != 0) { bb.put(o + bb_pos, (byte)memory_code); return true; } else { return false; } }
  public int memoryData() { int o = __offset(28); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public boolean mutateMemoryData(int memory_data) { int o = __offset(28); if (o != 0) { bb.putShort(o + bb_pos, (short)memory_data); return true; } else { return false; } }
  public int memoryFeel() { int o = __offset(30); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateMemoryFeel(int memory_feel) { int o = __offset(30); if (o != 0) { bb.put(o + bb_pos, (byte)memory_feel); return true; } else { return false; } }
  public int memoryLevel() { int o = __offset(32); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateMemoryLevel(int memory_level) { int o = __offset(32); if (o != 0) { bb.put(o + bb_pos, (byte)memory_level); return true; } else { return false; } }
  public long otNameId() { int o = __offset(34); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateOtNameId(long ot_name_id) { int o = __offset(34); if (o != 0) { bb.putLong(o + bb_pos, ot_name_id); return true; } else { return false; } }
  public int otGender() { int o = __offset(36); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateOtGender(int ot_gender) { int o = __offset(36); if (o != 0) { bb.putInt(o + bb_pos, ot_gender); return true; } else { return false; } }
  public int shinyLock() { int o = __offset(38); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateShinyLock(int shiny_lock) { int o = __offset(38); if (o != 0) { bb.putInt(o + bb_pos, shiny_lock); return true; } else { return false; } }
  public int nature() { int o = __offset(40); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateNature(int nature) { int o = __offset(40); if (o != 0) { bb.putInt(o + bb_pos, nature); return true; } else { return false; } }
  public int gender() { int o = __offset(42); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateGender(int gender) { int o = __offset(42); if (o != 0) { bb.put(o + bb_pos, (byte)gender); return true; } else { return false; } }
  public byte ivSpe() { int o = __offset(44); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean mutateIvSpe(byte iv_spe) { int o = __offset(44); if (o != 0) { bb.put(o + bb_pos, iv_spe); return true; } else { return false; } }
  public byte ivAtk() { int o = __offset(46); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean mutateIvAtk(byte iv_atk) { int o = __offset(46); if (o != 0) { bb.put(o + bb_pos, iv_atk); return true; } else { return false; } }
  public byte ivDef() { int o = __offset(48); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean mutateIvDef(byte iv_def) { int o = __offset(48); if (o != 0) { bb.put(o + bb_pos, iv_def); return true; } else { return false; } }
  public byte ivHp() { int o = __offset(50); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean mutateIvHp(byte iv_hp) { int o = __offset(50); if (o != 0) { bb.put(o + bb_pos, iv_hp); return true; } else { return false; } }
  public byte ivSpa() { int o = __offset(52); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean mutateIvSpa(byte iv_spa) { int o = __offset(52); if (o != 0) { bb.put(o + bb_pos, iv_spa); return true; } else { return false; } }
  public byte ivSpd() { int o = __offset(54); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public boolean mutateIvSpd(byte iv_spd) { int o = __offset(54); if (o != 0) { bb.put(o + bb_pos, iv_spd); return true; } else { return false; } }
  public int ability() { int o = __offset(56); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateAbility(int ability) { int o = __offset(56); if (o != 0) { bb.putInt(o + bb_pos, ability); return true; } else { return false; } }
  public int specialMove() { int o = __offset(58); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateSpecialMove(int special_move) { int o = __offset(58); if (o != 0) { bb.putInt(o + bb_pos, special_move); return true; } else { return false; } }

  public static int createSwShGiftEncounter(FlatBufferBuilder builder,
      int is_egg,
      int form,
      int dynamax_level,
      int ball_item_id,
      int field_04,
      long hash1,
      boolean gmax_factor,
      int held_item,
      int level,
      int species,
      int field_0a,
      int memory_code,
      int memory_data,
      int memory_feel,
      int memory_level,
      long ot_name_id,
      int ot_gender,
      int shiny_lock,
      int nature,
      int gender,
      byte iv_spe,
      byte iv_atk,
      byte iv_def,
      byte iv_hp,
      byte iv_spa,
      byte iv_spd,
      int ability,
      int special_move) {
    builder.startTable(28);
    SwShGiftEncounter.addOtNameId(builder, ot_name_id);
    SwShGiftEncounter.addHash1(builder, hash1);
    SwShGiftEncounter.addSpecialMove(builder, special_move);
    SwShGiftEncounter.addAbility(builder, ability);
    SwShGiftEncounter.addNature(builder, nature);
    SwShGiftEncounter.addShinyLock(builder, shiny_lock);
    SwShGiftEncounter.addOtGender(builder, ot_gender);
    SwShGiftEncounter.addSpecies(builder, species);
    SwShGiftEncounter.addHeldItem(builder, held_item);
    SwShGiftEncounter.addBallItemId(builder, ball_item_id);
    SwShGiftEncounter.addIsEgg(builder, is_egg);
    SwShGiftEncounter.addMemoryData(builder, memory_data);
    SwShGiftEncounter.addIvSpd(builder, iv_spd);
    SwShGiftEncounter.addIvSpa(builder, iv_spa);
    SwShGiftEncounter.addIvHp(builder, iv_hp);
    SwShGiftEncounter.addIvDef(builder, iv_def);
    SwShGiftEncounter.addIvAtk(builder, iv_atk);
    SwShGiftEncounter.addIvSpe(builder, iv_spe);
    SwShGiftEncounter.addGender(builder, gender);
    SwShGiftEncounter.addMemoryLevel(builder, memory_level);
    SwShGiftEncounter.addMemoryFeel(builder, memory_feel);
    SwShGiftEncounter.addMemoryCode(builder, memory_code);
    SwShGiftEncounter.addField0a(builder, field_0a);
    SwShGiftEncounter.addLevel(builder, level);
    SwShGiftEncounter.addGmaxFactor(builder, gmax_factor);
    SwShGiftEncounter.addField04(builder, field_04);
    SwShGiftEncounter.addDynamaxLevel(builder, dynamax_level);
    SwShGiftEncounter.addForm(builder, form);
    return SwShGiftEncounter.endSwShGiftEncounter(builder);
  }

  public static void startSwShGiftEncounter(FlatBufferBuilder builder) { builder.startTable(28); }
  public static void addIsEgg(FlatBufferBuilder builder, int isEgg) { builder.addInt(0, isEgg, 0); }
  public static void addForm(FlatBufferBuilder builder, int form) { builder.addByte(1, (byte)form, (byte)0); }
  public static void addDynamaxLevel(FlatBufferBuilder builder, int dynamaxLevel) { builder.addByte(2, (byte)dynamaxLevel, (byte)0); }
  public static void addBallItemId(FlatBufferBuilder builder, int ballItemId) { builder.addInt(3, ballItemId, 0); }
  public static void addField04(FlatBufferBuilder builder, int field04) { builder.addByte(4, (byte)field04, (byte)0); }
  public static void addHash1(FlatBufferBuilder builder, long hash1) { builder.addLong(5, hash1, 0L); }
  public static void addGmaxFactor(FlatBufferBuilder builder, boolean gmaxFactor) { builder.addBoolean(6, gmaxFactor, false); }
  public static void addHeldItem(FlatBufferBuilder builder, int heldItem) { builder.addInt(7, heldItem, 0); }
  public static void addLevel(FlatBufferBuilder builder, int level) { builder.addByte(8, (byte)level, (byte)0); }
  public static void addSpecies(FlatBufferBuilder builder, int species) { builder.addInt(9, species, 0); }
  public static void addField0a(FlatBufferBuilder builder, int field0a) { builder.addByte(10, (byte)field0a, (byte)0); }
  public static void addMemoryCode(FlatBufferBuilder builder, int memoryCode) { builder.addByte(11, (byte)memoryCode, (byte)0); }
  public static void addMemoryData(FlatBufferBuilder builder, int memoryData) { builder.addShort(12, (short)memoryData, (short)0); }
  public static void addMemoryFeel(FlatBufferBuilder builder, int memoryFeel) { builder.addByte(13, (byte)memoryFeel, (byte)0); }
  public static void addMemoryLevel(FlatBufferBuilder builder, int memoryLevel) { builder.addByte(14, (byte)memoryLevel, (byte)0); }
  public static void addOtNameId(FlatBufferBuilder builder, long otNameId) { builder.addLong(15, otNameId, 0L); }
  public static void addOtGender(FlatBufferBuilder builder, int otGender) { builder.addInt(16, otGender, 0); }
  public static void addShinyLock(FlatBufferBuilder builder, int shinyLock) { builder.addInt(17, shinyLock, 0); }
  public static void addNature(FlatBufferBuilder builder, int nature) { builder.addInt(18, nature, 0); }
  public static void addGender(FlatBufferBuilder builder, int gender) { builder.addByte(19, (byte)gender, (byte)0); }
  public static void addIvSpe(FlatBufferBuilder builder, byte ivSpe) { builder.addByte(20, ivSpe, 0); }
  public static void addIvAtk(FlatBufferBuilder builder, byte ivAtk) { builder.addByte(21, ivAtk, 0); }
  public static void addIvDef(FlatBufferBuilder builder, byte ivDef) { builder.addByte(22, ivDef, 0); }
  public static void addIvHp(FlatBufferBuilder builder, byte ivHp) { builder.addByte(23, ivHp, 0); }
  public static void addIvSpa(FlatBufferBuilder builder, byte ivSpa) { builder.addByte(24, ivSpa, 0); }
  public static void addIvSpd(FlatBufferBuilder builder, byte ivSpd) { builder.addByte(25, ivSpd, 0); }
  public static void addAbility(FlatBufferBuilder builder, int ability) { builder.addInt(26, ability, 0); }
  public static void addSpecialMove(FlatBufferBuilder builder, int specialMove) { builder.addInt(27, specialMove, 0); }
  public static int endSwShGiftEncounter(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SwShGiftEncounter get(int j) { return get(new SwShGiftEncounter(), j); }
    public SwShGiftEncounter get(SwShGiftEncounter obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

