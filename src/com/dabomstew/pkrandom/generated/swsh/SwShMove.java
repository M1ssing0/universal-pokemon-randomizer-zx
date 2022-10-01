// automatically generated by the FlatBuffers compiler, do not modify

package com.dabomstew.pkrandom.generated.swsh;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@javax.annotation.Generated(value="flatc")
@SuppressWarnings("unused")
public final class SwShMove extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static SwShMove getRootAsSwShMove(ByteBuffer _bb) { return getRootAsSwShMove(_bb, new SwShMove()); }
  public static SwShMove getRootAsSwShMove(ByteBuffer _bb, SwShMove obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public SwShMove __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long version() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateVersion(long version) { int o = __offset(4); if (o != 0) { bb.putInt(o + bb_pos, (int)version); return true; } else { return false; } }
  public long moveId() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateMoveId(long move_id) { int o = __offset(6); if (o != 0) { bb.putInt(o + bb_pos, (int)move_id); return true; } else { return false; } }
  public boolean canUseMove() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateCanUseMove(boolean can_use_move) { int o = __offset(8); if (o != 0) { bb.put(o + bb_pos, (byte)(can_use_move ? 1 : 0)); return true; } else { return false; } }
  public int type() { int o = __offset(10); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateType(int type) { int o = __offset(10); if (o != 0) { bb.put(o + bb_pos, (byte)type); return true; } else { return false; } }
  public int quality() { int o = __offset(12); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateQuality(int quality) { int o = __offset(12); if (o != 0) { bb.put(o + bb_pos, (byte)quality); return true; } else { return false; } }
  public int category() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateCategory(int category) { int o = __offset(14); if (o != 0) { bb.put(o + bb_pos, (byte)category); return true; } else { return false; } }
  public int power() { int o = __offset(16); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutatePower(int power) { int o = __offset(16); if (o != 0) { bb.put(o + bb_pos, (byte)power); return true; } else { return false; } }
  public int accuracy() { int o = __offset(18); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateAccuracy(int accuracy) { int o = __offset(18); if (o != 0) { bb.put(o + bb_pos, (byte)accuracy); return true; } else { return false; } }
  public int pp() { int o = __offset(20); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutatePp(int pp) { int o = __offset(20); if (o != 0) { bb.put(o + bb_pos, (byte)pp); return true; } else { return false; } }
  public int priority() { int o = __offset(22); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutatePriority(int priority) { int o = __offset(22); if (o != 0) { bb.put(o + bb_pos, (byte)priority); return true; } else { return false; } }
  public int hitMin() { int o = __offset(24); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateHitMin(int hit_min) { int o = __offset(24); if (o != 0) { bb.put(o + bb_pos, (byte)hit_min); return true; } else { return false; } }
  public int hitMax() { int o = __offset(26); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateHitMax(int hit_max) { int o = __offset(26); if (o != 0) { bb.put(o + bb_pos, (byte)hit_max); return true; } else { return false; } }
  public int inflict() { int o = __offset(28); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public boolean mutateInflict(int inflict) { int o = __offset(28); if (o != 0) { bb.putShort(o + bb_pos, (short)inflict); return true; } else { return false; } }
  public int inflictPercent() { int o = __offset(30); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateInflictPercent(int inflict_percent) { int o = __offset(30); if (o != 0) { bb.put(o + bb_pos, (byte)inflict_percent); return true; } else { return false; } }
  public int rawInflictCount() { int o = __offset(32); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateRawInflictCount(int raw_inflict_count) { int o = __offset(32); if (o != 0) { bb.put(o + bb_pos, (byte)raw_inflict_count); return true; } else { return false; } }
  public int turnMin() { int o = __offset(34); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateTurnMin(int turn_min) { int o = __offset(34); if (o != 0) { bb.put(o + bb_pos, (byte)turn_min); return true; } else { return false; } }
  public int turnMax() { int o = __offset(36); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateTurnMax(int turn_max) { int o = __offset(36); if (o != 0) { bb.put(o + bb_pos, (byte)turn_max); return true; } else { return false; } }
  public int critStage() { int o = __offset(38); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateCritStage(int crit_stage) { int o = __offset(38); if (o != 0) { bb.put(o + bb_pos, (byte)crit_stage); return true; } else { return false; } }
  public int flinch() { int o = __offset(40); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateFlinch(int flinch) { int o = __offset(40); if (o != 0) { bb.put(o + bb_pos, (byte)flinch); return true; } else { return false; } }
  public int effectSequence() { int o = __offset(42); return o != 0 ? bb.getShort(o + bb_pos) & 0xFFFF : 0; }
  public boolean mutateEffectSequence(int effect_sequence) { int o = __offset(42); if (o != 0) { bb.putShort(o + bb_pos, (short)effect_sequence); return true; } else { return false; } }
  public int recoil() { int o = __offset(44); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateRecoil(int recoil) { int o = __offset(44); if (o != 0) { bb.put(o + bb_pos, (byte)recoil); return true; } else { return false; } }
  public int rawHealing() { int o = __offset(46); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateRawHealing(int raw_healing) { int o = __offset(46); if (o != 0) { bb.put(o + bb_pos, (byte)raw_healing); return true; } else { return false; } }
  public int rawTarget() { int o = __offset(48); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateRawTarget(int raw_target) { int o = __offset(48); if (o != 0) { bb.put(o + bb_pos, (byte)raw_target); return true; } else { return false; } }
  public int stat1() { int o = __offset(50); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateStat1(int stat1) { int o = __offset(50); if (o != 0) { bb.put(o + bb_pos, (byte)stat1); return true; } else { return false; } }
  public int stat2() { int o = __offset(52); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateStat2(int stat2) { int o = __offset(52); if (o != 0) { bb.put(o + bb_pos, (byte)stat2); return true; } else { return false; } }
  public int stat3() { int o = __offset(54); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateStat3(int stat3) { int o = __offset(54); if (o != 0) { bb.put(o + bb_pos, (byte)stat3); return true; } else { return false; } }
  public int stat1Stage() { int o = __offset(56); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateStat1Stage(int stat1_stage) { int o = __offset(56); if (o != 0) { bb.put(o + bb_pos, (byte)stat1_stage); return true; } else { return false; } }
  public int stat2Stage() { int o = __offset(58); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateStat2Stage(int stat2_stage) { int o = __offset(58); if (o != 0) { bb.put(o + bb_pos, (byte)stat2_stage); return true; } else { return false; } }
  public int stat3Stage() { int o = __offset(60); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateStat3Stage(int stat3_stage) { int o = __offset(60); if (o != 0) { bb.put(o + bb_pos, (byte)stat3_stage); return true; } else { return false; } }
  public int stat1Percent() { int o = __offset(62); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateStat1Percent(int stat1_percent) { int o = __offset(62); if (o != 0) { bb.put(o + bb_pos, (byte)stat1_percent); return true; } else { return false; } }
  public int stat2Percent() { int o = __offset(64); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateStat2Percent(int stat2_percent) { int o = __offset(64); if (o != 0) { bb.put(o + bb_pos, (byte)stat2_percent); return true; } else { return false; } }
  public int stat3Percent() { int o = __offset(66); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateStat3Percent(int stat3_percent) { int o = __offset(66); if (o != 0) { bb.put(o + bb_pos, (byte)stat3_percent); return true; } else { return false; } }
  public int gigantamaxPower() { int o = __offset(68); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateGigantamaxPower(int gigantamax_power) { int o = __offset(68); if (o != 0) { bb.put(o + bb_pos, (byte)gigantamax_power); return true; } else { return false; } }
  public boolean flagMakesContact() { int o = __offset(70); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagMakesContact(boolean flag_makes_contact) { int o = __offset(70); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_makes_contact ? 1 : 0)); return true; } else { return false; } }
  public boolean flagCharge() { int o = __offset(72); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagCharge(boolean flag_charge) { int o = __offset(72); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_charge ? 1 : 0)); return true; } else { return false; } }
  public boolean flagRecharge() { int o = __offset(74); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagRecharge(boolean flag_recharge) { int o = __offset(74); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_recharge ? 1 : 0)); return true; } else { return false; } }
  public boolean flagProtect() { int o = __offset(76); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagProtect(boolean flag_protect) { int o = __offset(76); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_protect ? 1 : 0)); return true; } else { return false; } }
  public boolean flagReflectable() { int o = __offset(78); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagReflectable(boolean flag_reflectable) { int o = __offset(78); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_reflectable ? 1 : 0)); return true; } else { return false; } }
  public boolean flagSnatch() { int o = __offset(80); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagSnatch(boolean flag_snatch) { int o = __offset(80); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_snatch ? 1 : 0)); return true; } else { return false; } }
  public boolean flagMirror() { int o = __offset(82); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagMirror(boolean flag_mirror) { int o = __offset(82); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_mirror ? 1 : 0)); return true; } else { return false; } }
  public boolean flagPunch() { int o = __offset(84); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagPunch(boolean flag_punch) { int o = __offset(84); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_punch ? 1 : 0)); return true; } else { return false; } }
  public boolean flagSound() { int o = __offset(86); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagSound(boolean flag_sound) { int o = __offset(86); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_sound ? 1 : 0)); return true; } else { return false; } }
  public boolean flagGravity() { int o = __offset(88); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagGravity(boolean flag_gravity) { int o = __offset(88); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_gravity ? 1 : 0)); return true; } else { return false; } }
  public boolean flagDefrost() { int o = __offset(90); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagDefrost(boolean flag_defrost) { int o = __offset(90); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_defrost ? 1 : 0)); return true; } else { return false; } }
  public boolean flagDistanceTriple() { int o = __offset(92); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagDistanceTriple(boolean flag_distance_triple) { int o = __offset(92); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_distance_triple ? 1 : 0)); return true; } else { return false; } }
  public boolean flagHeal() { int o = __offset(94); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagHeal(boolean flag_heal) { int o = __offset(94); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_heal ? 1 : 0)); return true; } else { return false; } }
  public boolean flagIgnoreSubstitute() { int o = __offset(96); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagIgnoreSubstitute(boolean flag_ignore_substitute) { int o = __offset(96); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_ignore_substitute ? 1 : 0)); return true; } else { return false; } }
  public boolean flagFailSkyBattle() { int o = __offset(98); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagFailSkyBattle(boolean flag_fail_sky_battle) { int o = __offset(98); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_fail_sky_battle ? 1 : 0)); return true; } else { return false; } }
  public boolean flagAnimateAlly() { int o = __offset(100); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagAnimateAlly(boolean flag_animate_ally) { int o = __offset(100); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_animate_ally ? 1 : 0)); return true; } else { return false; } }
  public boolean flagMetronome() { int o = __offset(102); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagMetronome(boolean flag_metronome) { int o = __offset(102); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_metronome ? 1 : 0)); return true; } else { return false; } }
  public boolean flagDance() { int o = __offset(104); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateFlagDance(boolean flag_dance) { int o = __offset(104); if (o != 0) { bb.put(o + bb_pos, (byte)(flag_dance ? 1 : 0)); return true; } else { return false; } }

  public static int createSwShMove(FlatBufferBuilder builder,
      long version,
      long move_id,
      boolean can_use_move,
      int type,
      int quality,
      int category,
      int power,
      int accuracy,
      int pp,
      int priority,
      int hit_min,
      int hit_max,
      int inflict,
      int inflict_percent,
      int raw_inflict_count,
      int turn_min,
      int turn_max,
      int crit_stage,
      int flinch,
      int effect_sequence,
      int recoil,
      int raw_healing,
      int raw_target,
      int stat1,
      int stat2,
      int stat3,
      int stat1_stage,
      int stat2_stage,
      int stat3_stage,
      int stat1_percent,
      int stat2_percent,
      int stat3_percent,
      int gigantamax_power,
      boolean flag_makes_contact,
      boolean flag_charge,
      boolean flag_recharge,
      boolean flag_protect,
      boolean flag_reflectable,
      boolean flag_snatch,
      boolean flag_mirror,
      boolean flag_punch,
      boolean flag_sound,
      boolean flag_gravity,
      boolean flag_defrost,
      boolean flag_distance_triple,
      boolean flag_heal,
      boolean flag_ignore_substitute,
      boolean flag_fail_sky_battle,
      boolean flag_animate_ally,
      boolean flag_metronome,
      boolean flag_dance) {
    builder.startTable(51);
    SwShMove.addMoveId(builder, move_id);
    SwShMove.addVersion(builder, version);
    SwShMove.addEffectSequence(builder, effect_sequence);
    SwShMove.addInflict(builder, inflict);
    SwShMove.addFlagDance(builder, flag_dance);
    SwShMove.addFlagMetronome(builder, flag_metronome);
    SwShMove.addFlagAnimateAlly(builder, flag_animate_ally);
    SwShMove.addFlagFailSkyBattle(builder, flag_fail_sky_battle);
    SwShMove.addFlagIgnoreSubstitute(builder, flag_ignore_substitute);
    SwShMove.addFlagHeal(builder, flag_heal);
    SwShMove.addFlagDistanceTriple(builder, flag_distance_triple);
    SwShMove.addFlagDefrost(builder, flag_defrost);
    SwShMove.addFlagGravity(builder, flag_gravity);
    SwShMove.addFlagSound(builder, flag_sound);
    SwShMove.addFlagPunch(builder, flag_punch);
    SwShMove.addFlagMirror(builder, flag_mirror);
    SwShMove.addFlagSnatch(builder, flag_snatch);
    SwShMove.addFlagReflectable(builder, flag_reflectable);
    SwShMove.addFlagProtect(builder, flag_protect);
    SwShMove.addFlagRecharge(builder, flag_recharge);
    SwShMove.addFlagCharge(builder, flag_charge);
    SwShMove.addFlagMakesContact(builder, flag_makes_contact);
    SwShMove.addGigantamaxPower(builder, gigantamax_power);
    SwShMove.addStat3Percent(builder, stat3_percent);
    SwShMove.addStat2Percent(builder, stat2_percent);
    SwShMove.addStat1Percent(builder, stat1_percent);
    SwShMove.addStat3Stage(builder, stat3_stage);
    SwShMove.addStat2Stage(builder, stat2_stage);
    SwShMove.addStat1Stage(builder, stat1_stage);
    SwShMove.addStat3(builder, stat3);
    SwShMove.addStat2(builder, stat2);
    SwShMove.addStat1(builder, stat1);
    SwShMove.addRawTarget(builder, raw_target);
    SwShMove.addRawHealing(builder, raw_healing);
    SwShMove.addRecoil(builder, recoil);
    SwShMove.addFlinch(builder, flinch);
    SwShMove.addCritStage(builder, crit_stage);
    SwShMove.addTurnMax(builder, turn_max);
    SwShMove.addTurnMin(builder, turn_min);
    SwShMove.addRawInflictCount(builder, raw_inflict_count);
    SwShMove.addInflictPercent(builder, inflict_percent);
    SwShMove.addHitMax(builder, hit_max);
    SwShMove.addHitMin(builder, hit_min);
    SwShMove.addPriority(builder, priority);
    SwShMove.addPp(builder, pp);
    SwShMove.addAccuracy(builder, accuracy);
    SwShMove.addPower(builder, power);
    SwShMove.addCategory(builder, category);
    SwShMove.addQuality(builder, quality);
    SwShMove.addType(builder, type);
    SwShMove.addCanUseMove(builder, can_use_move);
    return SwShMove.endSwShMove(builder);
  }

  public static void startSwShMove(FlatBufferBuilder builder) { builder.startTable(51); }
  public static void addVersion(FlatBufferBuilder builder, long version) { builder.addInt(0, (int)version, (int)0L); }
  public static void addMoveId(FlatBufferBuilder builder, long moveId) { builder.addInt(1, (int)moveId, (int)0L); }
  public static void addCanUseMove(FlatBufferBuilder builder, boolean canUseMove) { builder.addBoolean(2, canUseMove, false); }
  public static void addType(FlatBufferBuilder builder, int type) { builder.addByte(3, (byte)type, (byte)0); }
  public static void addQuality(FlatBufferBuilder builder, int quality) { builder.addByte(4, (byte)quality, (byte)0); }
  public static void addCategory(FlatBufferBuilder builder, int category) { builder.addByte(5, (byte)category, (byte)0); }
  public static void addPower(FlatBufferBuilder builder, int power) { builder.addByte(6, (byte)power, (byte)0); }
  public static void addAccuracy(FlatBufferBuilder builder, int accuracy) { builder.addByte(7, (byte)accuracy, (byte)0); }
  public static void addPp(FlatBufferBuilder builder, int pp) { builder.addByte(8, (byte)pp, (byte)0); }
  public static void addPriority(FlatBufferBuilder builder, int priority) { builder.addByte(9, (byte)priority, (byte)0); }
  public static void addHitMin(FlatBufferBuilder builder, int hitMin) { builder.addByte(10, (byte)hitMin, (byte)0); }
  public static void addHitMax(FlatBufferBuilder builder, int hitMax) { builder.addByte(11, (byte)hitMax, (byte)0); }
  public static void addInflict(FlatBufferBuilder builder, int inflict) { builder.addShort(12, (short)inflict, (short)0); }
  public static void addInflictPercent(FlatBufferBuilder builder, int inflictPercent) { builder.addByte(13, (byte)inflictPercent, (byte)0); }
  public static void addRawInflictCount(FlatBufferBuilder builder, int rawInflictCount) { builder.addByte(14, (byte)rawInflictCount, (byte)0); }
  public static void addTurnMin(FlatBufferBuilder builder, int turnMin) { builder.addByte(15, (byte)turnMin, (byte)0); }
  public static void addTurnMax(FlatBufferBuilder builder, int turnMax) { builder.addByte(16, (byte)turnMax, (byte)0); }
  public static void addCritStage(FlatBufferBuilder builder, int critStage) { builder.addByte(17, (byte)critStage, (byte)0); }
  public static void addFlinch(FlatBufferBuilder builder, int flinch) { builder.addByte(18, (byte)flinch, (byte)0); }
  public static void addEffectSequence(FlatBufferBuilder builder, int effectSequence) { builder.addShort(19, (short)effectSequence, (short)0); }
  public static void addRecoil(FlatBufferBuilder builder, int recoil) { builder.addByte(20, (byte)recoil, (byte)0); }
  public static void addRawHealing(FlatBufferBuilder builder, int rawHealing) { builder.addByte(21, (byte)rawHealing, (byte)0); }
  public static void addRawTarget(FlatBufferBuilder builder, int rawTarget) { builder.addByte(22, (byte)rawTarget, (byte)0); }
  public static void addStat1(FlatBufferBuilder builder, int stat1) { builder.addByte(23, (byte)stat1, (byte)0); }
  public static void addStat2(FlatBufferBuilder builder, int stat2) { builder.addByte(24, (byte)stat2, (byte)0); }
  public static void addStat3(FlatBufferBuilder builder, int stat3) { builder.addByte(25, (byte)stat3, (byte)0); }
  public static void addStat1Stage(FlatBufferBuilder builder, int stat1Stage) { builder.addByte(26, (byte)stat1Stage, (byte)0); }
  public static void addStat2Stage(FlatBufferBuilder builder, int stat2Stage) { builder.addByte(27, (byte)stat2Stage, (byte)0); }
  public static void addStat3Stage(FlatBufferBuilder builder, int stat3Stage) { builder.addByte(28, (byte)stat3Stage, (byte)0); }
  public static void addStat1Percent(FlatBufferBuilder builder, int stat1Percent) { builder.addByte(29, (byte)stat1Percent, (byte)0); }
  public static void addStat2Percent(FlatBufferBuilder builder, int stat2Percent) { builder.addByte(30, (byte)stat2Percent, (byte)0); }
  public static void addStat3Percent(FlatBufferBuilder builder, int stat3Percent) { builder.addByte(31, (byte)stat3Percent, (byte)0); }
  public static void addGigantamaxPower(FlatBufferBuilder builder, int gigantamaxPower) { builder.addByte(32, (byte)gigantamaxPower, (byte)0); }
  public static void addFlagMakesContact(FlatBufferBuilder builder, boolean flagMakesContact) { builder.addBoolean(33, flagMakesContact, false); }
  public static void addFlagCharge(FlatBufferBuilder builder, boolean flagCharge) { builder.addBoolean(34, flagCharge, false); }
  public static void addFlagRecharge(FlatBufferBuilder builder, boolean flagRecharge) { builder.addBoolean(35, flagRecharge, false); }
  public static void addFlagProtect(FlatBufferBuilder builder, boolean flagProtect) { builder.addBoolean(36, flagProtect, false); }
  public static void addFlagReflectable(FlatBufferBuilder builder, boolean flagReflectable) { builder.addBoolean(37, flagReflectable, false); }
  public static void addFlagSnatch(FlatBufferBuilder builder, boolean flagSnatch) { builder.addBoolean(38, flagSnatch, false); }
  public static void addFlagMirror(FlatBufferBuilder builder, boolean flagMirror) { builder.addBoolean(39, flagMirror, false); }
  public static void addFlagPunch(FlatBufferBuilder builder, boolean flagPunch) { builder.addBoolean(40, flagPunch, false); }
  public static void addFlagSound(FlatBufferBuilder builder, boolean flagSound) { builder.addBoolean(41, flagSound, false); }
  public static void addFlagGravity(FlatBufferBuilder builder, boolean flagGravity) { builder.addBoolean(42, flagGravity, false); }
  public static void addFlagDefrost(FlatBufferBuilder builder, boolean flagDefrost) { builder.addBoolean(43, flagDefrost, false); }
  public static void addFlagDistanceTriple(FlatBufferBuilder builder, boolean flagDistanceTriple) { builder.addBoolean(44, flagDistanceTriple, false); }
  public static void addFlagHeal(FlatBufferBuilder builder, boolean flagHeal) { builder.addBoolean(45, flagHeal, false); }
  public static void addFlagIgnoreSubstitute(FlatBufferBuilder builder, boolean flagIgnoreSubstitute) { builder.addBoolean(46, flagIgnoreSubstitute, false); }
  public static void addFlagFailSkyBattle(FlatBufferBuilder builder, boolean flagFailSkyBattle) { builder.addBoolean(47, flagFailSkyBattle, false); }
  public static void addFlagAnimateAlly(FlatBufferBuilder builder, boolean flagAnimateAlly) { builder.addBoolean(48, flagAnimateAlly, false); }
  public static void addFlagMetronome(FlatBufferBuilder builder, boolean flagMetronome) { builder.addBoolean(49, flagMetronome, false); }
  public static void addFlagDance(FlatBufferBuilder builder, boolean flagDance) { builder.addBoolean(50, flagDance, false); }
  public static int endSwShMove(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishSwShMoveBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedSwShMoveBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public SwShMove get(int j) { return get(new SwShMove(), j); }
    public SwShMove get(SwShMove obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

