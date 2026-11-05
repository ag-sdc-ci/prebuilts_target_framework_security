/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/credstore -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/identity/binder/android/security/identity/ISession.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.identity;
/** @hide */
public interface ISession extends android.os.IInterface
{
  /** Default implementation for ISession. */
  public static class Default implements android.security.identity.ISession
  {
    @Override public byte[] getEphemeralKeyPair() throws android.os.RemoteException
    {
      return null;
    }
    @Override public long getAuthChallenge() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public void setReaderEphemeralPublicKey(byte[] publicKey) throws android.os.RemoteException
    {
    }
    @Override public void setSessionTranscript(byte[] sessionTranscript) throws android.os.RemoteException
    {
    }
    @Override public android.security.identity.ICredential getCredentialForPresentation(java.lang.String credentialName) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.security.identity.ISession
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.security.identity.ISession interface,
     * generating a proxy if needed.
     */
    public static android.security.identity.ISession asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.security.identity.ISession))) {
        return ((android.security.identity.ISession)iin);
      }
      return new android.security.identity.ISession.Stub.Proxy(obj);
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
        case TRANSACTION_getEphemeralKeyPair:
        {
          byte[] _result = this.getEphemeralKeyPair();
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_getAuthChallenge:
        {
          long _result = this.getAuthChallenge();
          reply.writeNoException();
          reply.writeLong(_result);
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
        case TRANSACTION_setSessionTranscript:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.setSessionTranscript(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getCredentialForPresentation:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.security.identity.ICredential _result = this.getCredentialForPresentation(_arg0);
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
    private static final class Proxy implements android.security.identity.ISession
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
      @Override public byte[] getEphemeralKeyPair() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getEphemeralKeyPair, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long getAuthChallenge() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAuthChallenge, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readLong();
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
      @Override public void setSessionTranscript(byte[] sessionTranscript) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(sessionTranscript);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSessionTranscript, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.security.identity.ICredential getCredentialForPresentation(java.lang.String credentialName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.security.identity.ICredential _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(credentialName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCredentialForPresentation, _data, _reply, 0);
          _reply.readException();
          _result = android.security.identity.ICredential.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getEphemeralKeyPair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getAuthChallenge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setReaderEphemeralPublicKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setSessionTranscript = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getCredentialForPresentation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.security.identity.ISession";
  public byte[] getEphemeralKeyPair() throws android.os.RemoteException;
  public long getAuthChallenge() throws android.os.RemoteException;
  public void setReaderEphemeralPublicKey(byte[] publicKey) throws android.os.RemoteException;
  public void setSessionTranscript(byte[] sessionTranscript) throws android.os.RemoteException;
  public android.security.identity.ICredential getCredentialForPresentation(java.lang.String credentialName) throws android.os.RemoteException;
}
