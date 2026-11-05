/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/android.security.metrics-java-source -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl -I /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/4 -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl/android/security/metrics/HardwareAuthenticatorType.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.metrics;
/**
 * HardwareAuthenticatorType enum as defined in Keystore2KeyCreationWithAuthInfo of
 * frameworks/proto_logging/stats/atoms.proto.
 * @hide
 */
public @interface HardwareAuthenticatorType {
  /** Unspecified takes 0. Other values are incremented by 1 compared to keymint spec. */
  public static final int AUTH_TYPE_UNSPECIFIED = 0;
  public static final int NONE = 1;
  public static final int PASSWORD = 2;
  public static final int FINGERPRINT = 3;
  public static final int ANY = 5;
}
