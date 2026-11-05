/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/android.security.metrics-java-source -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl -I /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/4 -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl/android/security/metrics/SecurityLevel.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.metrics;
/**
 * SecurityLevel enum as defined in stats/enums/system/security/keystore2/enums.proto.
 * @hide
 */
public @interface SecurityLevel {
  /** Unspecified takes 0. Other values are incremented by 1 compared to keymint spec. */
  public static final int SECURITY_LEVEL_UNSPECIFIED = 0;
  public static final int SECURITY_LEVEL_SOFTWARE = 1;
  public static final int SECURITY_LEVEL_TRUSTED_ENVIRONMENT = 2;
  public static final int SECURITY_LEVEL_STRONGBOX = 3;
  public static final int SECURITY_LEVEL_KEYSTORE = 4;
}
