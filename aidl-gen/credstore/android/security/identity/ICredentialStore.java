/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/credstore -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder/android/security/identity/ICredentialStore.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.identity;
/** @hide */
public interface ICredentialStore extends android.os.IInterface
{
  /** Default implementation for ICredentialStore. */
  public static class Default implements android.security.identity.ICredentialStore
  {
    @Override public android.security.identity.SecurityHardwareInfoParcel getSecurityHardwareInfo() throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.security.identity.IWritableCredential createCredential(java.lang.String credentialName, java.lang.String docType) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.security.identity.ICredential getCredentialByName(java.lang.String credentialName, int cipherSuite) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.security.identity.ISession createPresentationSession(int cipherSuite) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.security.identity.ICredentialStore
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.security.identity.ICredentialStore interface,
     * generating a proxy if needed.
     */
    public static android.security.identity.ICredentialStore asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.security.identity.ICredentialStore))) {
        return ((android.security.identity.ICredentialStore)iin);
      }
      return new android.security.identity.ICredentialStore.Stub.Proxy(obj);
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
        case TRANSACTION_getSecurityHardwareInfo:
        {
          android.security.identity.SecurityHardwareInfoParcel _result = this.getSecurityHardwareInfo();
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_createCredential:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.security.identity.IWritableCredential _result = this.createCredential(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getCredentialByName:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.security.identity.ICredential _result = this.getCredentialByName(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_createPresentationSession:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.security.identity.ISession _result = this.createPresentationSession(_arg0);
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
    private static final class Proxy implements android.security.identity.ICredentialStore
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
      @Override public android.security.identity.SecurityHardwareInfoParcel getSecurityHardwareInfo() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.security.identity.SecurityHardwareInfoParcel _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSecurityHardwareInfo, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.security.identity.SecurityHardwareInfoParcel.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.security.identity.IWritableCredential createCredential(java.lang.String credentialName, java.lang.String docType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.security.identity.IWritableCredential _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(credentialName);
          _data.writeString(docType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createCredential, _data, _reply, 0);
          _reply.readException();
          _result = android.security.identity.IWritableCredential.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.security.identity.ICredential getCredentialByName(java.lang.String credentialName, int cipherSuite) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.security.identity.ICredential _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(credentialName);
          _data.writeInt(cipherSuite);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCredentialByName, _data, _reply, 0);
          _reply.readException();
          _result = android.security.identity.ICredential.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.security.identity.ISession createPresentationSession(int cipherSuite) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.security.identity.ISession _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cipherSuite);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createPresentationSession, _data, _reply, 0);
          _reply.readException();
          _result = android.security.identity.ISession.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getSecurityHardwareInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_createCredential = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getCredentialByName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_createPresentationSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.security.identity.ICredentialStore";
  /**
   * All binder calls may return a ServiceSpecificException
   * with the following error codes:
   */
  public static final int ERROR_NONE = 0;
  public static final int ERROR_GENERIC = 1;
  public static final int ERROR_ALREADY_PERSONALIZED = 2;
  public static final int ERROR_NO_SUCH_CREDENTIAL = 3;
  public static final int ERROR_CIPHER_SUITE_NOT_SUPPORTED = 4;
  public static final int ERROR_EPHEMERAL_PUBLIC_KEY_NOT_FOUND = 5;
  public static final int ERROR_NO_AUTHENTICATION_KEY_AVAILABLE = 6;
  public static final int ERROR_INVALID_READER_SIGNATURE = 7;
  public static final int ERROR_DOCUMENT_TYPE_NOT_SUPPORTED = 8;
  public static final int ERROR_AUTHENTICATION_KEY_NOT_FOUND = 9;
  public static final int ERROR_INVALID_ITEMS_REQUEST_MESSAGE = 10;
  public static final int ERROR_SESSION_TRANSCRIPT_MISMATCH = 11;
  public static final int ERROR_NOT_SUPPORTED = 12;
  public android.security.identity.SecurityHardwareInfoParcel getSecurityHardwareInfo() throws android.os.RemoteException;
  public android.security.identity.IWritableCredential createCredential(java.lang.String credentialName, java.lang.String docType) throws android.os.RemoteException;
  public android.security.identity.ICredential getCredentialByName(java.lang.String credentialName, int cipherSuite) throws android.os.RemoteException;
  public android.security.identity.ISession createPresentationSession(int cipherSuite) throws android.os.RemoteException;
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
