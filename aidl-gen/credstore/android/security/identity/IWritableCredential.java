/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/credstore -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder/android/security/identity/IWritableCredential.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.identity;
/** @hide */
public interface IWritableCredential extends android.os.IInterface
{
  /** Default implementation for IWritableCredential. */
  public static class Default implements android.security.identity.IWritableCredential
  {
    @Override public byte[] getCredentialKeyCertificateChain(byte[] challenge) throws android.os.RemoteException
    {
      return null;
    }
    @Override public byte[] personalize(android.security.identity.AccessControlProfileParcel[] accessControlProfiles, android.security.identity.EntryNamespaceParcel[] entryNamespaces, long secureUserId) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.security.identity.IWritableCredential
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.security.identity.IWritableCredential interface,
     * generating a proxy if needed.
     */
    public static android.security.identity.IWritableCredential asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.security.identity.IWritableCredential))) {
        return ((android.security.identity.IWritableCredential)iin);
      }
      return new android.security.identity.IWritableCredential.Stub.Proxy(obj);
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
        case TRANSACTION_getCredentialKeyCertificateChain:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _result = this.getCredentialKeyCertificateChain(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_personalize:
        {
          android.security.identity.AccessControlProfileParcel[] _arg0;
          _arg0 = data.createTypedArray(android.security.identity.AccessControlProfileParcel.CREATOR);
          android.security.identity.EntryNamespaceParcel[] _arg1;
          _arg1 = data.createTypedArray(android.security.identity.EntryNamespaceParcel.CREATOR);
          long _arg2;
          _arg2 = data.readLong();
          byte[] _result = this.personalize(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.security.identity.IWritableCredential
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
      @Override public byte[] getCredentialKeyCertificateChain(byte[] challenge) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(challenge);
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
      @Override public byte[] personalize(android.security.identity.AccessControlProfileParcel[] accessControlProfiles, android.security.identity.EntryNamespaceParcel[] entryNamespaces, long secureUserId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedArray(accessControlProfiles, 0);
          _data.writeTypedArray(entryNamespaces, 0);
          _data.writeLong(secureUserId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_personalize, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getCredentialKeyCertificateChain = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_personalize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.security.identity.IWritableCredential";
  public byte[] getCredentialKeyCertificateChain(byte[] challenge) throws android.os.RemoteException;
  public byte[] personalize(android.security.identity.AccessControlProfileParcel[] accessControlProfiles, android.security.identity.EntryNamespaceParcel[] entryNamespaces, long secureUserId) throws android.os.RemoteException;
}
