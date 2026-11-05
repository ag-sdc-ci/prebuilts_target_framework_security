/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/credstore -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder/android/security/identity/GetEntriesResultParcel.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.identity;
/** @hide */
public class GetEntriesResultParcel implements android.os.Parcelable
{
  public android.security.identity.ResultNamespaceParcel[] resultNamespaces;
  public byte[] deviceNameSpaces;
  public byte[] mac;
  public byte[] staticAuthenticationData;
  public byte[] signature;
  public static final android.os.Parcelable.Creator<GetEntriesResultParcel> CREATOR = new android.os.Parcelable.Creator<GetEntriesResultParcel>() {
    @Override
    public GetEntriesResultParcel createFromParcel(android.os.Parcel _aidl_source) {
      GetEntriesResultParcel _aidl_out = new GetEntriesResultParcel();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public GetEntriesResultParcel[] newArray(int _aidl_size) {
      return new GetEntriesResultParcel[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeTypedArray(resultNamespaces, _aidl_flag);
    _aidl_parcel.writeByteArray(deviceNameSpaces);
    _aidl_parcel.writeByteArray(mac);
    _aidl_parcel.writeByteArray(staticAuthenticationData);
    _aidl_parcel.writeByteArray(signature);
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
      resultNamespaces = _aidl_parcel.createTypedArray(android.security.identity.ResultNamespaceParcel.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      deviceNameSpaces = _aidl_parcel.createByteArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mac = _aidl_parcel.createByteArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      staticAuthenticationData = _aidl_parcel.createByteArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      signature = _aidl_parcel.createByteArray();
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
    _mask |= describeContents(resultNamespaces);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof Object[]) {
      int _mask = 0;
      for (Object o : (Object[]) _v) {
        _mask |= describeContents(o);
      }
      return _mask;
    }
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}
