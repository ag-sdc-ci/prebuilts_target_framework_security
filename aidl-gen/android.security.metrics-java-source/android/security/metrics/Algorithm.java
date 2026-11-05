/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/android.security.metrics-java-source -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl -I /home/shadichy/Documents/bliss/los-21/system/hardware/interfaces/keystore2/aidl/aidl_api/android.system.keystore2/4 -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl/android/security/metrics/Algorithm.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.metrics;
/**
 * Algorithm enum as defined in stats/enums/system/security/keystore2/enums.proto.
 * @hide
 */
public @interface Algorithm {
  /** ALGORITHM is prepended because UNSPECIFIED exists in other enums as well. */
  public static final int ALGORITHM_UNSPECIFIED = 0;
  /** Asymmetric algorithms. */
  public static final int RSA = 1;
  /** 2 removed, do not reuse. */
  public static final int EC = 3;
  /** Block cipher algorithms. */
  public static final int AES = 32;
  public static final int TRIPLE_DES = 33;
  /** MAC algorithms. */
  public static final int HMAC = 128;
}
