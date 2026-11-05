/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/credstore -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder/android/security/identity/AccessControlProfileParcel.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.identity;
/** @hide */
public class AccessControlProfileParcel implements android.os.Parcelable
{
  public int id = 0;
  public byte[] readerCertificate;
  public boolean userAuthenticationRequired = false;
  public long userAuthenticationTimeoutMillis = 0L;
  public static final android.os.Parcelable.Creator<AccessControlProfileParcel> CREATOR = new android.os.Parcelable.Creator<AccessControlProfileParcel>() {
    @Override
    public AccessControlProfileParcel createFromParcel(android.os.Parcel _aidl_source) {
      AccessControlProfileParcel _aidl_out = new AccessControlProfileParcel();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public AccessControlProfileParcel[] newArray(int _aidl_size) {
      return new AccessControlProfileParcel[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(id);
    _aidl_parcel.writeByteArray(readerCertificate);
    _aidl_parcel.writeInt(((userAuthenticationRequired)?(1):(0)));
    _aidl_parcel.writeLong(userAuthenticationTimeoutMillis);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      id = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      readerCertificate = _aidl_parcel.createByteArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      userAuthenticationRequired = (0!=_aidl_parcel.readInt());
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      userAuthenticationTimeoutMillis = _aidl_parcel.readLong();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
