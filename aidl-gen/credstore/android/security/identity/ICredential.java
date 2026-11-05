/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/credstore -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder/android/security/identity/ICredential.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.identity;
/** @hide */
public interface ICredential extends android.os.IInterface
{
  /** Default implementation for ICredential. */
  public static class Default implements android.security.identity.ICredential
  {
    @Override public byte[] createEphemeralKeyPair() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setReaderEphemeralPublicKey(byte[] publicKey) throws android.os.RemoteException
    {
    }
    @Override public byte[] deleteCredential() throws android.os.RemoteException
    {
      return null;
    }
    @Override public byte[] deleteWithChallenge(byte[] challenge) throws android.os.RemoteException
    {
      return null;
    }
    @Override public byte[] proveOwnership(byte[] challenge) throws android.os.RemoteException
    {
      return null;
    }
    @Override public byte[] getCredentialKeyCertificateChain() throws android.os.RemoteException
    {
      return null;
    }
    @Override public long selectAuthKey(boolean allowUsingExhaustedKeys, boolean allowUsingExpiredKeys, boolean incrementUsageCount) throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public android.security.identity.GetEntriesResultParcel getEntries(byte[] requestMessage, android.security.identity.RequestNamespaceParcel[] requestNamespaces, byte[] sessionTranscript, byte[] readerSignature, boolean allowUsingExhaustedKeys, boolean allowUsingExpiredKeys, boolean incrementUsageCount) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void setAvailableAuthenticationKeys(int keyCount, int maxUsesPerKey, long minValidTimeMillis) throws android.os.RemoteException
    {
    }
    @Override public android.security.identity.AuthKeyParcel[] getAuthKeysNeedingCertification() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void storeStaticAuthenticationData(android.security.identity.AuthKeyParcel authenticationKey, byte[] staticAuthData) throws android.os.RemoteException
    {
    }
    @Override public void storeStaticAuthenticationDataWithExpiration(android.security.identity.AuthKeyParcel authenticationKey, long expirationDateMillisSinceEpoch, byte[] staticAuthData) throws android.os.RemoteException
    {
    }
    @Override public int[] getAuthenticationDataUsageCount() throws android.os.RemoteException
    {
      return null;
    }
    @Override public long[] getAuthenticationDataExpirations() throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.security.identity.IWritableCredential update() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.security.identity.ICredential
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.security.identity.ICredential interface,
     * generating a proxy if needed.
     */
    public static android.security.identity.ICredential asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.security.identity.ICredential))) {
        return ((android.security.identity.ICredential)iin);
      }
      return new android.security.identity.ICredential.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_createEphemeralKeyPair:
        {
          byte[] _result = this.createEphemeralKeyPair();
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_setReaderEphemeralPublicKey:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.setReaderEphemeralPublicKey(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_deleteCredential:
        {
          byte[] _result = this.deleteCredential();
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_deleteWithChallenge:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _result = this.deleteWithChallenge(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_proveOwnership:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _result = this.proveOwnership(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_getCredentialKeyCertificateChain:
        {
          byte[] _result = this.getCredentialKeyCertificateChain();
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_selectAuthKey:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          long _result = this.selectAuthKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeLong(_result);
          break;
        }
        case TRANSACTION_getEntries:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          android.security.identity.RequestNamespaceParcel[] _arg1;
          _arg1 = data.createTypedArray(android.security.identity.RequestNamespaceParcel.CREATOR);
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          boolean _arg4;
          _arg4 = (0!=data.readInt());
          boolean _arg5;
          _arg5 = (0!=data.readInt());
          boolean _arg6;
          _arg6 = (0!=data.readInt());
          android.security.identity.GetEntriesResultParcel _result = this.getEntries(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_setAvailableAuthenticationKeys:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          long _arg2;
          _arg2 = data.readLong();
          this.setAvailableAuthenticationKeys(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getAuthKeysNeedingCertification:
        {
          android.security.identity.AuthKeyParcel[] _result = this.getAuthKeysNeedingCertification();
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_storeStaticAuthenticationData:
        {
          android.security.identity.AuthKeyParcel _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.security.identity.AuthKeyParcel.CREATOR);
          byte[] _arg1;
          _arg1 = data.createByteArray();
          this.storeStaticAuthenticationData(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_storeStaticAuthenticationDataWithExpiration:
        {
          android.security.identity.AuthKeyParcel _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.security.identity.AuthKeyParcel.CREATOR);
          long _arg1;
          _arg1 = data.readLong();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          this.storeStaticAuthenticationDataWithExpiration(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getAuthenticationDataUsageCount:
        {
          int[] _result = this.getAuthenticationDataUsageCount();
          reply.writeNoException();
          reply.writeIntArray(_result);
          break;
        }
        case TRANSACTION_getAuthenticationDataExpirations:
        {
          long[] _result = this.getAuthenticationDataExpirations();
          reply.writeNoException();
          reply.writeLongArray(_result);
          break;
        }
        case TRANSACTION_update:
        {
          android.security.identity.IWritableCredential _result = this.update();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.security.identity.ICredential
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public byte[] createEphemeralKeyPair() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createEphemeralKeyPair, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setReaderEphemeralPublicKey(byte[] publicKey) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(publicKey);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setReaderEphemeralPublicKey, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public byte[] deleteCredential() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteCredential, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public byte[] deleteWithChallenge(byte[] challenge) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(challenge);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteWithChallenge, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public byte[] proveOwnership(byte[] challenge) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(challenge);
          boolean _status = mRemote.transact(Stub.TRANSACTION_proveOwnership, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public byte[] getCredentialKeyCertificateChain() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCredentialKeyCertificateChain, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long selectAuthKey(boolean allowUsingExhaustedKeys, boolean allowUsingExpiredKeys, boolean incrementUsageCount) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((allowUsingExhaustedKeys)?(1):(0)));
          _data.writeInt(((allowUsingExpiredKeys)?(1):(0)));
          _data.writeInt(((incrementUsageCount)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_selectAuthKey, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.security.identity.GetEntriesResultParcel getEntries(byte[] requestMessage, android.security.identity.RequestNamespaceParcel[] requestNamespaces, byte[] sessionTranscript, byte[] readerSignature, boolean allowUsingExhaustedKeys, boolean allowUsingExpiredKeys, boolean incrementUsageCount) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.security.identity.GetEntriesResultParcel _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(requestMessage);
          _data.writeTypedArray(requestNamespaces, 0);
          _data.writeByteArray(sessionTranscript);
          _data.writeByteArray(readerSignature);
          _data.writeInt(((allowUsingExhaustedKeys)?(1):(0)));
          _data.writeInt(((allowUsingExpiredKeys)?(1):(0)));
          _data.writeInt(((incrementUsageCount)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getEntries, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.security.identity.GetEntriesResultParcel.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setAvailableAuthenticationKeys(int keyCount, int maxUsesPerKey, long minValidTimeMillis) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyCount);
          _data.writeInt(maxUsesPerKey);
          _data.writeLong(minValidTimeMillis);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAvailableAuthenticationKeys, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.security.identity.AuthKeyParcel[] getAuthKeysNeedingCertification() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.security.identity.AuthKeyParcel[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAuthKeysNeedingCertification, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArray(android.security.identity.AuthKeyParcel.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void storeStaticAuthenticationData(android.security.identity.AuthKeyParcel authenticationKey, byte[] staticAuthData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, authenticationKey, 0);
          _data.writeByteArray(staticAuthData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_storeStaticAuthenticationData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void storeStaticAuthenticationDataWithExpiration(android.security.identity.AuthKeyParcel authenticationKey, long expirationDateMillisSinceEpoch, byte[] staticAuthData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, authenticationKey, 0);
          _data.writeLong(expirationDateMillisSinceEpoch);
          _data.writeByteArray(staticAuthData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_storeStaticAuthenticationDataWithExpiration, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int[] getAuthenticationDataUsageCount() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAuthenticationDataUsageCount, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createIntArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long[] getAuthenticationDataExpirations() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAuthenticationDataExpirations, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createLongArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.security.identity.IWritableCredential update() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.security.identity.IWritableCredential _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_update, _data, _reply, 0);
          _reply.readException();
          _result = android.security.identity.IWritableCredential.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_createEphemeralKeyPair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setReaderEphemeralPublicKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_deleteCredential = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_deleteWithChallenge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_proveOwnership = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getCredentialKeyCertificateChain = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_selectAuthKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getEntries = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_setAvailableAuthenticationKeys = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getAuthKeysNeedingCertification = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_storeStaticAuthenticationData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_storeStaticAuthenticationDataWithExpiration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getAuthenticationDataUsageCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getAuthenticationDataExpirations = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_update = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.security.identity.ICredential";
  /**
   * The STATUS_* constants are used in the status field in ResultEntryParcel.
   * Keep in sync with ResultNamespace.java.
   */
  public static final int STATUS_OK = 0;
  public static final int STATUS_NO_SUCH_ENTRY = 1;
  public static final int STATUS_NOT_REQUESTED = 2;
  public static final int STATUS_NOT_IN_REQUEST_MESSAGE = 3;
  public static final int STATUS_USER_AUTHENTICATION_FAILED = 4;
  public static final int STATUS_READER_AUTHENTICATION_FAILED = 5;
  public static final int STATUS_NO_ACCESS_CONTROL_PROFILES = 6;
  public byte[] createEphemeralKeyPair() throws android.os.RemoteException;
  public void setReaderEphemeralPublicKey(byte[] publicKey) throws android.os.RemoteException;
  public byte[] deleteCredential() throws android.os.RemoteException;
  public byte[] deleteWithChallenge(byte[] challenge) throws android.os.RemoteException;
  public byte[] proveOwnership(byte[] challenge) throws android.os.RemoteException;
  public byte[] getCredentialKeyCertificateChain() throws android.os.RemoteException;
  public long selectAuthKey(boolean allowUsingExhaustedKeys, boolean allowUsingExpiredKeys, boolean incrementUsageCount) throws android.os.RemoteException;
  public android.security.identity.GetEntriesResultParcel getEntries(byte[] requestMessage, android.security.identity.RequestNamespaceParcel[] requestNamespaces, byte[] sessionTranscript, byte[] readerSignature, boolean allowUsingExhaustedKeys, boolean allowUsingExpiredKeys, boolean incrementUsageCount) throws android.os.RemoteException;
  public void setAvailableAuthenticationKeys(int keyCount, int maxUsesPerKey, long minValidTimeMillis) throws android.os.RemoteException;
  public android.security.identity.AuthKeyParcel[] getAuthKeysNeedingCertification() throws android.os.RemoteException;
  public void storeStaticAuthenticationData(android.security.identity.AuthKeyParcel authenticationKey, byte[] staticAuthData) throws android.os.RemoteException;
  public void storeStaticAuthenticationDataWithExpiration(android.security.identity.AuthKeyParcel authenticationKey, long expirationDateMillisSinceEpoch, byte[] staticAuthData) throws android.os.RemoteException;
  public int[] getAuthenticationDataUsageCount() throws android.os.RemoteException;
  public long[] getAuthenticationDataExpirations() throws android.os.RemoteException;
  public android.security.identity.IWritableCredential update() throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
