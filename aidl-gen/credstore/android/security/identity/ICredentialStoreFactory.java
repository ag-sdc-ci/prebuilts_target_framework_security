/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/credstore -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder/android/security/identity/ICredentialStoreFactory.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.identity;
/** @hide */
public interface ICredentialStoreFactory extends android.os.IInterface
{
  /** Default implementation for ICredentialStoreFactory. */
  public static class Default implements android.security.identity.ICredentialStoreFactory
  {
    @Override public android.security.identity.ICredentialStore getCredentialStore(int credentialStoreType) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.security.identity.ICredentialStoreFactory
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.security.identity.ICredentialStoreFactory interface,
     * generating a proxy if needed.
     */
    public static android.security.identity.ICredentialStoreFactory asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.security.identity.ICredentialStoreFactory))) {
        return ((android.security.identity.ICredentialStoreFactory)iin);
      }
      return new android.security.identity.ICredentialStoreFactory.Stub.Proxy(obj);
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
        case TRANSACTION_getCredentialStore:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.security.identity.ICredentialStore _result = this.getCredentialStore(_arg0);
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
    private static final class Proxy implements android.security.identity.ICredentialStoreFactory
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
      @Override public android.security.identity.ICredentialStore getCredentialStore(int credentialStoreType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.security.identity.ICredentialStore _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(credentialStoreType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCredentialStore, _data, _reply, 0);
          _reply.readException();
          _result = android.security.identity.ICredentialStore.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getCredentialStore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.security.identity.ICredentialStoreFactory";
  public static final int CREDENTIAL_STORE_TYPE_DEFAULT = 0;
  public static final int CREDENTIAL_STORE_TYPE_DIRECT_ACCESS = 1;
  public android.security.identity.ICredentialStore getCredentialStore(int credentialStoreType) throws android.os.RemoteException;
}
