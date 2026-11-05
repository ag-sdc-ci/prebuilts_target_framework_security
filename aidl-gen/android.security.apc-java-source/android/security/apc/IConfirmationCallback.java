/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl-gen/android.security.apc-java-source -I /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/system/security/aidl/android/security/apc/IConfirmationCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.security.apc;
/**
 * This callback interface must be implemented by the client to receive the result of the user
 * confirmation.
 * @hide
 */
public interface IConfirmationCallback extends android.os.IInterface
{
  /** Default implementation for IConfirmationCallback. */
  public static class Default implements android.security.apc.IConfirmationCallback
  {
    /**
     * This callback gets called by the implementing service when a pending confirmation prompt
     * gets finalized.
     * @deprecated Android Protected Confirmation had a low adoption rate among Android device
     *             makers and developers alike. Given the lack of devices supporting the feature,
     *             it is deprecated. Developers can use auth-bound Keystore keys as a partial
     *             replacement.
     * 
     * @param result
     *  - ResponseCode.OK On success. In this case dataConfirmed must be non null.
     *  - ResponseCode.CANCELLED If the user cancelled the prompt. In this case dataConfirmed must
     *           be null.
     *  - ResponseCode.ABORTED If the client called IProtectedConfirmation.cancelPrompt() or if the
     *           prompt was cancelled by the system due to an asynchronous event. In this case
     *           dataConfirmed must be null.
     * 
     * @param dataConfirmed This is the message that was confirmed and for which a confirmation
     *           token is now available in implementing service. A subsequent attempt to sign this
     *           message with a confirmation bound key will succeed. The message is a CBOR map
     *           including the prompt text and the extra data.
     */
    @Deprecated
    @Override public void onCompleted(int result, byte[] dataConfirmed) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.security.apc.IConfirmationCallback
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.security.apc.IConfirmationCallback interface,
     * generating a proxy if needed.
     */
    public static android.security.apc.IConfirmationCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.security.apc.IConfirmationCallback))) {
        return ((android.security.apc.IConfirmationCallback)iin);
      }
      return new android.security.apc.IConfirmationCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onCompleted:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          this.onCompleted(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.security.apc.IConfirmationCallback
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
      /**
       * This callback gets called by the implementing service when a pending confirmation prompt
       * gets finalized.
       * @deprecated Android Protected Confirmation had a low adoption rate among Android device
       *             makers and developers alike. Given the lack of devices supporting the feature,
       *             it is deprecated. Developers can use auth-bound Keystore keys as a partial
       *             replacement.
       * 
       * @param result
       *  - ResponseCode.OK On success. In this case dataConfirmed must be non null.
       *  - ResponseCode.CANCELLED If the user cancelled the prompt. In this case dataConfirmed must
       *           be null.
       *  - ResponseCode.ABORTED If the client called IProtectedConfirmation.cancelPrompt() or if the
       *           prompt was cancelled by the system due to an asynchronous event. In this case
       *           dataConfirmed must be null.
       * 
       * @param dataConfirmed This is the message that was confirmed and for which a confirmation
       *           token is now available in implementing service. A subsequent attempt to sign this
       *           message with a confirmation bound key will succeed. The message is a CBOR map
       *           including the prompt text and the extra data.
       */
      @Deprecated
      @Override public void onCompleted(int result, byte[] dataConfirmed) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(result);
          _data.writeByteArray(dataConfirmed);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCompleted, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android.security.apc.IConfirmationCallback";
  /**
   * This callback gets called by the implementing service when a pending confirmation prompt
   * gets finalized.
   * @deprecated Android Protected Confirmation had a low adoption rate among Android device
   *             makers and developers alike. Given the lack of devices supporting the feature,
   *             it is deprecated. Developers can use auth-bound Keystore keys as a partial
   *             replacement.
   * 
   * @param result
   *  - ResponseCode.OK On success. In this case dataConfirmed must be non null.
   *  - ResponseCode.CANCELLED If the user cancelled the prompt. In this case dataConfirmed must
   *           be null.
   *  - ResponseCode.ABORTED If the client called IProtectedConfirmation.cancelPrompt() or if the
   *           prompt was cancelled by the system due to an asynchronous event. In this case
   *           dataConfirmed must be null.
   * 
   * @param dataConfirmed This is the message that was confirmed and for which a confirmation
   *           token is now available in implementing service. A subsequent attempt to sign this
   *           message with a confirmation bound key will succeed. The message is a CBOR map
   *           including the prompt text and the extra data.
   */
  @Deprecated
  public void onCompleted(int result, byte[] dataConfirmed) throws android.os.RemoteException;
}
