/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/android.security.metrics-java-source -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl -I /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/4 -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl/android/security/metrics/Storage.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.metrics;
/**
 * Storage enum as defined in Keystore2StorageStats of frameworks/proto_logging/stats/atoms.proto.
 * @hide
 */
public @interface Storage {
  public static final int STORAGE_UNSPECIFIED = 0;
  public static final int KEY_ENTRY = 1;
  public static final int KEY_ENTRY_ID_INDEX = 2;
  public static final int KEY_ENTRY_DOMAIN_NAMESPACE_INDEX = 3;
  public static final int BLOB_ENTRY = 4;
  public static final int BLOB_ENTRY_KEY_ENTRY_ID_INDEX = 5;
  public static final int KEY_PARAMETER = 6;
  public static final int KEY_PARAMETER_KEY_ENTRY_ID_INDEX = 7;
  public static final int KEY_METADATA = 8;
  public static final int KEY_METADATA_KEY_ENTRY_ID_INDEX = 9;
  public static final int GRANT = 10;
  public static final int AUTH_TOKEN = 11;
  public static final int BLOB_METADATA = 12;
  public static final int BLOB_METADATA_BLOB_ENTRY_ID_INDEX = 13;
  public static final int METADATA = 14;
  public static final int DATABASE = 15;
  public static final int LEGACY_STORAGE = 16;
}
